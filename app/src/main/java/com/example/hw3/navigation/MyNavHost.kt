package com.example.hw3.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.hw3.data.TopicRepInt
import com.example.hw3.data.TopicRepository
import com.example.hw3.data.TopicViewModel
import com.example.hw3.screens.Favourites
import com.example.hw3.screens.Feedback
import com.example.hw3.screens.Lesson
import com.example.hw3.screens.Lessons
import com.example.hw3.screens.MainMenu
import com.example.hw3.screens.Metronome
import com.example.hw3.screens.Progress

@Composable
fun CustomNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "MainMenu"
    ) {
        composable(route = "MainMenu") {
            MainMenu(navController)
        }
        composable(route = "Lessons") {
            val view = TopicRepository()
            Lessons(TopicViewModel(view), navController)
        }
        composable(route = "Favourites") {
            Favourites(navController)
        }
        composable(route = "Metronome") {
            Metronome(navController)
        }
        composable(route = "Progress") {
            Progress(navController)
        }
        composable(route = "Feedback") {
            Feedback(navController)
        }

        composable(route = "Lesson/{name}/{theory}/{practise}",
            arguments = listOf(
                navArgument("name"){
                type = NavType.StringType
                defaultValue = "1"
                nullable = true },

                navArgument("theory"){
                type = androidx.navigation.NavType.StringType
                defaultValue = "1"
                nullable = true } ,

                navArgument("practise"){
                type = androidx.navigation.NavType.StringType
                defaultValue = "1"
                nullable = true }
            )
        ) {entry ->
            Lesson(name = entry.arguments?.getString("name"),
                theory = entry.arguments?.getString("theory"),
                practise = entry.arguments?.getString("practise"),
                navController)
        }
    }
}
