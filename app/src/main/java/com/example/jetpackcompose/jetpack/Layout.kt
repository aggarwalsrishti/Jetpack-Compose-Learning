package com.example.jetpackcompose.jetpack

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun RowExample() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Apple", fontSize = 30.sp)
        Text(text = "Banana", fontSize = 30.sp)
        Text(text = "Grapes", fontSize = 30.sp)

    }

}


@Composable
fun ColumnExample() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Apple", fontSize = 30.sp)
        Text(text = "Banana", fontSize = 30.sp)
        Text(text = "Grapes", fontSize = 30.sp)
    }
    
}


@Composable
fun LoginExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(text = "Login Here", fontSize = 30.sp)
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {Text(text = "Enter your name", fontSize = 20.sp)}

        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {Text(text = "Enter your password", fontSize = 20.sp)}
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BoxExample() {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Text(text="Apple", fontSize = 30.sp,
            modifier = Modifier.align(Alignment.TopStart))
        Text(text="Banana", fontSize = 30.sp,
            modifier = Modifier.align(Alignment.BottomEnd))
        Text(text="Grapes", fontSize = 30.sp,
            modifier = Modifier.align(Alignment.Center))
    }
    
}


