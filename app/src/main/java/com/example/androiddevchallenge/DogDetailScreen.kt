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
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DogDetailsContent(
    modifier: Modifier = Modifier,
    dog: Dog?,
    onBack: (() -> Unit)
) {
    if (dog != null) {
        Scaffold(
            modifier.fillMaxSize(),
            topBar = {
                TopBar(dog.name)
            },
        ) {
            Spacer(modifier = Modifier.fillMaxSize())
            Column(Modifier.padding(20.dp).fillMaxSize()) {
                Image(
                    painter = painterResource(id = dog.avatar),
                    dog.name,
                    Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(5.dp)),
                    contentScale = ContentScale.Crop
                )
                Text(text = dog.conteng, Modifier.padding(20.dp), fontSize = 20.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDogDetailsContent() {
    val dog = Dog("拉布拉多", "这是拉布拉多", R.drawable.labuladuo)
    DogDetailsContent(dog = dog) {}
}
