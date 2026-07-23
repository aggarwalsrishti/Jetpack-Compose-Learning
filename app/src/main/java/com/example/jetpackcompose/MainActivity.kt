package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.example.jetpackcompose.ui.theme.JetPackComposeTheme
import com.example.jetpackcompose.uiPractice.practice10.welcomescreen.NavigationGraph


import com.example.jetpackcompose.uiPractice.practice10.welcomescreen.SignInPage


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeTheme {
                NavigationGraph()
                }
            }
        }
    }

