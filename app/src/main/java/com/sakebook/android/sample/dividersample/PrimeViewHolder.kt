package com.sakebook.android.sample.dividersample

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView

/**
 * Created by sakemotoshinya on 2017/04/15.
 */
class PrimeViewHolder(view: View): ViewHolder<Data>(view) {

    val textSubTitle: TextView = view.findViewById(R.id.text_sub_title) as TextView

    @SuppressLint("SetTextI18n")
    override fun setData(t: Data) {
        textSubTitle.text = "number: ${t.number}"
    }
}