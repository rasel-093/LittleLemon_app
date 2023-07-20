package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RestaurantName(name = stringResource(id = R.string.title), size = 32)
                }

        }
    }
}

@Composable
fun RestaurantName(name: String, size: Int){
    //Column layout
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            fontSize = size.sp,
            color = Color(0xFFF4CE14)
        )
        Text(
            text = stringResource(id = R.string.chicago),
            fontSize = size.sp,
            color = Color(0xFFF4CE14)
        )
        Row() {
            Button(
                onClick = { /*TODO*/ },
                border = BorderStroke(1.dp,Color.Red),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.
                        buttonColors(Color.Gray)
            ) {
                Text(text = stringResource(id = R.string.order))
            }
        }
    }
}
@Preview
@Composable
fun RestaurantNameView(){
    RestaurantName(name = stringResource(id = R.string.title), size = 32)
}

