package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val message = intent.getStringExtra("MESSAGE") ?: "No Message"
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MessageScreen(message)
                }
            }
        }
    }
}

@Composable
fun MessageScreen(message: String, modifier: Modifier = Modifier) {
    Text(
        text = "Message: $message",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun MessageScreenPreview() {
    MyApplicationTheme {
        MessageScreen("Preview Message")
    }
}
