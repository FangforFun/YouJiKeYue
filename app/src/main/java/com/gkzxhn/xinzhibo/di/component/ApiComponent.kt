package com.gkzxhn.xinzhibo.di.component

import com.gkzxhn.gank_kotlin.di.module.ApiModule
import com.gkzxhn.xinzhibo.base.App
import dagger.Component

/**
 * Created by 方 on 2017/9/8.
 */
@Component(modules = arrayOf(ApiModule::class))
interface ApiComponent {
    fun inject(app: App)
}