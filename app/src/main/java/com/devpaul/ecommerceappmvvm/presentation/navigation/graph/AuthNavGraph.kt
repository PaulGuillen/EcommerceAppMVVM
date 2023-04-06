package com.devpaul.ecommerceappmvvm.presentation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.devpaul.ecommerceappmvvm.presentation.navigation.Graph
import com.devpaul.ecommerceappmvvm.presentation.navigation.screen.AuthScreen
import com.devpaul.ecommerceappmvvm.presentation.screens.auth.login.LoginScreen
import com.devpaul.ecommerceappmvvm.presentation.screens.auth.register.RegisterScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(navController)
        }
        composable(route = AuthScreen.Register.route) {
            RegisterScreen()
        }
    }
}