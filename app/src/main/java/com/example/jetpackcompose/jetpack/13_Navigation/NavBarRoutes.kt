package com.example.jetpackcompose.jetpack.`13_Navigation`

import kotlinx.serialization.Serializable

@Serializable
sealed class NavBarRoutes {
    @Serializable
    object HomeScreen : NavBarRoutes()
    @Serializable
    object SearchScreen : NavBarRoutes()
    @Serializable
    object NotificationScreen : NavBarRoutes()
    @Serializable
    object ProfileScreen : NavBarRoutes()
}
