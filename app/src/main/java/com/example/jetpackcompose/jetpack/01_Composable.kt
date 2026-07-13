package com.example.jetpackcompose.jetpack

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TextExample(){
    Text(
        text = "Mission Android 2026",
        color = Color.Blue,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace,
        letterSpacing = 10.sp,
        textAlign = TextAlign.Center
    )
}


@Composable
fun TextFieldExample() {
    var name by remember{ mutableStateOf(value = "") }
    TextField(
        value = name,
        onValueChange = {name = it},
        //label = {Text(text = "Enter your name")}
        placeholder = {Text(text = "Enter your name")},
        leadingIcon = {Text(text = "*", fontSize = 20.sp, fontWeight = FontWeight.Bold)}, //starting icon
        trailingIcon ={Text(text = "#", fontSize = 20.sp, fontWeight = FontWeight.Bold)}, //ending icon
        singleLine = true,
        shape = CircleShape,
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.White,
            unfocusedContainerColor = Color.Blue,
            focusedTextColor = Color.Yellow,
            unfocusedLeadingIconColor = Color.Gray,
        )
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlinedTextFieldExample() {
    var name by remember{ mutableStateOf(value = "") }
    OutlinedTextField(
        value = name,
        onValueChange = {name = it},
        label = {Text(text = "Enter your name")},
        leadingIcon = {Text(text = "*", fontSize = 20.sp, fontWeight = FontWeight.Bold)},
        trailingIcon ={Text(text = "#", fontSize = 20.sp, fontWeight = FontWeight.Bold)},
        singleLine = true,
        shape = RoundedCornerShape(size = 16.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedTextColor = Color.White,
            unfocusedContainerColor = Color.Blue,
            focusedTextColor = Color.Yellow,
            unfocusedLeadingIconColor = Color.Gray,
            unfocusedBorderColor = Color.Red,
            focusedBorderColor = Color.Green
        )
    )
}