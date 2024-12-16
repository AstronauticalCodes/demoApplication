package com.example.demoapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.demoapplication.ui.theme.DemoApplicationTheme
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Box(
////            .fillMaxSize()
////            .fillMaxWidth()
//    ) {
//        Text(
//            text = "Hello $name!",
//            fontSize = 40.sp,
//            modifier = Modifier
//                .background(Color.Red)
//                .padding(16.dp)
//                .background(Color.Gray)
//                .align(Alignment.Center)
////                .fillMaxSize()
//        )
//        Text(
//            text = "asdf",
//            fontSize = 40.sp,
//            modifier = Modifier
//                .background(Color.Red)
//                .padding(16.dp)
//                .background(Color.Gray)
//                .align(Alignment.BottomCenter)
//        )
//    }
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = null,
        modifier = Modifier
            .background(Color.Green)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DemoApplicationTheme {
        Greeting("Android")
    }
}