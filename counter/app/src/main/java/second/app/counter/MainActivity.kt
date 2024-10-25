package second.app.counter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import second.app.counter.ui.theme.CounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CounterTheme {
                Surface(
                    modifier = Modifier.fillMaxSize())
                {
                    counter()
                }
            }
        }
    }
}

@Composable
fun counter() {

    val count = remember { mutableStateOf(0) }

    fun Increment() {
        count.value++
    }

    fun Decrement() {
        count.value--
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally){

        Text(text = "CurrentCount is ${count.value}")

        Spacer(modifier = Modifier.padding(16.dp))

        Row {
            Button(onClick = { Increment() }) {
                Text("+")
            }

            Spacer(modifier = Modifier.width(25.dp))

            Button(onClick = { Decrement() }) {
                Text("-")
            }
        }
    }
}

