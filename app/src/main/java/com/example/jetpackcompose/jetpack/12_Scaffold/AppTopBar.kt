package com.example.jetpackcompose.jetpack.`12_Scaffold`

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppTopBar() {
    TopAppBar(
        title = { Text(text="App Name",
            fontWeight = FontWeight.Bold)},
        navigationIcon = {IconButton(
            onClick = {}
        ) {
            Icon(imageVector = Icons.Default.Menu,
                contentDescription = "Menu Icon")
        }},
        actions = {IconButton(
            onClick = {}
        ) {
            Icon(imageVector = Icons.Default.Search,
                contentDescription = "Search Icon")
        }

            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "MoreVert Icon"
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Blue,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White
        )
    )
}