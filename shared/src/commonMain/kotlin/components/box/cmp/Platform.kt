package components.box.cmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform