package com.nikhil.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nikhil.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Nikhil")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color.Green)
            .padding(10.dp)
            .border(width = 10.dp, Color.Magenta)
            .padding(10.dp)
            .border(width = 10.dp, Color.Red)
            .padding(10.dp)
            .border(width = 10.dp, Color.Blue)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val context = LocalContext.current
        Text(text = "Hello", fontSize = 28.sp)
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "$name!", fontSize = 28.sp, modifier = Modifier.clickable {
            Toast.makeText(context, "Clicked Text", Toast.LENGTH_LONG).show()
        })
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Greetings", fontSize = 28.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}