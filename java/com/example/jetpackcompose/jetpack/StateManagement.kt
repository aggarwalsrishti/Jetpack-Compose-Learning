package com.example.jetpackcompose.jetpack

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue //add bymself
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue //add myself


@Composable
fun StateManagementExampleUsingBy() {
    //remember keeps this value during recomposition
    //mutableStateOf holds value that can changes
    // and triggers recomposition when the value changes
    var score by remember { mutableStateOf(0) }
    Column(
        modifier=Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text="Score:$score",
            fontSize = 30.sp)
        Row() {
            Button(
                onClick = {score++},
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Increase")
            }
            Spacer(modifier=Modifier)
            Button(
                onClick = {score--},
                modifier = Modifier.weight(1f),
                enabled =score>0
            ) {
                Text(text = "Decrease")
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StateManagementExampleUsingEqualOperator() {

    var score = remember { mutableStateOf(0) }
    Column(
        modifier=Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text="Score:${score.value}",
            fontSize = 30.sp)
        Row() {
            Button(
                onClick = {score.value++},
                modifier = Modifier.weight(1f),

            ) {
                Text(text = "Increase")
            }
            Spacer(modifier=Modifier)
            Button(
                onClick = {score.value--},
                modifier = Modifier.weight(1f),
                enabled =score.value>0
            ) {
                Text(text = "Decrease")
            }
        }
    }
}

@Composable
fun RememberSavableExample() {
    //rememberSaveable saves the state during configuration changes
    var score by rememberSaveable { mutableStateOf(0) }
    Column(
        modifier=Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text="Score:$score",
            fontSize = 30.sp)
        Row() {
            Button(
                onClick = {score++},
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Increase")
            }
            Spacer(modifier=Modifier)
            Button(
                onClick = {score--},
                modifier = Modifier.weight(1f),
                enabled =score>0
            ) {
                Text(text = "Decrease")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StateHoistingParent() {
    var score by remember{ mutableStateOf(0)}
    CounterChild(
        score=score,
        increment={score++},
        decrement={score--}
    )
}
 @Composable
 fun CounterChild(score: Int, increment: ()-> Unit, decrement: ()-> Unit) {
     Column(
         modifier=Modifier
             .fillMaxSize()
             .padding(horizontal = 16.dp),
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Center
     ) {
         Text(text="Score:$score",
             fontSize = 30.sp)
         Row() {
             Button(
                 onClick = {increment()},
                 modifier = Modifier.weight(1f)
             ) {
                 Text(text = "Increase")
             }
             Spacer(modifier=Modifier)
             Button(
                 onClick = {decrement()},
                 modifier = Modifier.weight(1f),
                 enabled =score>0
             ) {
                 Text(text = "Decrease")
             }
         }
     }
 }