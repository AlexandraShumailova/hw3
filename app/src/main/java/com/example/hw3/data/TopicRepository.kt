package com.example.hw3.data

import kotlinx.coroutines.delay
import java.lang.Thread.sleep

interface TopicRepInt{
    fun getTopics(): List<Topic>
}

class TopicRepository():TopicRepInt {
    override fun getTopics(): List<Topic>{
        sleep(2000)
        return topicList
    }
}