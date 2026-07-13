package com.example.jetpackcompose.jetpack

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.setValue //add myself
import androidx.compose.material3.IconButton


@Composable
fun ButtonExample() {
    val context= LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                Toast.makeText(context,"Button Clicked",Toast.LENGTH_SHORT).show()
            }
            ,
            modifier=Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(50.dp)
            ,
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(contentColor = Color.Black
            , containerColor = Color.Green)
            ,
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp
            , pressedElevation = 10.dp),
            border = BorderStroke(2.dp, Color.Black)


        ) {
            Row() {
                Icon(imageVector = Icons.Default.Person,
                    contentDescription = "Person Icon")
            }
            Spacer(modifier= Modifier.width(16.dp))
            Text(text = "Click Me")
        }
    }
}


@Composable
fun LoginScreen() {
    val context= LocalContext.current
    var userName by remember{ mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login Here", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier=Modifier.height(16.dp))
        OutlinedTextField(
            value=userName,
            onValueChange = {userName=it},
            modifier=Modifier.fillMaxWidth(),
            label={Text(text="Username")}
        )
        Spacer(modifier=Modifier.height(16.dp))
        OutlinedTextField(
            value=email,
            onValueChange = {email=it},
            modifier=Modifier.fillMaxWidth(),
            label={Text(text="Email")}
        )
        Spacer(modifier=Modifier.height(16.dp))
        Button(
            onClick = {
                Toast.makeText(context,"Button Clicked",Toast.LENGTH_SHORT).show()
            }
            ,
            modifier=Modifier
                .fillMaxWidth()

                .height(50.dp)
            ,
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(contentColor = Color.White
                , containerColor = Color.Black)
            ,
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp
                , pressedElevation = 10.dp),
            enabled = userName.isNotEmpty() && email.isNotEmpty()



        ) {

            Text(text = "LOGIN", fontWeight = FontWeight.SemiBold)
        }
    }
}


@Composable
fun OutlinedButtonExample(
    modifier: Modifier=Modifier
) {
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedButton(
        onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black
                )
    ) {
        Text(text="Click Me!")
    }
    }
    
}


@Composable
fun TextButtonExample() {
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextButton(
            onClick = {}
        ) {
            Text(text = "Forget Password")
        }
        Text(text="FORGET PASSWORD",modifier=Modifier.clickable(onClick = {}))
    }
}


@Composable
fun IconButtonExample() {
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        IconButton(
            onClick={}
        ){
            Icon(imageVector = Icons.Default.Home,
                contentDescription = "Home Icon")

        }
        IconButton(
            onClick={}
        ){
            Icon(imageVector = Icons.Default.Home,
                contentDescription = "Home Icon")

        }
        Icon(imageVector = Icons.Default.Home,
            contentDescription = "Home Icon",
            modifier = Modifier.clickable {})
        Icon(imageVector = Icons.Default.Home,
            contentDescription = "Home Icon",
            modifier = Modifier.clickable{})
    }
}