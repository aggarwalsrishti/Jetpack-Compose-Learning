package com.example.jetpackcompose.jetpack.`10_Navigation`

import kotlinx.serialization.Serializable

//sealed class creates a restricted hierarchy of classes.
//so its subclasses can only be defined in the same file where the sealed class is declared.


//Each subclass of sealed class can have its own data and behavior.
@Serializable
sealed class MyNavRoutes {
    @Serializable
    object LoginScreen : MyNavRoutes()
    @Serializable
    object HomeScreen : MyNavRoutes()
    @Serializable
    object WelcomeScreen : MyNavRoutes(){
        data class WelcomeScreen(val username : String): MyNavRoutes()

    }
}