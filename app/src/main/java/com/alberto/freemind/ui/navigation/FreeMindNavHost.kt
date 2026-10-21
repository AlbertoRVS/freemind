package com.alberto.freemind.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import com.alberto.freemind.ui.screens.MandatoryScreen
import androidx.compose.ui.Modifier
import com.alberto.freemind.ui.screens.IslandScreen
import com.alberto.freemind.ui.screens.OptionalScreen
import com.alberto.freemind.ui.screens.PunctualScreen


@Composable
fun FreeMindNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController, startDestination = MandatoryRoute, modifier = modifier) {
        composable<MandatoryRoute> { MandatoryScreen() }
        composable<PunctualRoute> { PunctualScreen() }
        composable<OptionalRoute> { OptionalScreen() }
        composable<IslandRoute> { IslandScreen() }
    }
}