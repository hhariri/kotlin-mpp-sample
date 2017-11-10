package com.hadihariri.multiplatform.js
import com.hadihariri.multiplatform.common.*
import com.hadihariri.multiplatform.common.data.*

fun broadcastMessage(message: Message) {
    println("[${message.priority}] ${message.text}")
}

fun main(args: Array<String>) {
    broadcastMessage(Message("Initiating Server", Priority.NORMAL))
    platformMessage(Message("Initiating Server", Priority.MAJOR))
}