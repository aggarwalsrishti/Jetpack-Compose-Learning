package com.example.jetpackcompose.jetpack

import android.graphics.Paint
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LazyColumnExample() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(20){index ->
            Text(
                text = "Item $index",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color=Color.White,
                modifier = Modifier
                    .background(color = Color.DarkGray, shape = RoundedCornerShape(8.dp))
                    .padding(16.dp)
                    )

        }
    }
}


@Composable
fun LazyRowExample(){
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {items(20) { index ->
        Text(
            text = "Item $index",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(
                    color = Color.DarkGray,
                    shape = RoundedCornerShape(16.dp)
                )
                .fillMaxWidth()
                .padding(16.dp)

        )

    }

    }
}


@Composable
fun NestedLazyLists() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(20) { columnIndex ->
            Text(
                text = "Row $columnIndex",
                fontWeight = FontWeight.Bold
            )
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(20) { rowIndex ->
                    Box(modifier = Modifier
                        .size(100.dp)

                        .background(color = Color.LightGray, shape = RoundedCornerShape(8.dp)),
                        contentAlignment = Alignment.Center) {
                        Text(
                            text = "Item $rowIndex",
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }

        }
    }}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TypesOfItem() {
    Row(
        modifier = Modifier.fillMaxSize()
            .padding(24.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) { //01-item
        LazyColumn() {
        item { Text(text="Header") }
    }
        //02-items(count
        LazyColumn() {
            items(count = 10){
                index ->
                Text(text="Item $index")
            }
        }
        //03-items(list)
        val names= listOf("Item1","Item2","Item3","Item4","Item5","Item6","Item7","Item8","Item9","Item10")
        LazyColumn() {
            items(names){ name->
                Text(text="$name")
            }
        }
        //04-itemsIndexed(list)
        LazyColumn() {
            itemsIndexed(names){ index,name->
                Text(text="$index $name")
            }
        }
    } }



