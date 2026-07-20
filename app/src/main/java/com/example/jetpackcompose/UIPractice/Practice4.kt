package com.example.jetpackcompose.UIPractice

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R


//Design the following product information using only Text() composables:
//Wireless Earbuds
//⭐⭐⭐⭐⭐ (4.8)
//
//₹1,999
//₹2,999  (strike-through)
//
//Free Delivery
//Use appropriate typography, colors, and text decorations to make it look like an e-commerce product card.


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProductCardUI() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card (modifier = Modifier
            .fillMaxWidth().
                size(150.dp)
            ,
            shape = RectangleShape,
            colors = CardDefaults.cardColors(
                containerColor = Color.Black,
                contentColor = Color.White

            )
        ) {
            Row(){


            Column(){
            Text(text = "Wireless Earbuds",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold)
            Row() {
                for (i in 1..5){
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star Icon",
                        tint = Color.Yellow
                    )
                }
                Text(text = "(4.8)",
                    fontSize = 20.sp)
            }
                Spacer(modifier= Modifier.height(16.dp))
            Row(){
                Text(text = "₹1,999",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "₹2,999",
                    fontSize = 26.sp,
                    textDecoration = TextDecoration.LineThrough
                    )
            }
                Text(text="Free Delivery",
                    fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.width(8.dp))
                Image(
                    painter = painterResource(id = R.drawable.wirelessearbud),
                    contentDescription = "Product Image",
                    contentScale = ContentScale.Fit

                )
            }
        }
    }


}