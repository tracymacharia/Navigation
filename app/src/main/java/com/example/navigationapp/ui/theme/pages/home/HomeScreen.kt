package com.example.navigationapp.ui.theme.pages.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationapp.navigations.ROUTE_ADD_PRODUCTS
import com.example.navigationapp.ui.theme.NavigationAppTheme
import com.example.navigationapp.ui.theme.pages.about.AboutScreen

@Composable
fun HomeScreen(navController: NavHostController) {
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Welcome to Home Screen")

         Button(onClick = {
             navController.navigate(ROUTE_ADD_PRODUCTS)
         }) {
        Text(text = "Add products")
         }
         Button(onClick = { /*TODO*/ }) {
            Text(text = "View products")
         }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    NavigationAppTheme {
        AboutScreen(rememberNavController())
    }
}