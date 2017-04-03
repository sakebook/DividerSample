package com.sakebook.android.sample.dividersample

/**
 * Created by sakemotoshinya on 2017/04/03.
 */
enum class ItemType(val id: Int) {
    EVEN(0),
    ODD(1),
    ;

    companion object {
        fun fromId(id: Int): ItemType = ItemType.values().find { it.id == id }?: EVEN
    }
}