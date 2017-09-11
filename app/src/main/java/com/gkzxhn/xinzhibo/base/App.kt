package com.gkzxhn.xinzhibo.base

import android.app.Application
import com.gkzxhn.gank_kotlin.di.module.ApiModule
import com.gkzxhn.xinzhibo.di.component.ApiComponent
import com.gkzxhn.xinzhibo.di.component.DaggerApiComponent
import com.wingsofts.gankclient.di.module.AppModule
import javax.inject.Inject

/**
 * Created by 方 on 2017/9/8.
 */
class App : Application() {
    init {
        instance = this
    }

    @Inject lateinit var apiComponent: ApiComponent

    override fun onCreate() {
        super.onCreate()

        DaggerApiComponent.builder().apiModule(ApiModule()).appModule(AppModule(this)).build().inject(this)

    }

    companion object {
        lateinit var instance: App
    }
}