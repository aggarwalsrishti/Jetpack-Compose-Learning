package com.example.jetpackcompose.uiPractice


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenUI() {
    var username by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable{ mutableStateOf("")}
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.google_icon),
            contentDescription = "Google Icon"
        )
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "Login to your account",
            fontSize = 24.sp)
        Spacer(modifier = Modifier.height(32.dp))
        OutlinedTextField(
            value = username,
            onValueChange = {username=it},
            label = {Text(text = "Username")},
            singleLine = true
        )
        OutlinedTextField(
            value = password,
            onValueChange = {password=it},
            label = {Text(text = "Password")},
            singleLine = true
        )
        TextButton(
            onClick = {},

        ) {
            Text(text = "Forgot Password?",
                modifier=Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start)
        }
        Button(
            onClick = {},
            modifier=Modifier.fillMaxWidth(),
            enabled = username.isNotEmpty() && password.isNotEmpty(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green
            )
        ) {
            Text(text = "Login",
                fontWeight = FontWeight.SemiBold)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Don't have an account?")
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(
            onClick = {},
            modifier=Modifier.fillMaxWidth()
        ) {
            Text(text="Sign Up",
                fontWeight = FontWeight.SemiBold)
        }
        }
    }
