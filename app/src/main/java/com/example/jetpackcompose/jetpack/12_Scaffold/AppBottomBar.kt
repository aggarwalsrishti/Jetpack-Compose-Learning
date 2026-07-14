package com.example.jetpackcompose.jetpack.`12_Scaffold`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppBottomBar() {
    BottomAppBar(
        containerColor = Color.Gray.copy(alpha = 0.2f),
        contentColor = Color.Blue
    ) {
        Row(
            modifier=Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            IconButton(onClick = {},
                modifier = Modifier.size(48.dp)) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home Icon",
                    modifier = Modifier.size(30.dp))
            }
            IconButton(onClick = {},
                modifier = Modifier.size(48.dp)) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                    modifier = Modifier.size(30.dp))
            }
            IconButton(onClick = {},
                modifier = Modifier.size(48.dp)) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Notification Icon",
                    modifier = Modifier.size(30.dp))
            }
            IconButton(onClick = {},
                modifier = Modifier.size(48.dp)) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "profile Icon",
                    modifier = Modifier.size(30.dp))
            }


        }
    }
}