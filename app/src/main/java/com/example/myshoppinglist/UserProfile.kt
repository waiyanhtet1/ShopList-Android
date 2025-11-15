package com.example.myshoppinglist

data class UserProfile constructor(
    val id: Int,
    val name: String,
    val status: Boolean,
    val drawableId: Int
)

val UserProfileList = arrayListOf<UserProfile>(
    UserProfile(id = 1, name = "John Doe", status = true, drawableId = R.drawable.bear),
    UserProfile(id = 2, name = "Peter Parker", status = true, drawableId = R.drawable.panda),
    UserProfile(id = 3, name = "Show White", status = false, drawableId = R.drawable.cat),
    UserProfile(id = 4, name = "John Doe", status = true, drawableId = R.drawable.bear),
    UserProfile(id = 5, name = "Peter Parker", status = true, drawableId = R.drawable.panda),
    UserProfile(id = 6, name = "Show White", status = false, drawableId = R.drawable.cat),
    UserProfile(id = 7, name = "John Doe", status = true, drawableId = R.drawable.bear),
    UserProfile(id = 8, name = "Peter Parker", status = true, drawableId = R.drawable.panda),
    UserProfile(id = 9, name = "Show White", status = false, drawableId = R.drawable.cat),
    UserProfile(id = 10, name = "John Doe", status = true, drawableId = R.drawable.bear),
    UserProfile(id = 11, name = "Peter Parker", status = true, drawableId = R.drawable.panda),
    UserProfile(id = 12, name = "Show White", status = false, drawableId = R.drawable.cat)
)