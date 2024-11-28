package com.priyanka.splitkaro

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform