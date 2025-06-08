package com.projectone.social

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.projectone.social.ui.theme.ProjectOneTheme
import androidx.navigation.compose.rememberNavController
import com.projectone.social.navigation.NavGraph
import androidx.navigation.NavHostController

class MainActivity : ComponentActivity() {
    var isLoggedIn = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            ProjectOneTheme {
                  MainScaffold(navController, isLoggedIn)
            }
        }
    }
}

@Composable
fun MainScaffold (navController: NavHostController, isLoggedIn: Boolean) {
    Scaffold {paddingValues ->
        NavGraph(navHostController = navController,
            modifier = Modifier.padding(paddingValues),
            isLoggedIn = isLoggedIn)}
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ProjectOneTheme {
//        MainScaffold("Android")
//    }
//}