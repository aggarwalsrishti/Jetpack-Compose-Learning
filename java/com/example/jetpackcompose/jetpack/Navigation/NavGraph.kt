package com.example.jetpackcompose.jetpack.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
    }
}