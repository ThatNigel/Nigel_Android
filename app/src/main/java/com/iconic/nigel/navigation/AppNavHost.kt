package com.iconic.nigel.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iconic.nigel.ui.theme.screens.Dashboard_Screen
import com.iconic.nigel.ui.theme.screens.home.Home_Screen
import com.iconic.nigel.ui.theme.screens.login.Login_Screen
import com.iconic.nigel.ui.theme.screens.register.Register_screen
import com.iconic.nigel.ui.theme.screens.splash.Splash_screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_SPLASH) {
    NavHost(navController= navController,
        modifier =Modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME){
            Home_Screen(navController)
        }
        composable(ROUTE_LOGIN){
            Login_Screen(navController)
        }
        composable(ROUTE_REGISTER){
            Register_screen(navController)
        }
        composable(ROUTE_SPLASH){
            Splash_screen(navController)
        }
        composable(ROUTE_DASHBOARD){
            Dashboard_Screen()
        }

    }
}