package com.example.jetpackcompose.jetpack.`13_Navigation`

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MyNavBar() {
    val navItems= listOf(
        NavItem(title = "Home", Icons.Default.Home),
        NavItem(title = "Search", Icons.Default.Search),
        NavItem(title = "Notification", Icons.Default.Notifications),
        NavItem(title = "Profile", Icons.Default.Person)
    )
    NavigationBar {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    imageVector= Icons.Default.Home,
                    contentDescription="Home"
                )
            },
            label = {Text(text="Home")}
        )
    }
}
data class NavItem(
    val title: String,
    val icon: ImageVector
)