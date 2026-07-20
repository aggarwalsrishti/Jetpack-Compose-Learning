package com.example.jetpackcompose.UIPractice

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Design the following hierarchy using composables only:
//HomeScreenUI
//│
//├── AppLogo
//├── WelcomeText
//├── LoginButton
//└── SignUpButton
//Each UI element should be implemented as its own composable and then assembled inside HomeScreenUI().

@Composable
fun AppLogo() {
    Image(imageVector = Icons.Default.Whatsapp,
        contentDescription = "Whatsapp Icon",
        modifier = Modifier.size(100.dp),
        colorFilter = ColorFilter.tint(Color.Green)
    )
}

@Composable
fun WelcomeText(){
    Text(buildAnnotatedString {
        append("Welcome to ")
        withStyle(
            style = SpanStyle(
                color = Color.Green,
                fontWeight = FontWeight.Bold
            )
        ){
            append("Whatsapp")
        }
    },
        fontSize = 28.sp
    )
}

@Composable
fun LoginButton(){
    Button(
        onClick = {},
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Green,
            contentColor = Color.White
        )
    ) {
        Text(text = "Login",
            fontSize = 20.sp)
    }
}

@Composable
fun SignUpButton(){
    Button(
        onClick = {},
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Green,
            contentColor = Color.White
        )    ) {
        Text(text = "Sign Up",
            fontSize = 20.sp)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenUI() {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AppLogo()
        Spacer(modifier = Modifier.height(20.dp))
        WelcomeText()
        Spacer(modifier = Modifier.height(200.dp))
        LoginButton()
        Spacer(modifier = Modifier.height(10.dp))
        SignUpButton()
    }
}