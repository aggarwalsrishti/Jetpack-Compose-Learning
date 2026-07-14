package com.example.jetpackcompose.jetpack

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Composable
fun ToastExample() {
    // In Android, Context means the app’s
    // current environment / surrounding information such as
    // Which Activity the app is running in
    // Which screen it is on
    // Which resource needs to be accessed
    // Which service needs to be called

    // Get current context (required for Toast)
    // The current Android context of the Composable on the screen
    val context= LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
                Toast.makeText(context, "This is a toast message", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text="Show Toast")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SnackBarExample() {
    // SnackbarHostStatw controls snackbar
    val SnackBarHostState= remember { SnackbarHostState() }
    // Coroutines Scope -> To show SnackBar
    val scope= rememberCoroutineScope()
    Scaffold(
        snackbarHost = { SnackbarHost(hostState = SnackBarHostState) }
    ) {innerPadding->
        Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp).padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
                scope.launch {
                    //show SnackBar
                    SnackBarHostState.showSnackbar(
                        message = "This is Snack Bar Message",
                        actionLabel = "UNDO",
                        duration = SnackbarDuration.Short
                    )
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text="Show Snack Bar")
        }
    } }

}