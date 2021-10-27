package net.wangjifeng.kpring.commons.knum

import java.math.BigDecimal
import java.math.BigInteger
import kotlin.reflect.KClass

/**
 * @author: wjf
 * @date: 2021/10/27 10:51
 *
 * @see KnumFunSignature K枚举的函数签名，类似Java方法签名。knum的扩展函数必须是无参有返回值函数。
 */

val returnTypeContainer = mutableListOf<KClass<*>>(
    Int::class, Long::class, String::class, Boolean::class,
    BigDecimal::class, BigInteger::class,
)

class KnumFunSignature<T : Any> private constructor() {

    var funName: String = ""

    var returnType: KClass<T>? = null

    var varName: String = ""

    fun invoke(knum: Knum): T? {
        this.varName.apply {
            if (this.isBlank()) {
                throw IllegalArgumentException("KnumFunSignature.varName 不能是null或者空字符串。")
            }
        }
        if (this.funName.isBlank() || this.returnType == null) {
            return null
        }
        val knumClass = knum::class.java
        val method = knumClass.getMethod(this.funName)
        @Suppress("UNCHECKED_CAST")
        return method.invoke(knum) as T?
    }

    companion object {

        fun <T : Any> knumFunSignatureOf(funName: String, returnType: KClass<T>, varName: String): KnumFunSignature<T> {
            if (!returnTypeContainer.contains(returnType)) {
                throw IllegalArgumentException(
                    """
                        KnumFunSignature.knumFunSignatureOf()函数的参数returnType只能是这些类型: 
                        [int, long, string, boolean, bigDecimal, bigInt]。
                    """.trimIndent()
                )
            }
            val knumFunSignature = KnumFunSignature<T>()
            knumFunSignature.apply {
                this.funName = funName
                this.returnType = returnType
                this.varName = varName
            }
            return knumFunSignature
        }

    }

}