package com.alberto.freemind.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CleaningServices
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Park
import androidx.compose.ui.graphics.vector.ImageVector
import com.alberto.freemind.R

data class BottomDestinations(
    val route: Any,
    val icon: ImageVector,
    @StringRes val label: Int
)

val bottomDestination = listOf(
    BottomDestinations(MandatoryRoute, Icons.Default.CleaningServices, R.string.mandatory),
    BottomDestinations(OptionalRoute, Icons.Default.Favorite, R.string.optional),
    BottomDestinations(PunctualRoute, Icons.Default.Event, R.string.punctual),
    BottomDestinations(IslandRoute, Icons.Default.Park, R.string.island)
)
