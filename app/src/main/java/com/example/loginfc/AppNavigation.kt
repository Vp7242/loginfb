package com.example.loginfc

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginfc.ui.theme.LoginFcTheme

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "login") {
        composable("login"){
            LoginScreen(navController)
        }
        composable("signup"){
            SignupScreen(navController)
        }
        composable("home"){
            HomeScreen(navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppNavigationPreview() {
    LoginFcTheme {
        AppNavigation()
    }
}