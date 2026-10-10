package com.alberto.freemind.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alberto.freemind.domain.Task
import com.alberto.freemind.ui.components.TaskCard
import com.alberto.freemind.ui.fakeTasks
import com.alberto.freemind.ui.theme.FreeMindTheme


@Composable
fun TaskListScreen(tasks: List<Task>, modifier: Modifier = Modifier) {
    var doneIds by remember { mutableStateOf(setOf<Long>()) }

    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(tasks, key = { it.id }) { task ->
            TaskCard(
                task = task,
                isDone = task.id in doneIds,
                onDoneClick = {
                    doneIds = if (task.id in doneIds) doneIds - task.id else doneIds + task.id
                }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TaskListScreenPreview() {
    FreeMindTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            TaskListScreen(tasks = fakeTasks)
        }
    }
}