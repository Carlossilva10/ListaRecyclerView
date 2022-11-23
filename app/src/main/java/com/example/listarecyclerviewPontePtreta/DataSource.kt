package com.example.listarecyclerviewPontePtreta

import com.example.listarecyclerviewPontePtreta.models.Live

class DataSource {

    companion object {

        fun createDataSet() : ArrayList<Live>{

            val list = ArrayList<Live>()

            list.add(
                Live(
                    "Associação Atlética Ponte Preta o clube pioneiro que nunca parou",
                    "Clubs and Histories",
                    "https://i.ytimg.com/vi/jzxV-j-ADtw/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=G3k0TvaUN-c"
                )
            )
            list.add(
                Live(
                    "Hino da Ponte Preta",
                    "PonTV",
                    "https://i.ytimg.com/vi/jzxV-j-ADtw/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=jzxV-j-ADtw"
                )
            )
            list.add(
                Live(
                    "POR QUE O NOME PONTE PRETA?",
                    "PonTV",
                    "https://i.ytimg.com/vi/d7F3zllWLoQ/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=d7F3zllWLoQ"
                )
            )
            list.add(
                Live(
                    "1ª DEMOCRACIA RACIAL DO FUTEBOL",
                    "PonTV",
                    "https://i.ytimg.com/vi/ubowNnnJFX8/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=ubowNnnJFX8"
                )
            )
            list.add(
                Live(
                    "A origem da Macaca como Mascote da Ponte Preta e a Primeira Democracia Racial do futebol brasileiro\n",
                    "Futebol Coruja",
                    "https://i.ytimg.com/vi/TA56_cAEje4/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=TA56_cAEje4"
                )
            )
            list.add(
                Live(
                    "Você Sabia: A faixa da camisa da Ponte Preta",
                    "PonTV",
                    "https://i.ytimg.com/vi/izFAJadKuTI/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=mPGShEByLIg"
                )
            )
            list.add(
                Live(
                    "Acervo Simes Vídeo - Estádio da Ponte Preta em Construção - 1952",
                    "simesvideo",
                    "https://i.ytimg.com/vi/FcSBSExdbE8/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=FcSBSExdbE8"
                )
            )
            list.add(
                Live(
                    "Ponte Preta - Majestoso",
                    "Leandro Leme",
                    "https://i.ytimg.com/vi/xXuFvgJpXiE/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=BOWvER0_L6M"
                )
            )

            return list

        }
    }
}