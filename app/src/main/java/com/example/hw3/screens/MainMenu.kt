package com.example.hw3.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.hw3.R

//@Preview
@Composable
fun MainMenu(navController: NavHostController){
    Column {
        Head(text = "GG")
        Button(
            onClick = {
                navController.navigate(route = "Lessons")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
        ) {
            Text(
                text = stringResource(id = R.string.lessons),
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
        Button(
            onClick = {
                navController.navigate(route = "Metronome")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
        ) {
            Text(
                text = stringResource(id = R.string.metronome),
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
        Button(
            onClick = {
                navController.navigate(route = "Favourites")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
        ) {
            Text(
                text = stringResource(id = R.string.favourites),
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
        Button(
            onClick = {
                navController.navigate(route = "Progress")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
        ) {
            Text(
                text = stringResource(id = R.string.progress),
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
        Button(
            onClick = {
                navController.navigate(route = "Feedback")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
        ) {
            Text(
                text = stringResource(id = R.string.feedback),
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
        /*ButtonGo(text = R.string.lessons)
        ButtonGo(text = R.string.metronome)
        ButtonGo(text = R.string.favourites)
        ButtonGo(text = R.string.progress)
        ButtonGo(text = R.string.feedback)*/
    }

}

@Composable
fun Head(text: String) {
    Row(
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(start = 15.dp, end = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = text,
            color = Color.Black, fontSize = 30.sp, fontWeight = FontWeight.Bold,)
    }
}

@Composable
fun ButtonGo(text: Int){
    androidx.compose.material3.Button(
        onClick = {
        },
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
    ) {
        Text(
            text = stringResource(id = text),
            textAlign = TextAlign.Center,
            color = Color.White
        )
    }
}