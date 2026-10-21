package com.alberto.freemind

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.alberto.freemind.ui.navigation.FreeMindBottomBar
import com.alberto.freemind.ui.navigation.FreeMindNavHost
import com.alberto.freemind.ui.theme.FreeMindTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FreeMindTheme {
                val navController = rememberNavController()
                Scaffold(
                    topBar = { FreeMindAppBar() },
                    bottomBar = { FreeMindBottomBar(navController) },
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    FreeMindNavHost(
                        navController,
                        Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/**TOP BAR*/
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun FreeMindAppBar() {
    TopAppBar(
        title = { Text(stringResource(R.string.app_name)) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        )
    )
}