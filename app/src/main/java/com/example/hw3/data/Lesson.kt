package com.example.hw3.data

class Lesson (
    var id: Int,
    var number: String,
    var name: String,
    var theory: String,
    var practise: String,
)

var les1 = Lesson(1,"Урок 1.","Ноты", "Теория урока1 - Ноты", "Практика урока1 - Ноты")
var les2 = Lesson(2, "Урок 2.","Размеры", "Теория урока2 - Размеры", "Практика урока2 - Размеры")
var les3 = Lesson(3, "Урок 3.","Обозначения", "Теория урока3 - Обозначения", "Практика урока3 - Обозначения")
var les4 = Lesson(4, "Урок 4.","Интервалы", "Теория урока4 - Интервалы", "Практика урока4 - Интервалы")
var les5 = Lesson(5 ,"Урок 5.","Аккорды", "Теория урока5 - Аккорды", "Практика урока5 - Аккорды" )

var lessonList = listOf(les1, les2, les3, les4, les5)