package com.example.myshoppinglist

data class UserProfile constructor(val name: String, val status: Boolean, val drawableId: Int)

val UserProfileList = arrayListOf<UserProfile>(
    UserProfile(name = "John Doe", status = true, drawableId = R.drawable.bear),
    UserProfile(name = "Peter Parker", status = true, drawableId = R.drawable.panda),
    UserProfile(name = "Show White", status = false, drawableId = R.drawable.cat),
    UserProfile(name = "John Doe", status = true, drawableId = R.drawable.bear),
    UserProfile(name = "Peter Parker", status = true, drawableId = R.drawable.panda),
    UserProfile(name = "Show White", status = false, drawableId = R.drawable.cat),
    UserProfile(name = "John Doe", status = true, drawableId = R.drawable.bear),
    UserProfile(name = "Peter Parker", status = true, drawableId = R.drawable.panda),
    UserProfile(name = "Show White", status = false, drawableId = R.drawable.cat),
    UserProfile(name = "John Doe", status = true, drawableId = R.drawable.bear),
    UserProfile(name = "Peter Parker", status = true, drawableId = R.drawable.panda),
    UserProfile(name = "Show White", status = false, drawableId = R.drawable.cat)
)