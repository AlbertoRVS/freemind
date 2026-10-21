package com.alberto.freemind.ui.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun FreeMindBottomBar(navController: NavHostController) {
    val backStack by navController.currentBackStackEntryAsState()
    NavigationBar {
        bottomDestination.forEach { dest ->
            NavigationBarItem(
                selected = backStack?.destination?.hasRoute(dest.route::class) == true,
                onClick = {
                    navController.navigate(dest.route){
                        popUpTo(navController.graph.findStartDestination().id){saveState=true}
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = { Icon(dest.icon, contentDescription = null) },
                label = { Text(stringResource(dest.label)) }
            )
        }
    }
}