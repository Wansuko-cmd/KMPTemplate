package com.template

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list.forEach(::println)
        setContent {
            MainView()

        }
    }
}

private val list = (1..100)
    .filter { it % 3 == 0 }
    .joinToString { it.toString() }
