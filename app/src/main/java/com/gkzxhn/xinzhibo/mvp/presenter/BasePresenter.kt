package com.gkzxhn.xinzhibo.mvp.presenter

import rx.Subscription
import rx.subscriptions.CompositeSubscription

/**
 * Created by 方 on 2017/9/11.
 */
open class BasePresenter {
    var compositeSubscription = CompositeSubscription()

    protected fun addSubscription(subscription: Subscription) {
        compositeSubscription.add(subscription)
    }

    fun unSubscribe() {
        if(compositeSubscription.hasSubscriptions()){
            compositeSubscription.unsubscribe()
        }
    }
}