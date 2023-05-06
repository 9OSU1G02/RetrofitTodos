package com.gosu1902.retrofittodos

data class Todo(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)