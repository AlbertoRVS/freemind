package com.alberto.freemind.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.alberto.freemind.R


@Composable
fun IslandScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),         // ocupa toda la pantalla
        contentAlignment = Alignment.Center        // y centra lo que tiene dentro
    ) {
        Text(stringResource(R.string.proximamente))
    }
}