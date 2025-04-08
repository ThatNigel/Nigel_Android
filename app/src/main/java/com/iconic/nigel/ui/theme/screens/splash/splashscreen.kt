package com.iconic.nigel.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.iconic.nigel.R
import com.iconic.nigel.navigation.ROUTE_HOME
import kotlinx.coroutines.delay

@Composable
fun Splash_screen(navController: NavHostController) {

    LaunchedEffect(Unit) {
        delay(2000)  // Splash screen visible for 2 seconds
       navController.navigate(ROUTE_HOME)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.nigels), // Replace with your image
            contentDescription = "App Logo",
            modifier = Modifier.background(Color.Black).height(100.dp).width(100.dp),


                // Apply fade-in effect
        )
    }
}



@Preview
@Composable
private fun Splashprev() {
    Splash_screen(rememberNavController())
    
}