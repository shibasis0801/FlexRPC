package com.jetbrains.kmm.shared

expect class Platform() {
    val platform: String
    val data: Int
}