package com.example.demoapplication

import android.graphics.fonts.SystemFonts
import android.os.Bundle
import android.util.Log
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
//                SystemFonts.getAvailableFonts().forEach {
//                    Log.d("jeloo", "onCreate: ${it.}")
//                }
//                Log.d("jeloo", "onCreate: ${SystemFonts.getAvailableFonts()}")
                var name = remember {
                    mutableStateOf("")
                }
                var names = remember{
                    mutableStateOf(listOf<String>())
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Gray)
                        .padding(16.dp)
                        .padding(top = 60.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        OutlinedTextField(
                            value = name.value,
                            onValueChange = { text ->
                                name.value = text
                            },
                        )
                        Button(
                            onClick = {
                                if (name.value.isNotBlank()) {
                                    names.value = names.value + name.value
                                }
                            }
                        ) {
                            Text(
                                text = "Add to List"
                            )
                        }
                    }
                    LazyColumn {
                        items(names.value) { currentName ->
                            Text(text = currentName)
                        }
                    }
                }
            }
        }
    }
}