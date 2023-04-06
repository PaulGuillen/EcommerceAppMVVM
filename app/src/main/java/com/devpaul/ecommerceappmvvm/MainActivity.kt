package com.devpaul.ecommerceappmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devpaul.ecommerceappmvvm.ui.theme.EcommerceAppMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcommerceAppMVVMTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginContent()
                }
            }
        }
    }
}

@Composable
fun LoginContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.banner),
            contentDescription = "Imagen de Fondo",
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.colorMatrix(
                ColorMatrix().apply {
                    setToScale(0.5f, 0.5f, 0.5f, 1f)
                })
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                painter = painterResource(id = R.drawable.shopping_cart_blue),
                contentDescription = "Logo"
            )
            Text(
                modifier = Modifier.padding(top = 7.dp),
                text = "ECOMMERCE APP",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 22.sp
            )
            Spacer(
                modifier = Modifier.weight(1f)
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                shape = RoundedCornerShape(
                    topEnd = 40.dp,
                    topStart = 40.dp,
                ),
                backgroundColor = Color.White
            ) {
                Column(
                    Modifier.padding(20.dp)
                ) {
                    Text(
                        modifier = Modifier.padding(bottom = 20.dp),
                        text = "INGRESAR",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    TextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(text = "Correo electronico")
                        }
                    )
                    TextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(text = "Contraseña")
                        }
                    )
                    Button(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { })
                    {
                        Text(text = "Login")
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(text = "No tienes cuenta?")
                        Text(
                            text = "Registrate",
                            color = Color.Blue
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    EcommerceAppMVVMTheme {
        LoginContent()
    }
}