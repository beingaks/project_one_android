package com.projectone.social.navigation

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