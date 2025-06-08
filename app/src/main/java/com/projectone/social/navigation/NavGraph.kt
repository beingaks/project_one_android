package com.projectone.social.navigation

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import  androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import  androidx.navigation.NavHostController
import  androidx.navigation.compose.NavHost
import  androidx.navigation.compose.composable
import  com.projectone.social.ui.screens.authscreen.LoginScreen
import  com.projectone.social.ui.screens.authscreen.SignupScreen
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.projectone.social.ui.screens.addPostScreen.AddPost
import com.projectone.social.ui.screens.chat.Chat
import com.projectone.social.ui.screens.homeScreen.Home
import androidx.compose.runtime.getValue
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PostAdd
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun NavGraph (navHostController: NavHostController, modifier: Modifier = Modifier, isLoggedIn: Boolean) {
    NavHost (navController = navHostController, startDestination = if (isLoggedIn) ScreenRoutes.AppNav.route else ScreenRoutes.AuthNav.route
        , modifier = modifier) {
        AuthNav(navHostController)
        AppNav(navHostController)
    }
}

fun NavGraphBuilder.AuthNav(
    navController: NavHostController
) {
    navigation(
        startDestination = ScreenRoutes.Login.route,
        route = ScreenRoutes.AuthNav.route
    ) {
        composable(ScreenRoutes.Login.route) { LoginScreen(navController = navController) }
        composable(ScreenRoutes.Signup.route) { SignupScreen(navController = navController) }
    }
}

fun NavGraphBuilder.AppNav(
    navController: NavHostController
) {
    navigation(
        startDestination = ScreenRoutes.HomeTab.route,
        route = ScreenRoutes.AppNav.route
    ) {
        composable(ScreenRoutes.HomeTab.route) { HomeTabScreen(rootNavController = navController) }
        composable(ScreenRoutes.Chat.route) { Chat(navController = navController) }
    }
}

@Composable
fun HomeNavGraph(navController: NavHostController,  modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.Home.route,
        modifier = modifier
    ) {
        composable(ScreenRoutes.Home.route) { Home(navController = navController) }
        composable(ScreenRoutes.AddPost.route) { AddPost(navController = navController) }
    }
}

@Composable
fun HomeTabScreen(rootNavController: NavHostController) {

    val navController = rememberNavController()

    Scaffold (
        bottomBar = {
            BottomNavigation {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination?.route
                Log.d("navigation", "currenDestination" + currentDestination)
                bottomTabList.forEach{item ->
                    BottomNavigationItem(
                        onClick = {
                            navController.navigate(item.route)
                        },
                        label = null,
                        selected = currentDestination == item.route,
                        icon = { Icon(imageVector = item.icon, contentDescription = item.label) }
                    )
                }
            }
        }
    ) {paddingValues ->
        HomeNavGraph(navController, modifier = Modifier.padding(paddingValues))
    }
}

