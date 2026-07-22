package com.example.jetpackcompose.uiPractice

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CartList() {
    var quantity by rememberSaveable() {mutableStateOf(1) }
    LazyColumn()   {
        items(10){index->

    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(2.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Column(
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.wirelessearbud),
                    contentDescription = "Wireless Earbuds",
                    modifier = Modifier.size(150.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Column(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    Text(
                        text = "Noise Buds N1 Truly Wireless Earbuds with Chrome Finish, 40H of Playtime, Quad Mic with ENC, Ultra Low Latency Gaming (Up to 40 Ms), Instacharge(10 Min=120 Min), Bluetooth V5.3(Carbon Black)",
                        fontSize = 15.sp,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 2
                    )
                    Text(
                        text = "2K+ bought in past month",
                        fontSize = 15.sp
                    )
                    Text(
                        text = "₹1,999",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(buildAnnotatedString {
                        append("FREE Delivery ")

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("Wed, 22 July")
                        }
                    })
                    Text(text = "available at checkout")
                    Text(
                        text = "Instock",
                        color = Color.Green
                    )
                    Text(
                        text = "10 days Service Centre Replacement",
                        color = Color.Blue
                    )
                    Text(
                        buildAnnotatedString {
                            append("Up to 5% back with Amazon Pay ICICI card ")
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Blue
                                )
                            ) {
                                append("Terms")
                            }

                        }
                    )

                }
            }
            Row(modifier= Modifier.fillMaxWidth()
                ,
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically


                ) {


                    Row(
                        modifier=Modifier.border(4.dp,Color.Yellow,RoundedCornerShape(32.dp)),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = { quantity-- },
                            enabled = quantity > 0,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.White,
                                contentColor = Color.Black
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Default.Remove,
                                contentDescription = "Remove Icon"
                            )
                        }

                        Text(
                            text = "$quantity",
                            fontSize = 20.sp,

                        )
                        Button(
                            onClick = { quantity++ },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.White,
                                contentColor = Color.Black
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "Add Icon",

                                )
                        }

                    }

                Button(
                    onClick = {},
                    modifier = Modifier
                        .border(width = 1.dp,
                        color = Color.DarkGray,
                        shape= RoundedCornerShape(32.dp)),
                    shape = RoundedCornerShape(32.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    )
                ) {
                    Text(text="Delete",
                        fontSize = 16.sp)
                }


            }}
        Spacer(modifier = Modifier.height(5.dp))
            Row(modifier= Modifier.fillMaxWidth()
                .padding(bottom = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier.border(width = 1.dp,
                        color = Color.DarkGray,
                        shape= RoundedCornerShape(32.dp)),
                    shape = RoundedCornerShape(32.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    )
                ) {
                    Text(text="Save for Later",
                        fontSize = 16.sp)
                }
                Button(
                    onClick = {},
                    modifier = Modifier.border(width = 1.dp,
                        color = Color.DarkGray,
                        shape= RoundedCornerShape(32.dp)),
                    shape = RoundedCornerShape(32.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    )
                ) {
                    Text(text="Compare",
                        fontSize = 16.sp)
                }

                Button(
                    onClick = {},
                    modifier = Modifier.border(width = 1.dp,
                        color = Color.DarkGray,
                        shape= RoundedCornerShape(32.dp)),
                    shape = RoundedCornerShape(32.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    )
                ) {
                    Text(text="Share",
                        fontSize = 16.sp)
                }

            }
        }

        
    }
}}