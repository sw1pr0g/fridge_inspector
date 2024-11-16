package org.fridge.inspector

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform