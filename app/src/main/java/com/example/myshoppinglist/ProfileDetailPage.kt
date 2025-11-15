package com.example.myshoppinglist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myshoppinglist.components.AppBar
import com.example.myshoppinglist.components.ProfileContent
import com.example.myshoppinglist.components.ProfilePicture

@Composable
fun ProfileDetailPage(userId: Int, navController: NavHostController?) {
    val userProfile = UserProfileList.first { user -> user.id == userId }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            AppBar(
                label = "User Detail",
                icon = Icons.Default.ArrowBack,
                ) { navController?.navigateUp() }
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                ProfilePicture(userProfile.drawableId, userProfile.status, imageSize = 200.dp)
                ProfileContent(
                    userProfile.name,
                    userProfile.status,
                    nameSize = MaterialTheme.typography.headlineMedium
                )
            }
        }
    }
}

@Preview
@Composable
fun ProfileDetailPreview() {
    ProfileDetailPage(1, null)
}

