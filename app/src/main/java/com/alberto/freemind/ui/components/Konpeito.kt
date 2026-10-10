package com.alberto.freemind.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.alberto.freemind.R

/** Los colores de konpeito que pueden salir */
private val konpeitos = listOf(
    R.drawable.ic_konpeito_pink,
    R.drawable.ic_konpeito_yellow,
    R.drawable.ic_konpeito_green,
    R.drawable.ic_konpeito_blue,
    R.drawable.ic_konpeito_white,
)

/**
 * Caramelo estrella (konpeito) de un color al azar.
 * `remember` guarda el color elegido para que no cambie cada vez que se repinta la pantalla.
 */
@Composable
fun Konpeito(contentDescription: String?, modifier: Modifier = Modifier) {
    val konpeito = remember { konpeitos.random() }
    Image(
        painter = painterResource(konpeito),
        contentDescription = contentDescription,
        modifier = modifier.size(20.dp)
    )
}
