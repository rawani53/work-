package second.app.unit_conv

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import second.app.unit_conv.ui.theme.Unit_convTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Unit_convTheme{
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    unitconverter()
                }
            }
        }
    }
}


@Composable
fun unitconverter() {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text("unit converter" , modifier = Modifier.padding(20.dp))
        OutlinedTextField(value = "Enter value", onValueChange = {})
        Spacer(modifier = Modifier.height(25.dp))
        Row {
            Box {
                Button(onClick = {})
                {
                    Text("Click me")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "")
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Box {
                Button(onClick = {}) {
                    Text("Click me")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "")
                }
            }
        }
        Spacer(modifier = Modifier.height(25.dp))
        Text("Result")

    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun unitconverterPreview(){
    unitconverter()
}