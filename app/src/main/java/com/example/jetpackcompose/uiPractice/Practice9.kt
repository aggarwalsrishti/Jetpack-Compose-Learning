package com.example.jetpackcompose.uiPractice


import android.graphics.Paint
import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Comment
import androidx.compose.material.icons.automirrored.filled.Send

import androidx.compose.material.icons.filled.MoreHoriz

import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R



@Composable
fun PostCard() {
    var username by rememberSaveable { mutableStateOf("hellocat") }
    var likeCount by rememberSaveable {mutableStateOf(10) }
    var likeDone by rememberSaveable {mutableStateOf(false) }
    Card(
        modifier=Modifier.padding(vertical = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Black
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ) {
        Column() {
            Row(modifier=Modifier
                .fillMaxWidth()
                .padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Row() {
                Image(
                    painter = painterResource(id = R.drawable.profile_photo),
                    contentDescription = "Profile Photo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape)


                )
                    Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = username,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
                Icon(
                    imageVector = Icons.Default.MoreHoriz,
                    contentDescription ="More Horiz Icon",
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }

            Image(
                painter= painterResource(id=R.drawable.post_image),
                contentDescription = "Image Posted",
                modifier=Modifier
                    .fillMaxWidth()
                    .align(Alignment.End)
                    .align(Alignment.CenterHorizontally)
            )
            Row(modifier=Modifier.fillMaxWidth()
            ) {
                IconButton(
                    onClick = {
                        likeDone = !likeDone
                        if (likeDone) {
                            likeCount++
                        } else {
                            likeCount--
                        }
                    }
                ) {
                    Icon(
                    imageVector = if (likeDone)

                    {Icons.Default.Star}

                     else

                    {Icons.Default.StarBorder},
                            contentDescription = "Star Border Icon"


                    )}
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.Comment,
                        contentDescription = "Comment Icon"
                    )
                }
                IconButton(
                    onClick = {}
                ){
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.Send,
                        contentDescription = "Send Icon"
                    )
                }
            }

            Text(text="$likeCount likes",
                modifier = Modifier.padding(horizontal = 12.dp))

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InstaScreen() {
    LazyColumn() {
        items(10) {index->
            PostCard()
        }
    }
}
