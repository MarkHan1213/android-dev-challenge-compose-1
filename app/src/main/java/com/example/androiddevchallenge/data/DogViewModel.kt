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
package com.example.androiddevchallenge.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.Dog
import com.example.androiddevchallenge.R

class DogViewModel : ViewModel() {
    var dogs by mutableStateOf(
        listOf(
            Dog(
                "吉娃娃",
                "吉娃娃犬属于小型犬中体形最小的，但是这并不能说明它们是最娇弱的，相反，吉娃娃有着坚韧的意志，非常忠诚与主人，灵活度极高，是一种聪明的宠物。姿态优雅、性格警惕、动作迅速，以匀称的体格和娇小的体型而广泛的受人所青睐。",
                R.drawable.jiwawa
            ),
            Dog(
                "金毛",
                "金毛犬，属于匀称有力、性格活泼的一个犬种，特征是结构稳固、身体各个部位的比例合理而协调，腿既不太长也会显得笨拙，表情友善，热情、机警、自信，而且不怕生。",
                R.drawable.jinmao
            ),
            Dog(
                "柴犬",
                "柴犬是体型中等并且又最古老的犬。柴犬能够应付陡峭的丘陵和山脉的斜坡，拥有灵敏的感官，使得柴犬屡次成为上乘的狩猎犬。柴犬性格活泼、好动。对自己喜欢的玩具、会一天到晚的把玩。其对外有极强警惕性，能为户主看家护院。其特别是对大型同类，并且不服输。\n",
                R.drawable.chaiquan
            ),
            Dog(
                "杜宾犬",
                "杜宾犬，起源于19世纪后期。按体型它属于大型犬;按毛发,它则属于短毛型;按用途，它又属于狩猎犬。活泼友善、坚定机敏、遇事镇静;顺从，对家庭十分忠诚，喜欢小孩。脾气温和、警惕性一般。在和饲主关系融洽的情况下，通常是不会轻易发怒的。",
                R.drawable.dubin
            ),
            Dog(
                "哈士奇",
                "西伯利亚雪橇犬是原始的古老犬种，主要生活在在西伯利亚东北部、格陵兰南部。哈士奇名字是源自其独特的嘶哑叫声。\n" +
                    " \n" +
                    "　　友好、温柔、警觉，聪明，温顺，热情并喜欢交往。它不会呈现出护卫犬那种强烈的领地占有欲，也不会对陌生人产生过多的怀疑，对别的犬类也不会有攻击性。成年犬应该具备一定程度的谨慎和威严。\n" +
                    " ",
                R.drawable.hashiqi
            ),
            Dog(
                "萨摩耶",
                "　萨摩耶犬（英文：Samoyed），别称萨摩耶，原是西伯利亚的原住民萨摩耶族培育出的犬种，一岁前调皮、灵动。",
                R.drawable.samoye
            ),
            Dog(
                "拉布拉多",
                "拉布拉多猎犬,别名:拉布拉多、拉不拉多,英文名:labrador retriever.属于一种结构坚固、中等体型、接合较短的犬,它健康、稳定性良好的结构使其可成为寻回猎物的猎犬。",
                R.drawable.labuladuo
            ),
            Dog(
                "吉娃娃",
                "吉娃娃犬属于小型犬中体形最小的，但是这并不能说明它们是最娇弱的，相反，吉娃娃有着坚韧的意志，非常忠诚与主人，灵活度极高，是一种聪明的宠物。姿态优雅、性格警惕、动作迅速，以匀称的体格和娇小的体型而广泛的受人所青睐。",
                R.drawable.jiwawa
            ),
            Dog(
                "金毛",
                "金毛犬，属于匀称有力、性格活泼的一个犬种，特征是结构稳固、身体各个部位的比例合理而协调，腿既不太长也会显得笨拙，表情友善，热情、机警、自信，而且不怕生。",
                R.drawable.jinmao
            ),
            Dog(
                "柴犬",
                "柴犬是体型中等并且又最古老的犬。柴犬能够应付陡峭的丘陵和山脉的斜坡，拥有灵敏的感官，使得柴犬屡次成为上乘的狩猎犬。柴犬性格活泼、好动。对自己喜欢的玩具、会一天到晚的把玩。其对外有极强警惕性，能为户主看家护院。其特别是对大型同类，并且不服输。\n",
                R.drawable.chaiquan
            ),
            Dog(
                "杜宾犬",
                "杜宾犬，起源于19世纪后期。按体型它属于大型犬;按毛发,它则属于短毛型;按用途，它又属于狩猎犬。活泼友善、坚定机敏、遇事镇静;顺从，对家庭十分忠诚，喜欢小孩。脾气温和、警惕性一般。在和饲主关系融洽的情况下，通常是不会轻易发怒的。",
                R.drawable.dubin
            ),
            Dog(
                "哈士奇",
                "西伯利亚雪橇犬是原始的古老犬种，主要生活在在西伯利亚东北部、格陵兰南部。哈士奇名字是源自其独特的嘶哑叫声。\n" +
                    " \n" +
                    "　　友好、温柔、警觉，聪明，温顺，热情并喜欢交往。它不会呈现出护卫犬那种强烈的领地占有欲，也不会对陌生人产生过多的怀疑，对别的犬类也不会有攻击性。成年犬应该具备一定程度的谨慎和威严。\n" +
                    " ",
                R.drawable.hashiqi
            ),
            Dog(
                "萨摩耶",
                "　萨摩耶犬（英文：Samoyed），别称萨摩耶，原是西伯利亚的原住民萨摩耶族培育出的犬种，一岁前调皮、灵动。",
                R.drawable.samoye
            ),
            Dog(
                "拉布拉多",
                "拉布拉多猎犬,别名:拉布拉多、拉不拉多,英文名:labrador retriever.属于一种结构坚固、中等体型、接合较短的犬,它健康、稳定性良好的结构使其可成为寻回猎物的猎犬。",
                R.drawable.labuladuo
            ),
            Dog(
                "吉娃娃",
                "吉娃娃犬属于小型犬中体形最小的，但是这并不能说明它们是最娇弱的，相反，吉娃娃有着坚韧的意志，非常忠诚与主人，灵活度极高，是一种聪明的宠物。姿态优雅、性格警惕、动作迅速，以匀称的体格和娇小的体型而广泛的受人所青睐。",
                R.drawable.jiwawa
            ),
            Dog(
                "金毛",
                "金毛犬，属于匀称有力、性格活泼的一个犬种，特征是结构稳固、身体各个部位的比例合理而协调，腿既不太长也会显得笨拙，表情友善，热情、机警、自信，而且不怕生。",
                R.drawable.jinmao
            ),
            Dog(
                "柴犬",
                "柴犬是体型中等并且又最古老的犬。柴犬能够应付陡峭的丘陵和山脉的斜坡，拥有灵敏的感官，使得柴犬屡次成为上乘的狩猎犬。柴犬性格活泼、好动。对自己喜欢的玩具、会一天到晚的把玩。其对外有极强警惕性，能为户主看家护院。其特别是对大型同类，并且不服输。\n",
                R.drawable.chaiquan
            ),
            Dog(
                "杜宾犬",
                "杜宾犬，起源于19世纪后期。按体型它属于大型犬;按毛发,它则属于短毛型;按用途，它又属于狩猎犬。活泼友善、坚定机敏、遇事镇静;顺从，对家庭十分忠诚，喜欢小孩。脾气温和、警惕性一般。在和饲主关系融洽的情况下，通常是不会轻易发怒的。",
                R.drawable.dubin
            ),
            Dog(
                "哈士奇",
                "西伯利亚雪橇犬是原始的古老犬种，主要生活在在西伯利亚东北部、格陵兰南部。哈士奇名字是源自其独特的嘶哑叫声。\n" +
                    " \n" +
                    "　　友好、温柔、警觉，聪明，温顺，热情并喜欢交往。它不会呈现出护卫犬那种强烈的领地占有欲，也不会对陌生人产生过多的怀疑，对别的犬类也不会有攻击性。成年犬应该具备一定程度的谨慎和威严。\n" +
                    " ",
                R.drawable.hashiqi
            ),
            Dog(
                "萨摩耶",
                "　萨摩耶犬（英文：Samoyed），别称萨摩耶，原是西伯利亚的原住民萨摩耶族培育出的犬种，一岁前调皮、灵动。",
                R.drawable.samoye
            ),
            Dog(
                "拉布拉多",
                "拉布拉多猎犬,别名:拉布拉多、拉不拉多,英文名:labrador retriever.属于一种结构坚固、中等体型、接合较短的犬,它健康、稳定性良好的结构使其可成为寻回猎物的猎犬。",
                R.drawable.labuladuo
            )
        )
    )

    var openMode: Mode? by mutableStateOf(null)
    var currentDog: Dog? by mutableStateOf(null)
        private set

    fun goToDetail(dog: Dog) {
        openMode = Mode.Dog
        currentDog = dog
    }

    fun endDetail() {
        openMode = null
    }
}
