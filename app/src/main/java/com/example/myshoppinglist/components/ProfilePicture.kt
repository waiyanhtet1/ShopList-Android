package com.example.myshoppinglist.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ProfilePicture(drawableId: Int, status: Boolean ,imageSize: Dp = 70.dp) {
    Card(
        shape = CircleShape,
        border = BorderStroke(
            width = 4.dp, color = if (status) Color.Green else Color.Red
        ),
        modifier = Modifier.padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Image(
            painter = painterResource(id = drawableId),
            contentDescription = "Profile Image",
            modifier = Modifier.size(imageSize),
            contentScale = ContentScale.Crop
        )
    }
}
