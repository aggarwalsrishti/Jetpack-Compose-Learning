package com.example.jetpackcompose.uiPractice.practice10.welcomescreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun AppLogo() {
    Image(imageVector = Icons.Default.ShoppingCart,
        contentDescription = "Whatsapp Icon",
        modifier = Modifier.size(100.dp)
            .border(5.dp,Color.Magenta, CircleShape),
        colorFilter = ColorFilter.tint(Color.Magenta)
    )
}

@Composable
fun WelcomeText(){
    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontWeight = FontWeight.SemiBold
            )
        ){
            append("Welcome to ")}
        withStyle(
            style = SpanStyle(
                color = Color.Magenta,
                fontWeight = FontWeight.Bold
            )
        ){
            append("Kyaara")
        }
    },
        fontSize = 28.sp
    )
}

@Composable
fun SignInButton(navController: NavHostController){
    Button(
        onClick = {navController.navigate(NavigateScreen.SignInPage)},
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.White
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 10.dp
        )
    ) {
        Text(text = "Go to Login",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold)
    }
}



@Composable
fun SignUpButton(navController: NavHostController){
    Button(
        onClick = {navController.navigate(NavigateScreen.SignUpPage)},
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Magenta
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 5.dp
        )
        ) {
        Text(text = "No account yet? Sign Up",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold)
    }
}


@Composable
fun WelcomePage(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AppLogo()
        Spacer(modifier = Modifier.height(20.dp))
        WelcomeText()
        Spacer(modifier = Modifier.height(200.dp))
        SignInButton(navController)
        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))
        SignUpButton(navController)
    }
}