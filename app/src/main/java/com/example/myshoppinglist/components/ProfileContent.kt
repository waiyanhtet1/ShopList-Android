package com.example.myshoppinglist.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun ProfileContent(name: String, status: Boolean, nameSize: TextStyle) {
    Column() {
        Text(name, style = nameSize)
        Text(
            if (status) "Active Now" else "Offline",
            style = MaterialTheme.typography.labelLarge,
            color = Color.Gray,
        )
    }
}
