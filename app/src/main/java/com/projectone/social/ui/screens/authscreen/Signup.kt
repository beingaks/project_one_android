package com.projectone.social.ui.screens.authscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.material3.Button

@Composable
fun SignupScreen (navController: NavHostController) {
    Column {
        Text(text = "This is screen 2")
        Button(onClick = {navController.navigate("login")}) {
            Text("Navigate to Login")
        }
    }
}