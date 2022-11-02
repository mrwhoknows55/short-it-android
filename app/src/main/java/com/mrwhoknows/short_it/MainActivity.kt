package com.mrwhoknows.short_it

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mrwhoknows.short_it.ui.theme.ShortItTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShortItTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShortItTheme {
        Greeting("Android")
    }
}

/*
    lifecycleScope.launch(Dispatchers.IO) {
            val dao = Room.databaseBuilder(
                this@MainActivity.applicationContext, ShortItRoomDb::class.java, "short_it.db"
            ).build().shortItDao()

            dao.insertAll(
                ShortItEntity(
                    id = Random().nextLong(),
                    title = "Title ${System.currentTimeMillis() / 10000}",
                    shortUrl = "helloWorld",
                    longUrl = "https://mrwhoknows.com",
                    tags = (0..Random().nextInt(12)).map { "tag$it" }.toSet()
                )
            )
            val things = dao.getAll().map { it.toModel() }
            Log.d(TAG, "onCreate: $things")
        }
 */