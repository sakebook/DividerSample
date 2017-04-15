package com.sakebook.android.sample.dividersample

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by sakemotoshinya on 2017/04/02.
 */
class OddViewHolder(view: View): RecyclerView.ViewHolder(view), CustomDivider {
    override val height = view.context.resources.getDimensionPixelSize(R.dimen.small_margin)
    override val drawable = R.drawable.dashed_line_divider
}