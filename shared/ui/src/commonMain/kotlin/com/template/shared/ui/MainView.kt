package com.template.shared.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.template.shared.lib.helloWorld
import com.template.shared.ui.theme.TemplateTheme

@Composable
fun MainView() {
    TemplateTheme {
        Text(text = helloWorld())
    }
}
