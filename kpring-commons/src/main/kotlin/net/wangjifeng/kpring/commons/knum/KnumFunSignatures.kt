package net.wangjifeng.kpring.commons.knum

import java.lang.reflect.Method
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

    var varName: String = ""

    fun invoke(knum: Knum): T? {
        this.varName.apply {
            if (this.isBlank()) {
                throw IllegalArgumentException("KnumFunSignature.varName 不能是null或者空字符串。")
            }
        }
        if (this.funName.isBlank()) {
            return null
        }
        @Suppress("UNCHECKED_CAST")
        return getKnumFun(knum::class).invoke(knum) as T?
    }

    fun getKnumFun(knumClass: KClass<out Knum>): Method {
        return knumClass.java.getMethod(this.funName)
    }

    companion object {

        fun <T : Any> knumFunSignatureOf(funName: String, varName: String): KnumFunSignature<T> {
            val knumFunSignature = KnumFunSignature<T>()
            knumFunSignature.apply {
                this.funName = funName
                this.varName = varName
            }
            return knumFunSignature
        }

    }

}