package com.example.jetpackcompose.jetpack.`12_Scaffold`

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun MyScreen(){
    Scaffold(
        topBar = {AppTopBar()},
        bottomBar = {AppBottomBar()},
        floatingActionButton = {FAB() }
    ){innerPadding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(innerPadding).padding(vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) { items(20){index->
            MyScreenContent()
        } }
    }
    }