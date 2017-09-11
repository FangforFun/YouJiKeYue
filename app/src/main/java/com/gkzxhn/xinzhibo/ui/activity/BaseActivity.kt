package com.gkzxhn.xinzhibo.ui.activity

import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.WindowManager
import com.gkzxhn.xinzhibo.R

/**
 * Created by 方 on 2017/9/11.
 */
abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        initState()
        initView()
    }

    /**
     * 沉浸式状态栏
     */
    private fun initState() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            //透明导航栏
//            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
        }
    }

    /**
     * 初始化控件
     */
    abstract fun initView()

    fun setupToolbar(toolbar: Toolbar){
        toolbar.title = ""
        toolbar.setNavigationIcon(R.drawable.icon_back)
        setSupportActionBar(toolbar)

    }

}