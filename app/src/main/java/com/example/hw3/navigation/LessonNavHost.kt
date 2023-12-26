package com.example.hw3.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hw3.screens.Favourites
import com.example.hw3.screens.Feedback
import com.example.hw3.screens.Lesson
import com.example.hw3.screens.Lessons
import com.example.hw3.screens.MainMenu
import com.example.hw3.screens.Metronome
import com.example.hw3.screens.Progress

@Composable
fun LessonNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "Lessons"
    ) {
        composable(route = "Lessons") {
            Lessons(navController)
        }
    }
}