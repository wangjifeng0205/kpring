package net.wangjifeng.kpring.commons.knum

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.databind.BeanProperty
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.ContextualDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import java.io.IOException
import java.math.BigDecimal
import java.math.BigInteger

/**
 * @author: wjf
 * @date: 2021/6/7 15:32
 *
 * 此文件主要描述Knum的序列化和反序列化方式。
 *
 * @see KnumJsonSerializer: knum的序列化器。
 * @see KnumJsonDeserializer: knum的反序列化器。
 */
class KnumJsonSerializer : StdSerializer<Knum>(Knum::class.java) {

    override fun serialize(knum: Knum, jsonGenerator: JsonGenerator, serializerProvider: SerializerProvider) {
        jsonGenerator.writeStartObject()
        jsonGenerator.writeFieldName("ordinal")
        jsonGenerator.writeNumber(knum.knumOrdinal())
        jsonGenerator.writeFieldName("name")
        jsonGenerator.writeString(knum.knumName())
        jsonGenerator.writeFieldName("description")
        jsonGenerator.writeString(knum.description())

        val knumFunSignatures = knum.knumFunSignatures()
        if (knumFunSignatures.isNotEmpty()) {
            knumFunSignatures.forEach {
                jsonGenerator.writeFieldName(it.varName)
                when (it.returnType) {
                    Int::class -> jsonGenerator.writeNumber(it.invoke(knum) as Int)
                    Long::class -> jsonGenerator.writeNumber(it.invoke(knum) as Long)
                    String::class -> jsonGenerator.writeString(it.invoke(knum) as String)
                    Boolean::class -> jsonGenerator.writeBoolean(it.invoke(knum) as Boolean)
                    BigDecimal::class -> jsonGenerator.writeNumber(it.invoke(knum) as BigDecimal)
                    BigInteger::class -> jsonGenerator.writeNumber(it.invoke(knum) as BigInteger)
                }
            }
        }

        jsonGenerator.writeEndObject()
    }

}

class KnumJsonDeserializer : JsonDeserializer<Knum>(), ContextualDeserializer {

    private lateinit var knumMap: HashMap<String, Knum>

    override fun deserialize(jsonParser: JsonParser, cxt: DeserializationContext): Knum? {
        return knumMap[name(jsonParser)]
    }

    @Suppress("UNCHECKED_CAST")
    override fun createContextual(cxt: DeserializationContext, property: BeanProperty): JsonDeserializer<*> {
        val type = property.type
        val clazz = type.rawClass

        val enumValues = (clazz as Class<Enum<*>>).enumConstants ?: throw IllegalArgumentException("没有一个枚举常量在类 [${clazz.name}] 中。")

        val map = HashMap<String, Enum<*>>()
        for (enumValue in enumValues) {
            map[enumValue.name] = enumValue
        }

        val deserializer = KnumJsonDeserializer()
        deserializer.initKnumMap(map)
        return deserializer
    }

    @Throws(IOException::class)
    private fun name(jsonParser: JsonParser): String {
        var jsonToken = jsonParser.currentToken()
        var name: String
        if (jsonToken == JsonToken.START_OBJECT) {
            while (!jsonParser.isClosed && jsonToken != JsonToken.END_OBJECT) {
                jsonToken = jsonParser.nextToken()
                if (jsonToken == JsonToken.FIELD_NAME && "name" == jsonParser.currentName) {
                    jsonParser.nextToken()
                    name = jsonParser.valueAsString
                }
            }
            throw UnsupportedOperationException("不是一个Knum: [${jsonToken.name}]。")
        } else {
            name = jsonParser.valueAsString
        }
        return name
    }

    private fun initKnumMap(enumMap: HashMap<String, Enum<*>>): HashMap<String, Knum> {
        knumMap = HashMap<String, Knum>().apply {
            if (enumMap.isNotEmpty()) {
                enumMap.asSequence().map { this[it.key] = it.value as Knum }
            }
        }
        return knumMap
    }

}