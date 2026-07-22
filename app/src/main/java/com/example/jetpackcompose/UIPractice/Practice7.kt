package com.example.jetpackcompose.uiPractice


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Engineering
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardUI() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 16.dp,
                    vertical=20.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black,
                contentColor = Color.White
            )
        ) {

            Row(
                modifier = Modifier.padding(10.dp)
            ) {
                Box(
                    modifier = Modifier.size(100.dp)
                        .background(color=Color.DarkGray,shape= CircleShape),
                    contentAlignment = Alignment.Center,

                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Person Image",
                        tint=Color.White,
                        modifier = Modifier.size(75.dp)
                    )
                }
                Spacer(modifier = Modifier.width(20.dp))
                Column() {
                    Text(text = "Srishti Aggarwal",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold)
                    Text(text = "Android Developer",
                        fontSize = 15.sp,
                        color = Color.LightGray)
                    Spacer(modifier = Modifier.height(15.dp))
                    Row() {
                        Icon(
                            imageVector = Icons.Default.School,
                            contentDescription = "School Icon",
                            tint = Color.LightGray,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text="Maharaja Agrasen Institute of Technology",
                            fontSize = 14.sp)
                    }
                    Row() {
                        Icon(
                            imageVector = Icons.Default.Engineering,
                            contentDescription = "Engineering Icon",
                            tint = Color.LightGray,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text="Information Technology",
                            fontSize = 14.sp)
                    }
                }
            }
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 10.dp,vertical=5.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add Icon",
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text="Follow",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold)
                    }
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Default.Message,
                            contentDescription = "Message Icon",

                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text="Message",
                            fontSize = 14.sp)
                    }
                }
        }}
    }
