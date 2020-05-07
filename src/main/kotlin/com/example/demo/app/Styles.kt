package com.example.demo.app

import javafx.scene.text.FontWeight
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
        val body by cssclass()
    }

    init {
        label and heading {
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }

        body {
            padding = box(0.px, 10.px, 10.px, 10.px)
            fontSize = 16.px
        }
    }
}