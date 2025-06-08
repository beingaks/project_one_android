package com.projectone.social.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ScreenRoutes(val route: String) {
    // auth navigation
    data object AuthNav: ScreenRoutes("AUTH_NAV_GRAPH")
    data object Login: ScreenRoutes("login")
    data object Signup: ScreenRoutes("signup")

    // app navigation
    data object AppNav: ScreenRoutes("APP_NAV_GRAPH")
    data object Chat: ScreenRoutes("chat")
    data object Notification: ScreenRoutes("notification")

    //Home tab
    data object HomeTab: ScreenRoutes("HOME_TAB_GRAPH")
    data object Home: ScreenRoutes("HOME")
    data object Explore: ScreenRoutes("explore")
    data object Search: ScreenRoutes("Search")
    data object AddPost: ScreenRoutes("AddPost")
}

data class navigationItem (
    val label: String,
    val route: String,
    val icon: ImageVector
)

val bottomTabList = mutableListOf(
    navigationItem(
        label = "Home",
        route = ScreenRoutes.Home.route,
        icon = Icons.Default.Home
    ),
    navigationItem(
        label = "Add Post",
        route = ScreenRoutes.AddPost.route,
        icon = Icons.Default.Add
    ),
    navigationItem(
        label = "Search",
        route = ScreenRoutes.Search.route,
        icon = Icons.Default.Search
    )
)