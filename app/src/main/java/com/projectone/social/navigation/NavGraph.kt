package com.projectone.social.navigation

import  androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import  androidx.navigation.NavHostController
import  androidx.navigation.compose.NavHost
import  androidx.navigation.compose.composable
import  com.projectone.social.ui.screens.authscreen.LoginScreen
import  com.projectone.social.ui.screens.authscreen.SignupScreen
import androidx.compose.ui.Modifier

@Composable
fun NavGraph (navHostController: NavHostController, modifier: Modifier = Modifier) {
    NavHost (navController = navHostController, startDestination = "signup", modifier = modifier) {
        composable ("login") { LoginScreen(navController = navHostController) }
        composable ("signup") { SignupScreen(navController = navHostController) }
    }
}