package com.example.hotleroom.data

import com.example.hotleroom.R
import kotlin.random.Random

object DataSource {

    fun loadCategories():List<Categories>{

        return listOf<Categories>(

            Categories(R.string.The_Sapphire_Horizon, R.string.Santorini_Greece, R.drawable.hotel_1, HotelPrice = RandomPrice()),
            Categories(R.string.Golden_Palm_Resort,R.string.Miami_USA, R.drawable.hotel_2, HotelPrice = RandomPrice()),
            Categories(R.string.Azure_Sky_Retreat,R.string.Bali_Indonesia, R.drawable.hotel_3, HotelPrice = RandomPrice()),
            Categories(R.string.Majestic_Pearl_Inn,R.string.Bora_Bora_French_Polynesia, R.drawable.hotel_6, HotelPrice = RandomPrice()),
            Categories(R.string.Emerald_Garden_Suites,R.string.Kyoto_Japan, R.drawable.hotel_7, HotelPrice = RandomPrice()),
            Categories(R.string.Silver_Sands_Lodge,R.string.Maldives, R.drawable.hotel_8, HotelPrice = RandomPrice()),
            Categories(R.string.The_Royal_Pines_Haven,R.string.Queenstown_New_Zealand, R.drawable.hotel_9, HotelPrice = RandomPrice()),
            Categories(R.string.Ocean_Breeze_Villas,R.string.Gold_Coast_Australia, R.drawable.hotel_10, HotelPrice = RandomPrice()),
        )


    }

    fun RandomPrice(): Int {
        val randomValue = Random.nextInt(100, 1000)
        return randomValue * 10
    }

}