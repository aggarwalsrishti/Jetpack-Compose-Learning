package com.example.jetpackcompose.jetpack.`13_Navigation`

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController


@Composable
fun MyNavBar(navController: NavController, key: String) {
    val navItems= listOf(
        NavItem(title = "Home", Icons.Default.Home, NavBarRoutes.HomeScreen),
        NavItem(title = "Search", Icons.Default.Search, NavBarRoutes.SearchScreen),
        NavItem(title = "Notification", Icons.Default.Notifications, NavBarRoutes.NotificationScreen),
        NavItem(title = "Profile", Icons.Default.Person, NavBarRoutes.ProfileScreen)
    )
    NavigationBar {
        navItems.forEach { item ->
            NavigationBarItem(
            selected = item.title==key,
            onClick = {navController.navigate(item.routes){
                      popUpTo(navController.graph.startDestinationId){
                          saveState=true
                      }
            launchSingleTop=true
            restoreState=true}
                      },
            icon = {
                Icon(
                    imageVector= item.icon,
                    contentDescription=item.title
                )
            },
            label = {Text(text=item.title)},
                alwaysShowLabel = true,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Blue,
                    selectedTextColor = Color.Blue,
                    indicatorColor = Color.Blue.copy(alpha = 0.1f),
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                )
        ) }

    }
}
data class NavItem(
    val title: String,
    val icon: ImageVector,
    val routes: NavBarRoutes
)