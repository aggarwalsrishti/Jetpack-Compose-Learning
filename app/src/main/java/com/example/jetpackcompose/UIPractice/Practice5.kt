package com.example.jetpackcompose.uiPractice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Example() {
    Column() {
        Box(
            modifier=Modifier.fillMaxWidth()
                .background(Color.Blue)
                .padding(16.dp)
        ) {
            Text(text = "Hello")
        }

        Box(
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
                .background(Color.Blue)
        ){
            Text(text="Hello")
        }
    }

}