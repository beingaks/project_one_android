package com.projectone.social.ui.screens.authscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.material3.Button

@Composable
fun LoginScreen (navController: NavHostController) {
    Column {
        Text(text = "This is screen 1")
        Button(onClick = {navController.navigate("signup")}) {
            Text("Navigate to sign up")
        }
    }
}