package com.example.hw3.data

class Topic(
    var number: Int,
    var name: String,
    var lessons: List<Lesson>
)

var topic1 = Topic(1,"Тема 1. Базовые понятия и навыки", listOf(les1, les2, les3))
var topic2 = Topic(2, "Тема 2. Звуковые сочетания", listOf(les4, les5))

var topicList = listOf<Topic>(topic1, topic2)
var emptyTopicList = listOf<Topic>()