package com.example.myshoppinglist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

data class ShoppingItem(
    val id: Int,
    var name: String,
    var quantity: Int,
    var isEditing: Boolean = false
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShoppingList() {
    val shopItems = remember { mutableStateListOf<ShoppingItem>() }
    val nameInput = remember { mutableStateOf<String>("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        LazyColumn(
        ) {
            items(shopItems) { item ->
                Text(text = "${item.name} - Qty ${item.quantity}")
            }
        }

        NewShopList(
            nameInput = nameInput.value,
            onTextChange = { newInput -> nameInput.value = newInput },
            onAdd = {
                shopItems.add(
                    ShoppingItem(
                        id = shopItems.size + 1,
                        name = nameInput.value,
                        quantity = 1
                    )
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShoppingList()
}





