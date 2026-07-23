package com.example.jetpackcompose.uiPractice.practice10.homescreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScreenUI(){
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
        floatingActionButton = { FloatingButton() }
    ) {innerPadding->
        LazyColumn(
            modifier=Modifier.fillMaxSize()
                .padding(innerPadding)
        ){
            items(20) { index->
                Text(text="Item $index",
                    modifier=Modifier.padding(16.dp))
            }

        }
    }
}
