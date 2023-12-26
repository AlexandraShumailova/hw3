package com.example.hw3.screens

import androidx.compose.foundation.background
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.hw3.R
import com.example.hw3.data.Lesson
import com.example.hw3.data.lessonList
import kotlinx.coroutines.delay

@Composable
fun Lesson(name: String?, theory: String?, practise: String?, navController: NavHostController){
    val showTh = remember {
        mutableStateOf(true)
    }
    Column {
        LessonHeader(text = name!!, navController = navController)
        Row(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
                .background(color = colorResource(id = R.color.brown))
                .padding(vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = stringResource(id = R.string.theory),
                color = if(showTh.value){ Color.White }else{Color.Gray},
                fontSize = 20.sp,
                modifier = Modifier
                    .weight(1f)
                    .clickable { showTh.value = true },
                textAlign = TextAlign.Center)
            Text(text = stringResource(id = R.string.practise),
                color = if(!showTh.value){ Color.White }else{Color.Gray},
                fontSize = 20.sp,
                modifier = Modifier
                    .weight(1f)
                    .clickable { showTh.value = false },
                textAlign = TextAlign.Center)
        }
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        ){
            if (showTh.value){
                Text(text = theory!!)
            } else {
                Text(text = practise!!)
            }
        }
    }
}

@Composable
fun LessonHeader(text: String, navController: NavHostController) {
    Row(
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.brown))
            .padding(start = 15.dp, end = 15.dp)
            .clickable {
                navController.navigate(route = "Lessons")
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