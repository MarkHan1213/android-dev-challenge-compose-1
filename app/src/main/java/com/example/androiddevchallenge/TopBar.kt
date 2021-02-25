package com.example.androiddevchallenge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(title: String) {
    Box(
        Modifier
            .fillMaxWidth()
            .background(Color.Cyan)
    ) {
        Row(Modifier.height(48.dp)) {
        }
        Text(title, Modifier.align(Alignment.Center), color = Color.Black)
    }
}

@Preview
@Composable
fun PreViewTopBar() {
    TopBar(title = "狗狗")
}