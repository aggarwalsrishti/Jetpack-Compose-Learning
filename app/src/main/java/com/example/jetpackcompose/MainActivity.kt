package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.example.jetpackcompose.jetpack.`10_Navigation`.NavGraph
import com.example.jetpackcompose.jetpack.`12_Scaffold`.MyScreen
import com.example.jetpackcompose.jetpack.LazyColumnExample
import com.example.jetpackcompose.jetpack.LazyRowExample
import com.example.jetpackcompose.jetpack.NestedLazyLists
import com.example.jetpackcompose.jetpack.SnackBarExample
import com.example.jetpackcompose.jetpack.ToastExample
import com.example.jetpackcompose.jetpack.TypesOfItem

import com.example.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeTheme {
                NavGraph()
                }
            }
        }
    }

