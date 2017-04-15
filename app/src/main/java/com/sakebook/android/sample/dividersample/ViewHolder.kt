package com.sakebook.android.sample.dividersample

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by sakemotoshinya on 2017/04/15.
 */
abstract class ViewHolder<in T>(view: View): RecyclerView.ViewHolder(view) {

    abstract fun setData(t: T)
}