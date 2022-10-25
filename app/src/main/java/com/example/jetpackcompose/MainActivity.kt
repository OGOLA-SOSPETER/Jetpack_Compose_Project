package com.example.jetpackcompose

import android.icu.text.Transliterator.Position
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    JetpackImage(getString(R.string.Jetpack_compose_title), getString(R.string.jetpack_definition),"In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
                }
            }
        }
    }
}

@Composable
fun Texts(text1 : String, text2 : String, text3 : String) {
        Column{
            Text(
                text = text1,

                fontSize = 24.sp,
                modifier = Modifier
                    //.background(color = Color.Cyan)
                    .fillMaxWidth()
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(start = 16.dp, end = 16.dp, top = 150.dp, bottom = 16.dp)
                // .wrapContentWidth(Alignment.CenterHorizontally)
            )

            Text(
                text = text2,
                textAlign = TextAlign.Justify,
                fontSize = 18.sp,
                modifier = Modifier
                    .background(color = Color.White)
                    .padding(start = 16.dp, end = 16.dp, top = 0.dp),



                )
            Text(
                text = text3,
                textAlign = TextAlign.Justify,
                fontSize = 18.sp,
                modifier = Modifier
                    .background(color = Color.White)

                    .padding(start = 16.dp, end = 16.dp, top = 20.dp, bottom = 16.dp)
            )
        }
    }



@Composable
fun JetpackImage(text1: String, text2: String, text3: String) {
    Column{
        val image = painterResource(R.drawable.bg_compose_background)

            Box {
                Image(
                    painter = image,
                    alignment = Alignment.TopCenter,
                    contentDescription = null,
                    modifier = Modifier
                        //.fillMaxWidth()
                        .padding(start = 2.dp, end = 2.dp,top = 2.dp)
                        .width(399.dp)
                        .height(130.dp),
                    contentScale = ContentScale.Crop
                )
                Texts(
                    "Jetpack Compose tutorial",
                    "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                    "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
                )
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun TextsPreview() {
    JetpackComposeTheme {
        Surface(modifier = Modifier.fillMaxSize()){
            Column(modifier = Modifier.fillMaxSize()){}
        }
            JetpackImage(
                "Jetpack Compose tutorial",
                "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
            )

    }
}