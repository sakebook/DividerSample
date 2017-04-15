package com.sakebook.android.sample.dividersample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by sakemotoshinya on 2017/04/02.
 */
class DataAdapter(private val context: Context, private val items: ArrayList<Data>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        val data = items[position]
        val dataNumber = data.number
        return ItemType.fromId(dataNumber).id
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemType = ItemType.fromId(viewType)
        return when(itemType) {
            ItemType.ODD -> OddViewHolder(inflater.inflate(R.layout.list_item_odd, parent, false))
            ItemType.EVEN -> EvenViewHolder(inflater.inflate(R.layout.list_item_even, parent, false))
            ItemType.PRIME -> PrimeViewHolder(inflater.inflate(R.layout.list_item_prime, parent, false))
        }.also {
            it.itemView.setOnClickListener { v ->
                android.util.Log.d(javaClass.simpleName, "${it.adapterPosition}")
                items.removeAt(it.adapterPosition)
                notifyItemRemoved(it.adapterPosition)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }
}
