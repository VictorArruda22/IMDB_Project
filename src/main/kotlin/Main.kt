import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column {
            Text("Meu Malvado Favorito 4", textAlign = TextAlign.Justify)
            Image(
                painter = painterResource("MMVF4.jpg"),
                contentDescription = "Meu Malvado Favorito 4",
                modifier = Modifier.width(200.dp)
            )

            Row {
                Text("Nota: 9,2", textAlign = TextAlign.Left)
                Text("Ano: 2024", textAlign = TextAlign.Right)
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
