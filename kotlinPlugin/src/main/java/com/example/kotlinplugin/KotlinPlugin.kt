package com.example.kotlinplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 *
 * @ProjectName:    TestPluginKotlin
 * @Package:        com.example.kotlinplugin
 * @ClassName:      KotlinPlugin
 * @Description:     java类作用描述
 * @Author:         tianfy
 * @CreateDate:     2023/6/28 21:03
 * @UpdateUser:     更新者：
 * @UpdateDate:     2023/6/28 21:03
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class KotlinPlugin : Plugin<Project> {
    override fun apply(projct: Project) {
        println("${projct.name} apply success")
    }
}