package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcompose.jetpack.ALertDialogExample
import com.example.jetpackcompose.jetpack.Navigation.LoginScreenUI
import com.example.jetpackcompose.jetpack.Navigation.NavGraph

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

