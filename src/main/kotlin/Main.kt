@file:Suppress("unused")

import javax.swing.JFrame

class Frame(
    title: String = "FRAME"
) : JFrame() {
    constructor(
        title: String = "FRAME",
        width: Int,
        height: Int
    ) : this(title) {
        setSize(width, height)
    }

    init {
        setTitle(title)

        defaultCloseOperation = EXIT_ON_CLOSE
        setLocationRelativeTo(null)
        isVisible = true
    }
}

fun main() {
    val frame = Frame("Test", 500, 500)
}