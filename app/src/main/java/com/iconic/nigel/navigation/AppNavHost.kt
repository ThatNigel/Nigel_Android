package com.iconic.nigel.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iconic.nigel.ui.theme.screens.home.Home_Screen
import com.iconic.nigel.ui.theme.screens.login.Login_Screen
import com.iconic.nigel.ui.theme.screens.register.Register_screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_HOME) {
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

    }
}