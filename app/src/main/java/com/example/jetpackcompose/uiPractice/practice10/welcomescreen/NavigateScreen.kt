package com.example.jetpackcompose.uiPractice.practice10.welcomescreen

import kotlinx.serialization.Serializable


@Serializable
sealed class NavigateScreen {

    @Serializable
    object WelcomePage : NavigateScreen()

    @Serializable
    object SignInPage : NavigateScreen(
    )

    @Serializable
    object SignUpPage: NavigateScreen()

    @Serializable
    object ScreenUI: NavigateScreen()
}