package com.projectone.social.ui.screens.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun Home (navController: NavHostController) {
    Column {
        Text(text = "This is Home screen")
    }
}