package com.example.hw3.screens

import android.annotation.SuppressLint
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.hw3.data.Topic
import com.example.hw3.data.topicList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun Lessons(navController: NavHostController){
    var isLoading = remember { mutableStateOf(false) }
    suspend fun loadData() {
        isLoading.value = true
        delay(2000) // Задержка в 2 секунды
        // Место для выполнения фактической загрузки данных
        isLoading.value = false
    }

    Column(){
        HeadWithBack(text = stringResource(id = R.string.lessons), navController)
        val scope = rememberCoroutineScope()
        LaunchedEffect(Unit) {
            if (!isLoading.value) {
                loadData()
            }
        }
        if (isLoading.value){
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(start = 50.dp, end = 50.dp, bottom = 70.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                CircularProgressIndicator()
            }
        }
        else{
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(30.dp),
            ){
                topicList.forEach { item ->
                    Topic(item, navController)
                }
            }
        }

    }
}

@Composable
fun Topic(item: Topic, navController: NavHostController){
    val more = remember {
        mutableStateOf(false)
    }
    Row(modifier = Modifier
        .height(50.dp)
        .fillMaxWidth()
        .background(color = colorResource(id = R.color.white))
        .clickable {
                   more.value=!more.value
        },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(text = item.name,
            color = colorResource(id = R.color.brown), fontSize = 18.sp, fontWeight = FontWeight.Bold)
        if (!more.value){
            Icon(painter = painterResource(id = R.drawable.down), contentDescription = "down",
                tint = colorResource(id = R.color.brown))
        } else {
            Icon(painter = painterResource(id = R.drawable.up), contentDescription = "up")
        }
    }
    if(more.value){
        Column {
            item.lessons.forEach{lesson ->
                Row(modifier = Modifier
                    .height(40.dp)
                    .fillMaxSize()
                    .background(color = colorResource(id = R.color.white))
                    .clickable {
                        navController.navigate(route = "Lesson/"+lesson.name+"/"+lesson.theory+"/"+lesson.practise)
                    },
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = lesson.number,
                        color = colorResource(id = R.color.brown), fontSize = 18.sp)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = lesson.name,
                        color = colorResource(id = R.color.brown), fontSize = 18.sp)
                }
            }
        }

    }
}

