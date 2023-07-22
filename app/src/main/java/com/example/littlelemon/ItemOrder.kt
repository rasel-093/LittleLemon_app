package com.example.littlelemon

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ItemOrder(){
    var count by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
    Card() {
        Column(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Text(
                text = "Greek Salad",
                fontWeight = FontWeight.W700,
                fontSize = 30.sp
            )
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { count-- }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Remove")
                }
                Text(
                    text = count.toString(),
                    Modifier.size(42.dp),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
                IconButton(onClick = { count++ }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add" )
                }
            }
            Button(onClick = { /*TODO*/ },Modifier.fillMaxWidth()) {
                Text(text = "Add")
            }
        }
    }
}
@Preview
@Composable
fun ItemOrderPreview(){
    ItemOrder()
}