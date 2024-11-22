package com.example.session8_navigationmultipledata.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.session8_navigationmultipledata.R

@Preview(showBackground = true)
@Composable
fun SplashView(

){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.Primary)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(R.drawable.umy),
            contentDescription = "",
            modifier = Modifier.size(150.dp)
        )

        Button(onClick = {
        },
            modifier = Modifier.padding(vertical = 18.dp)
                .size(width = 200.dp, height = 50.dp)){
            Text("Mulai")
        }
    }
}