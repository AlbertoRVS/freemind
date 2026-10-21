package com.alberto.freemind.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.alberto.freemind.domain.TaskType
import com.alberto.freemind.data.fakeTasks

@Composable
fun OptionalScreen(modifier: Modifier = Modifier) {
    TaskListScreen(
        tasks = fakeTasks.filter { it.type == TaskType.OPTIONAL },
        modifier = modifier
    )
}