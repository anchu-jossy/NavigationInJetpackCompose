package com.example.navigationinjetpackcompose.ui.theme

sealed class Screen(val route: String) {
    // if we need pass data then data class else object
    object MainScreen : Screen(route = "main_screen")
    object DetailScreen : Screen(route = "detail_screen")

    fun withArgs( vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { it->
                append("/$it")
            }
        }
    }
}