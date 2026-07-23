package com.example.jetpackcompose.uiPractice.practice10.welcomescreen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.PermIdentity
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun HeadingText(){
    Text(text = "Sign In",
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
        color = Color.Magenta)
    Text(
        text = "Enter your credentials to continue",
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        color = Color.DarkGray
    )
}

@Composable
fun UsernameField(
    userName: String,
    onUserNameChange: (String)-> Unit
) {

    OutlinedTextField(
        value = userName,
        onValueChange = onUserNameChange,
        label = { Text(text = "Username") },
        singleLine = true,
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.PermIdentity,
                contentDescription = "Person Icon"
            )
        },
        modifier = Modifier.fillMaxWidth(),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color.Magenta,
            focusedTextColor = Color.DarkGray,
            unfocusedTextColor = Color.DarkGray

        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Next
        )
    )
}

@Composable
fun PasswordField(
    password: String,
    onPasswordChange: (String)-> Unit
) {
    var passwordVisibility by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = password,
        onValueChange = onPasswordChange,
        label = { Text(text = "Password") },
        suffix = { IconButton(
            onClick = {passwordVisibility=!passwordVisibility}
        ) {
            if(passwordVisibility){
                Icon(
                    imageVector = Icons.Default.Visibility,
                    contentDescription = "Password Visibility On"
                )
            }
            else {
                Icon(
                    imageVector = Icons.Default.VisibilityOff,
                    contentDescription = "Password Visibility Off"
                )
            }
        } },
        singleLine = true,
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Password,
                contentDescription = "Password Icon"
            )
        },
        modifier = Modifier.fillMaxWidth(),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color.Magenta,
            focusedTextColor = Color.DarkGray,
            unfocusedTextColor = Color.DarkGray
            ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done
        ),
        visualTransformation = if(passwordVisibility) VisualTransformation.None
        else PasswordVisualTransformation()
    )
}

@Composable
fun SignInButtonForForm(userName: String, password: String, navController: NavHostController){
    Button(
        onClick = {navController.navigate(NavigateScreen.ScreenUI)},
        enabled = userName.isNotEmpty() && password.isNotEmpty(),
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.White,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.LightGray
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 20.dp
        )
    ) {
        Text(text = "Go to Login",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold)
    }
}

@Composable
fun BottomText(navController: NavHostController) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text="Don't have an account?",
            color = Color.DarkGray,
            fontSize = 16.sp)
        Spacer(modifier = Modifier.width(2.dp))
        TextButton(
            onClick = {navController.navigate(NavigateScreen.SignUpPage)}
        ) {
            Text(text = "Sign Up",
                color = Color.Magenta,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold)
        }
    }
}

@Composable
fun SignInPage(navController: NavHostController
) {
    var userName by rememberSaveable { mutableStateOf("")}
    var password by rememberSaveable { mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        HeadingText()
        Spacer(modifier = Modifier.height(50.dp))
        UsernameField(userName=userName,
            onUserNameChange ={userName=it})
        Spacer(modifier = Modifier.height(20.dp))
        PasswordField(password=password,
            onPasswordChange={ password=it})
        Spacer(modifier = Modifier.height(40.dp))
        SignInButtonForForm(
            userName=userName,
            password=password,
            navController
        )
        BottomText(navController)

    }
}