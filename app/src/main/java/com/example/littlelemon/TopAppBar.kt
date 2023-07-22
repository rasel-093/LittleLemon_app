package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBar(){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Image(
                painter = painterResource(id = R.drawable.menu2) ,
                contentDescription = "Menu Icon",
                modifier = Modifier
                    .size(24.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.littlelemon) ,
            contentDescription = "Menu Icon" ,
            modifier = Modifier
                .fillMaxWidth(0.8F)
                .padding(horizontal = 10.dp)
        )
        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Image(
                painter = painterResource(id = R.drawable.cart) ,
                contentDescription = "Menu Icon" ,
            modifier = Modifier
                .size(24.dp)
            )
        }
    }
}
@Preview
@Composable
fun TopAppBarView(){
    TopAppBar()
}