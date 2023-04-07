package com.devpaul.ecommerceappmvvm.presentation.screens.auth.register

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.devpaul.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.devpaul.ecommerceappmvvm.presentation.screens.auth.register.componenets.RegisterComponent
import com.devpaul.ecommerceappmvvm.presentation.ui.theme.EcommerceAppMVVMTheme

@Composable
fun RegisterScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Registro",
                upAvailable = true,
                navController = navController
            )
        },
    ) { paddingValues ->
        RegisterComponent(paddingValues)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview() {
    EcommerceAppMVVMTheme {
        RegisterScreen(rememberNavController())
    }
}