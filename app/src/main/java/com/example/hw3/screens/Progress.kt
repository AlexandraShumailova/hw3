package com.example.hw3.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController

@Composable
fun Progress(navController: NavHostController){
    Column(){
        Head(text = "Prog")
        Button(
            onClick = {
                navController.navigate(route = "MainMenu")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
        ) {
            Text(
                text = "Back",
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
    }
}