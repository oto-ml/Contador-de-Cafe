package com.example.botoncafeina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.botoncafeina.ui.theme.BotoncafeinaTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BotoncafeinaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ContadorCafe()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContadorCafePreview() {
    BotoncafeinaTheme {
        ContadorCafe()
    }
}

@Composable
fun ContadorCafe() {

    var contador = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "☕ Contador de Café",
            fontSize = 28.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "${contador.value}",
            fontSize = 50.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { contador.value++ }
        ) {
            Text("Añadir taza (+1)")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { contador.value = 0 }
        ) {
            Text("Reiniciar")
        }

        Spacer(modifier = Modifier.height(20.dp))

        if (contador.value >= 10) {
            Text(
                text = "¡Demasiada cafeína!",
                color = Color.Red,
                fontSize = 22.sp
            )

            }
        }
    }
