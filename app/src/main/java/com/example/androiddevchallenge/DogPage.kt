package com.example.androiddevchallenge

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.purple500
import androidx.compose.ui.res.vectorResource


@Composable
fun DogPage() {
    Column(Modifier.fillMaxSize()) {
        DogTopBar()
        Box(modifier = Modifier
            .background(purple500)
            .fillMaxSize()) {


        }
    }
}

@Composable
private fun ChatList(dogs: List<Dog>) {
    LazyColumn(
        Modifier
            .fillMaxWidth()
            .background(White)
    ) {
        itemsIndexed(dogs) { index, dog ->
            DogListItem(dog)
            if (index < dogs.size - 1) {
                Divider(
                    startIndent = 68.dp,
                    color = Transparent,
                    thickness = 10f.dp
                )
            }
        }
    }
}


@Composable
fun DogListItem(dog : Dog) {
    Row(
        Modifier
            .fillMaxWidth()
            .clickable {
            }) {
        Image(
            ImageVector.Companion.vectorResource(dog.avatar),
            dog.name,
            Modifier
                .align(Alignment.CenterHorizontally)
                .size(200.dp)
                .clip(RoundedCornerShape(5.dp))
        )
    }
}

@Preview
@Composable
fun PreViewDogListItem() {
    val dog = Dog("拉布拉多","这是拉布拉多",R.drawable.avatar_2)
    DogListItem(dog = dog)
}

@Composable
fun DogTopBar() {
    TopBar(title = "Dog")
}