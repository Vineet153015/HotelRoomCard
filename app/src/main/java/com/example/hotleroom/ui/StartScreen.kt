package com.example.hotleroom.ui

import android.content.Context
import android.health.connect.datatypes.units.Length
import android.widget.Toast

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hotleroom.data.DataSource
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.hotleroom.R
import com.example.hotleroom.data.Categories
import com.example.hotleroom.ui.theme.HotleRoomTheme


@Composable
fun StartScreen(){
    val context = LocalContext.current


    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
        items(DataSource.loadCategories()){
CardCategory(context = context, stringResourceID = it.stringResourceID, locationID = it.locationID , imageResourceID = it.ImageResourceID, hotelPrice = it.HotelPrice)
        }
    }
}

@Composable
fun CardCategory(
    context: Context,
    stringResourceID :Int,
    locationID : Int,
    imageResourceID : Int,
    hotelPrice : Int
){
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                Toast
                    .makeText(context, "Hotel Selected", Toast.LENGTH_SHORT)
                    .show()
            }
    ){
        Column{
            Image(
                painter = painterResource(id = imageResourceID),
                contentDescription = "Hotels",
                modifier = Modifier
                    .fillMaxSize()

                )
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = stringResource(id = stringResourceID),
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(top = 5.dp, start = 5.dp)
                        .weight(1f) // This makes the Text take up as much space as possible
                )
                Text(
                    text = "${stringResource(id = R.string.price_prefix)} $hotelPrice",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterVertically)
                        .padding(top= 10.dp, end = 5.dp)
                        .fillMaxHeight()

                        // Aligns it vertically in the row
                )
            }

                    Text(
                        text = stringResource(id = locationID),
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding( start = 5.dp)

                        )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HotleRoomTheme {
        HotelApp()
    }
}
