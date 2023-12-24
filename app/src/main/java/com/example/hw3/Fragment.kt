package com.example.hw3
//
//import android.app.Fragment
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.compose.ui.platform.ComposeView
//import androidx.core.content.ContentProviderCompat.requireContext
//import androidx.navigation.compose.rememberNavController
//import com.example.draw_draw.button_navigation.NavGraph
//
//class MyFragment: Fragment() {
//    override fun onCreateView(
//        inflater: LayoutInflater?,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return ComposeView(requireContext()).apply {
//            setContent {
//                val navController = rememberNavController()
//                NavGraph(navHostController = navController)
//            }
//        }
//    }
//
//}