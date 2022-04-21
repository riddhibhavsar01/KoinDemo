package com.example.myapplication

import org.koin.core.annotation.Factory
import org.koin.core.annotation.Single

@Single
class Student(val course: Course, val friend: Friend,val abc :ABC) {
    fun doWork(): String =
        course.study() + "\n" + friend.play() + abc.dostudy()
}
@Single
class Friend {
    fun play(): String = "I am playing with my friend"
}
@Single
class Course {
    fun study(): String = "I am studying"
}
@Factory
class ABC {
    fun dostudy(): String = "I am studying"
}