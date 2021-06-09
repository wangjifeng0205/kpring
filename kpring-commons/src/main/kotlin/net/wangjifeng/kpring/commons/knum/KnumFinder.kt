package net.wangjifeng.kpring.commons.knum

/**
 * @author: wjf
 * @date: 2021/6/9 10:46
 *
 * @see KnumFinder knum查找器。
 */
interface KnumFinder {

    fun finding(): Map<String, List<Knum>>

}