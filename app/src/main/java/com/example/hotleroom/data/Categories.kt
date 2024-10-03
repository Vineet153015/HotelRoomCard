package com.example.hotleroom.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Categories(
        @StringRes val stringResourceID : Int,
        @StringRes val locationID: Int,
        @DrawableRes val ImageResourceID :Int,
        val HotelPrice :Int
)
