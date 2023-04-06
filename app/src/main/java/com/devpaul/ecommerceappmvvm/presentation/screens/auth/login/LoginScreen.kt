package com.devpaul.ecommerceappmvvm.presentation.screens.auth.login

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.devpaul.ecommerceappmvvm.presentation.screens.auth.login.components.LoginContent
import com.devpaul.ecommerceappmvvm.presentation.ui.theme.EcommerceAppMVVMTheme

@Composable
fun LoginScreen(navController: NavHostController) {
    Scaffold() { paddingValues ->
        LoginContent(paddingValues, navController = navController)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    EcommerceAppMVVMTheme {
        LoginScreen(rememberNavController())
    }
}