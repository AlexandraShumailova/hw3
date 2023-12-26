package com.example.hw3.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
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
        Head(text = stringResource(id = R.string.GG))
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, bottom = 70.dp),
            verticalArrangement = Arrangement.Center
        ){
            Row (
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .background(Color.White)
                    .align(Alignment.CenterHorizontally)
            ){
                Text(text = "Главное меню",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxSize(),
                    fontSize = 30.sp, fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.brown)
                )
            }
            Row (
                modifier = Modifier
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(colorResource(id = R.color.brown))
            ){}
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                navController.navigate(route = "Lessons")
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.brown))
            ) {
                Text(
                    text = stringResource(id = R.string.lessons),
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                navController.navigate(route = "Metronome")
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.brown))
            ) {
                Text(
                    text = stringResource(id = R.string.metronome),
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                navController.navigate(route = "Favourites")
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.brown))
            ) {
                Text(
                    text = stringResource(id = R.string.favourites),
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                navController.navigate(route = "Progress")
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.brown))
            ) {
                Text(
                    text = stringResource(id = R.string.progress),
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                navController.navigate(route = "Feedback")
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.brown))
            ) {
                Text(
                    text = stringResource(id = R.string.feedback),
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun Head(text: String) {
    Row(
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.brown)),
//            .padding(start = 15.dp, end = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = text,
            color = Color.White, fontSize = 25.sp)
    }
}

@Composable
fun HeadWithBack(text: String, navController: NavHostController) {
    Row(
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.brown))
            .padding(start = 15.dp, end = 15.dp)
            .clickable {
                navController.navigate(route = "MainMenu")
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(painter = painterResource(id = R.drawable.back), contentDescription = "back",
            tint = Color.White
        )
        Text(text = text,
            color = Color.White, fontSize = 25.sp)
        Spacer(modifier = Modifier.width(24.dp))
    }
}