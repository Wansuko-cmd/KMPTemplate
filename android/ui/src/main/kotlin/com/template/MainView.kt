package com.template

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.template.theme.TemplateTheme

@Composable
fun MainView() {
    TemplateTheme {
        Test()
    }
}

@Composable
fun Test() {
    Text(text = "Hello World")
}
