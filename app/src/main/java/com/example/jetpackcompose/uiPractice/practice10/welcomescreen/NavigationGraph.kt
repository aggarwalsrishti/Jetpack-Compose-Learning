package com.example.jetpackcompose.uiPractice.practice10.welcomescreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.uiPractice.practice10.homescreen.ScreenUI

@Preview
@Composable
fun NavigationGraph() {
    val navController= rememberNavController()
    NavHost(
        navController=navController,
        startDestination = NavigateScreen.WelcomePage
    ){
        composable <NavigateScreen.WelcomePage>{
            WelcomePage(navController)
        }
        composable < NavigateScreen.SignInPage>{
            SignInPage(navController)
        }
        composable <NavigateScreen.SignUpPage>{
            SignUpPage(navController)
        }
        composable <NavigateScreen.ScreenUI>{
            ScreenUI()
        }
    }
}