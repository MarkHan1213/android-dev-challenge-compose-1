/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.data.DogViewModel
import com.example.androiddevchallenge.ui.theme.purple500
import com.example.androiddevchallenge.ui.theme.white2

@Composable
fun DogPage(viewModel: DogViewModel) {
    Column(Modifier.fillMaxSize()) {
        DogTopBar()
        Box(
            modifier = Modifier
                .background(purple500)
                .fillMaxSize()
        ) {
            DogList(viewModel.dogs)
        }
    }
}

@Composable
private fun DogList(dogs: List<Dog>) {
    LazyColumn(
        Modifier
            .fillMaxWidth()
            .background(white2)
    ) {
        itemsIndexed(dogs) { index, dog ->
            DogListItem(dog)
            if (index < dogs.size - 1) {
                Divider(startIndent = 68.dp, color = Color.Gray, thickness = 0.8f.dp)
            }
        }
    }
}

@Composable
fun DogListItem(dog: Dog, viewModel: DogViewModel = viewModel()) {
    Row(
        Modifier
            .fillMaxWidth()
            .clickable {
                viewModel.goToDetail(dog)
            },
    ) {
        Image(
            painterResource(dog.avatar), "avatar",
            Modifier
                .padding(12.dp, 8.dp, 8.dp, 8.dp)
                .size(48.dp)
                .clip(RoundedCornerShape(4.dp))
        )
        Column(
            Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        ) {
            Text(dog.name, fontSize = 17.sp,)
            Text(dog.conteng, fontSize = 14.sp, maxLines = 1)
        }
    }
}

@Preview
@Composable
fun PreViewDogListItem() {
    val dog = Dog("拉布拉多", "这是拉布拉多", R.drawable.labuladuo)
    DogListItem(dog = dog)
}

@Composable
fun DogTopBar() {
    TopBar(title = "Dog")
}
