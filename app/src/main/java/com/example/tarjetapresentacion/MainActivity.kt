package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DefaultPreview()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier =
                 Modifier
                     .fillMaxWidth()
                     .wrapContentSize(Alignment.Center)) {
    Column (modifier = modifier) {
        Surface(modifier = modifier) {
            Column(){
                Image(painter = painterResource(R.drawable.logo), contentDescription = "foto")
                Text(text = "Raúl Sáenz")
                Text(text = "Ingeniero Informático")
            }
        }

        Row(modifier = modifier) {
            Surface(modifier = modifier) {
                Column() {
                    Row() {
                        // Una imagen, tengo que mirar como escalarlas
                        Text(text = "Telefóno: 000000000 :)")
                    }
                    Row() {
                        // Una imagen
                        Text(text = "Discord: Theriul89#5280")
                    }
                    Row() {
                        //Otra imagen
                        Text(text = "Correo: theriul89@gmail.com")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TarjetaPresentacionTheme {
        Greeting()
    }
}