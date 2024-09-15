package com.example.ut2p1_playgames

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.colorDani
import com.example.compose.errorContainerDark
import com.example.compose.errorContainerLight

@Preview(showBackground = true)
@Composable
fun MenuPlayer() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                //.padding(paddingValues)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.size(10.dp))
            Column(modifier = Modifier.padding(10.dp)) {
                Row(Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(R.drawable.account),
                        contentDescription = "User",
                        Modifier
                            .size(60.dp)
                            .weight(1f)
                    )
                    Text(
                        text = "Nombre", modifier = Modifier
                            .weight(2f)
                            .background(colorDani)
                            .height(60.dp)
                            .padding(10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(20.dp))
                Row {
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "Apellido", modifier = Modifier
                            .weight(2f)
                            .background(colorDani)
                            .height(60.dp)
                            .padding(10.dp)
                    )
                }

                Spacer(modifier = Modifier.size(20.dp))
                Row(Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(R.drawable.mask),
                        contentDescription = "Nickname",
                        Modifier
                            .size(60.dp)
                            .weight(1f)
                    )
                    Text(
                        text = "Nickname", modifier = Modifier
                            .weight(2f)
                            .background(colorDani)
                            .height(60.dp)
                            .padding(10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(20.dp))
                Row {
                    Spacer(
                        modifier = Modifier
                            .weight(1f)
                    )
                    Image(
                        painter = painterResource(R.drawable.android),
                        contentDescription = "Android",
                        Modifier
                            .size(100.dp)
                            .weight(2f)
                    )
                    Button(
                        onClick = { },//navController.navigate("NewPlayer") },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = errorContainerLight,
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.width(200.dp).width(100.dp).weight(2f).padding(vertical = 30.dp)
                    ) {
                        Text(text = "Preferences")
                    }
                }
                Spacer(modifier = Modifier.size(20.dp))
                Row(Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(R.drawable.phone),
                        contentDescription = "Nickname",
                        Modifier
                            .size(60.dp)
                            .weight(1f)
                    )
                    Text(
                        text = "Teléfono", modifier = Modifier
                            .weight(2f)
                            .background(colorDani)
                            .height(60.dp)
                            .padding(10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(20.dp))
                Row(Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(R.drawable.email),
                        contentDescription = "E-mail",
                        Modifier
                            .size(60.dp)
                            .weight(1f)
                    )
                    Text(
                        text = "E-mail", modifier = Modifier
                            .weight(2f)
                            .background(colorDani)
                            .height(60.dp)
                            .padding(10.dp)
                    )
                }
            }
        }
    }
}