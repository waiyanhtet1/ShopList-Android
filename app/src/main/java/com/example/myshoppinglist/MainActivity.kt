package com.example.myshoppinglist

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myshoppinglist.components.AppBar
import com.example.myshoppinglist.components.ProfileCard
import com.example.myshoppinglist.ui.theme.MyShoppingListTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyShoppingListTheme {
                UserApplication()
            }
        }
    }

    @Composable
    fun UserApplication(userProfiles: List<UserProfile> = UserProfileList) {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "users_list") {
            composable("users_list") {
                MainScreen(userProfiles, navController)
            }
            composable("user_detail") {
                ProfileDetailPage()
            }
        }
    }

    @Composable
    fun MainScreen(userProfiles: List<UserProfile>, navController: NavHostController?) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { AppBar() }
        ) { innerPadding ->
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
            ) {
                LazyColumn(
                    modifier = Modifier.padding(10.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(userProfiles) { item ->
                        ProfileCard(
                            userProfile = item,
                            cardOnClick = {
                                navController?.navigate("user_detail")
                            })
                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        MyShoppingListTheme {
            MainScreen(userProfiles = UserProfileList, null)
        }
    }
}

