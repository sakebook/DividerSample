package com.sakebook.android.sample.dividersample

/**
 * Created by sakemotoshinya on 2017/04/03.
 */
enum class ItemType(val id: Int) {
    EVEN(0),
    ODD(1),
    PRIME(2),
    ;
    
    companion object {
        val primeNumbers = listOf(2, 3, 5, 7, 11,
                13, 17, 19, 23, 29,
                31, 37, 41, 43, 47,
                53, 59, 61, 67, 71,
                73, 79, 83, 89, 97)

        fun fromId(id: Int): ItemType {
            return when {
                primeNumbers.contains(id) -> PRIME
                id % 2 == 0 -> EVEN
                else -> ODD
            }
        }
    }
}