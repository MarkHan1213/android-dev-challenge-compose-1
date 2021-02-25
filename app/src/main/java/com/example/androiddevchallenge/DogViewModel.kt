package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class DogViewModel :ViewModel(){
    var dogs by mutableStateOf(
        listOf(
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2),
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2),
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2),
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2),
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2),
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2),
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2),
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2),
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2),
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2),
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2),
            Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2)
        )
    )
}