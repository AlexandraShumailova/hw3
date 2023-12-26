package com.example.hw3.data

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay

class TopicViewModel(private val rep: TopicRepInt) : ViewModel() {
    suspend fun loadData():List<Topic> {

        var tList = rep.getTopics()

        return tList
    }
}