package com.devpaul.ecommerceappmvvm.presentation.screens.auth.login

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.devpaul.ecommerceappmvvm.presentation.screens.auth.login.components.LoginContent
import com.devpaul.ecommerceappmvvm.presentation.ui.theme.EcommerceAppMVVMTheme

@Composable
fun LoginScreen() {
    Scaffold() { paddingValues ->
        LoginContent(paddingValues)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    EcommerceAppMVVMTheme {
        LoginScreen()
    }
}