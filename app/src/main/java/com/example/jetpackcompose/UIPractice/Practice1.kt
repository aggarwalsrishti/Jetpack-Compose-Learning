package com.example.jetpackcompose.UIPractice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//1.	Create a composable named Greeting() that displays your name.
//2.	Create a composable named CollegeName() that displays your college.
//3.	Call both composables from another composable.


@Composable
fun Greeting() {
    Text(text="Srishti Aggarwal",
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold
        )
}

@Composable
fun CollegeName(){
    Text(text="Maharaja Agrasen Institute of Technology",
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontSize = 16.sp,
        fontFamily = FontFamily.SansSerif,
        fontStyle = FontStyle.Italic
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileScreenUI() {
    Box(
        modifier = Modifier.background(color = Color.LightGray),
        contentAlignment = Alignment.Center,
    ){

        Column() {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Person Icon",
                modifier = Modifier.fillMaxWidth()
                    .size(100.dp),
                tint = Color.DarkGray
            )
            Greeting()
            CollegeName()
        }

    }
}
//Output
//Srishti Aggarwal
//Maharaja Agrasen Institute of Technology
