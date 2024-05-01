package com.example.empresaalimentos.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.empresaalimentos.screens.EmpresaLoginScreen
import com.example.empresaalimentos.screens.home.EmpresaHomeScreen

@Composable
fun EmpresaNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = EmpresaScreens.LoginScreen.name
    ) {
        composable(EmpresaScreens.LoginScreen.name){
            //EmpresaLoginScreen(navController = navController)
            EmpresaLoginScreen(navController = navController)
        }
        composable(EmpresaScreens.HomeScreen.name){
            //EmpresaHomeScreen(navController = navController)
            EmpresaHomeScreen(navController = navController)
        }
    }
}