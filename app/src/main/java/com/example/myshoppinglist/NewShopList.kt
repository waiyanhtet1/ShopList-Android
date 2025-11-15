package com.example.myshoppinglist

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NewShopList(nameInput: String, onTextChange: (newInput: String) -> Unit, onAdd: () -> Unit) {
    Row(modifier = Modifier.fillMaxSize()) {
        TextField(
            value = nameInput,
            onValueChange = onTextChange
        )

        Button(
            onClick = onAdd
        ) {
            Text("Add Item")
        }
    }
}