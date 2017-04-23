package com.sakebook.android.sample.dividersample

import android.view.View
import android.widget.TextView

/**
 * Created by sakemotoshinya on 2017/04/02.
 */
class OddViewHolder(view: View): ViewHolder<Data>(view), CustomDivider {

    override val height = view.context.resources.getDimensionPixelSize(R.dimen.small_margin)
    override val drawableRes = R.drawable.dashed_line_divider

    val textSubTitle: TextView = view.findViewById(R.id.text_sub_title) as TextView

    override fun setData(t: Data) {
        textSubTitle.text = "number: ${t.number}"
    }
}