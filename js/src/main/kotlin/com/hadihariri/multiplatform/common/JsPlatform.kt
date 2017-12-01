package com.hadihariri.multiplatform.common

import com.hadihariri.multiplatform.common.data.*

actual class Date actual constructor() {
    actual fun getDate(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual fun getMonth(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual fun getFullYear(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual fun getHours(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual fun getMinutes(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual fun getTime(): Number {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

actual fun platformMessage(message: Message) {
    println("(JS) [${message.priority}] ${message.text}")
}
