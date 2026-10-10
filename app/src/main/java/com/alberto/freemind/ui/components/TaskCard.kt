package com.alberto.freemind.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alberto.freemind.R
import com.alberto.freemind.domain.Frequency
import com.alberto.freemind.domain.Task
import com.alberto.freemind.domain.TaskType
import com.alberto.freemind.ui.theme.FreeMindTheme
import java.time.LocalDate


@Composable
fun TaskCard(
    task: Task,
    isDone: Boolean,
    onDoneClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {   // ocupa el espacio sobrante
                Text(task.title, style = MaterialTheme.typography.titleMedium)

                if (task.description.isNotBlank()) {
                    Text(task.description, style = MaterialTheme.typography.bodySmall)
                }
                if (task.dueDate != null) {
                    Text(
                        stringResource(R.string.date, task.dueDate),
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(task.candies.toString(), style = MaterialTheme.typography.titleMedium)
                Konpeito(
                    contentDescription = stringResource(R.string.candies),
                    modifier = Modifier.padding(start = 4.dp)
                )
                Checkbox(checked = isDone, onCheckedChange = { onDoneClick() })
            }

        }
    }
}

private val today = LocalDate.of(2026, 10, 7)
private val punctualTask: Task = Task(
    title = "Ir al medico",
    description = "Urologo 9:50am",
    type = TaskType.PUNCTUAL,
    dueDate = today.plusDays(4),
)
private val optionalTask: Task = Task(
    title = "Tener un detalle con Nadine",
    description = "Preparar un día de spa y masaje con velas.",
    type = TaskType.OPTIONAL
)
private val mandatoryTask: Task = Task(
    title = "Limpiar arenero",
    type = TaskType.MANDATORY,
    frequency = Frequency.DAILY
)


@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PunctualTaskPreview() {
    FreeMindTheme {
        var isDone by remember { mutableStateOf(false) }
        Surface {
            TaskCard(
                punctualTask,
                isDone = isDone,
                onDoneClick = { isDone = !isDone }
            )
        }
    }
}

@Preview
@Composable
private fun OptionalTaskPreview() {
    FreeMindTheme {
        var isDone by remember { mutableStateOf(false) }
        Surface {
            TaskCard(
                optionalTask,
                isDone = isDone,
                onDoneClick = { isDone = !isDone }
            )
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MandatoryTaskPreview() {
    FreeMindTheme {
        var isDone by remember { mutableStateOf(false) }
        Surface {
            TaskCard(
                mandatoryTask,
                isDone = isDone,
                onDoneClick = { isDone = !isDone })
        }
    }
}
