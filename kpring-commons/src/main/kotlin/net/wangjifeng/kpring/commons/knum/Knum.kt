package net.wangjifeng.kpring.commons.knum

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize

/**
 * @author: wjf
 * @date: 2021/6/7 15:25
 *
 * @see Knum K枚举接口，用于特定枚举的序列化。
 */
@JsonSerialize(using = KnumJsonSerializer::class)
@JsonDeserialize(using = KnumJsonDeserializer::class)
interface Knum {

    /**
     * 含义描述信息。
     */
    val description: String

    /**
     * 返回枚举的描述信息，一般是枚举常量的含义描述信息。
     */
    fun description(): String = description

    /**
     * 返回枚举常量的名称。
     */
    fun knumName(): String = (this as Enum<*>).name

    /**
     * 返回枚举常量的定义顺序值。
     */
    fun knumOrdinal(): Int = (this as Enum<*>).ordinal

}