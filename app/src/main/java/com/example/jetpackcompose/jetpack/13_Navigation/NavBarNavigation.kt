package com.example.jetpackcompose.jetpack.`13_Navigation`

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavBarNavigation() {
    val navController= rememberNavController()
    NavHost (
        navController=navController,
        startDestination= NavBarRoutes.HomeScreen
    ){
        composable<NavBarRoutes.HomeScreen>{
            NavBarHomeScreen(navController = navController)
        }
        composable<NavBarRoutes.SearchScreen>{
            NavBarSearchScreen(navController = navController)
        }
        composable<NavBarRoutes.NotificationScreen>{
            NavBarNotificationScreen(navController = navController)
        }
        composable<NavBarRoutes.ProfileScreen>{
            NavBarProfileScreen(navController = navController)
        }
    }
}