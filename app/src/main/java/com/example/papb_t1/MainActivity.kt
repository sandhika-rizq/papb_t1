package com.example.papb_t1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.papb_t1.ui.theme.Papb_t1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Papb_t1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingApp()
                }
            }
        }
    }
}

@Composable
fun GreetingApp() {
    var greetingText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = greetingText,
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(Modifier.height(16.dp)) // Memberi jarak

        Button(onClick = {
            greetingText = "Halo, Sandhika Rizqi Ramadhan "
        }) {
            Text("Tampilkan Nama")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Papb_t1Theme {
        GreetingApp()
    }
}
