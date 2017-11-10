package com.hadihariri.multiplatform.common

import com.hadihariri.multiplatform.common.data.*


expect class Date() {
    fun getDate(): Int
    fun getMonth(): Int
    fun getFullYear(): Int
    fun getHours(): Int
    fun getMinutes(): Int
    fun getTime(): Number
}

expect fun platformMessage(message: Message)
