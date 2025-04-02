package com.iconic.nigel.ui.theme.screens.home

import android.media.Image
import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iconic.nigel.R

@Composable
fun Home_Screen(modifier: Modifier = Modifier) {
    Column(modifier=Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.Top ){
        Text(text ="Home",
            color= Color.Red ,
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp ,
        )

        Text( "Welcome to Nigel's App ",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.DarkGray,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier=Modifier.height(30.dp))
        Image(painter = painterResource(id = R.drawable.bmw3) ,
            contentDescription = "BMW" ,
            modifier=Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Spacer(modifier=Modifier.height(30.dp) )

        Text("This app is meant to showcase the perfomance of BMW cars " ,
            fontSize = 18.sp ,
            fontFamily = FontFamily.SansSerif ,
            color = Color.Black ,
            fontStyle = FontStyle.Normal ,
        )
        Spacer(modifier=Modifier.height(30.dp) )


        Button(onClick = {/*TODO*/ },
            modifier = Modifier.width(300.dp)){
            Text(text = "Login",
                fontSize = 30.sp,
                )
        }
        Spacer(modifier=Modifier.height(30.dp) )

        Button(onClick =  {/*TODO*/ },
            modifier = Modifier.width(300.dp)){
            Text(text ="Register",
                fontSize = 30.sp,
                )
        }

    }

}

@Preview
@Composable
private fun Homeprev() {
    Home_Screen()

}
