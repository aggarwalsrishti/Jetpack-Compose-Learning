package com.example.jetpackcompose.jetpack

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun ModidfiersExample() {
    Column(
        modifier = Modifier.fillMaxWidth().background(color = Color.Red).padding(vertical = 16.dp, horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().background(color = Color.Cyan).padding(all = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Top
        ) {
            Text(text = "Apple", fontSize = 20.sp)
            Text(text = "Banana", fontSize = 20.sp)
            Text(text = "Grapes", fontSize = 20.sp)
        }
        Box(modifier = Modifier.background(color = Color.Gray, shape = RoundedCornerShape(15.dp)).height(100.dp).width(100.dp).border(width = 5.dp, shape = RoundedCornerShape(15.dp), color = Color.White),
            contentAlignment = Alignment.Center
            ) {
            Text(
                text = "Hello", fontSize = 20.sp
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().background(color = Color.Magenta).padding(all = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Top
        ) {
            Text(text = "One", fontSize = 20.sp)
            Text(text = "Two", fontSize = 20.sp)
            Text(text = "Three", fontSize = 20.sp)
        }


    }
}