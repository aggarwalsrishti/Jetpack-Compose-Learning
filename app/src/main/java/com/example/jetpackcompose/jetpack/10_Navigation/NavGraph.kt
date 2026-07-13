package com.example.jetpackcompose.jetpack.`10_Navigation`

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NavGraph() {
    //navController -> Handle Navigation
    //rememberNavController -> Create  & remember a navController
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.LoginScreen
    ){
        composable<MyNavRoutes.LoginScreen> {
            LoginScreenUI(navController)
        }
        composable<MyNavRoutes.HomeScreen> {
            HomeScreenUI(navController)
        }

        //backStackEntry is a lambda function having data and arguments which are passed during navigation

        composable <MyNavRoutes.WelcomeScreen>{backStackEntry ->
            val data=backStackEntry.toRoute<MyNavRoutes.WelcomeScreen>()
            WelcomeScreenUI(data.username, navController)
        }
    }
}