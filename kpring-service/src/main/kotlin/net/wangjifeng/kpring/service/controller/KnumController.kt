package net.wangjifeng.kpring.service.controller

import net.wangjifeng.kpring.commons.knum.Knum
import net.wangjifeng.kpring.commons.knum.KnumFinder
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

/**
 * @author: wjf
 * @date: 2021/6/9 11:17
 *
 * @see KnumController knum相关的通用路由控制器。
 */
@RestController
@RequestMapping("/knum")
class KnumController {

    @Resource
    private lateinit var knumFinder: KnumFinder

    @RequestMapping("/knums")
    fun knums(): Map<String, List<Knum>> {
        return knumFinder.finding()
    }

}