package com.hadihariri.multiplatform.common

import com.hadihariri.multiplatform.common.data.*


actual fun platformMessage(message: Message) {
    println("(JVM) [${message.priority}] ${message.text}")

}
