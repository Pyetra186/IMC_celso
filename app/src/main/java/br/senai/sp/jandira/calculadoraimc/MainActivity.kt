package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraIMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraIMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun TesteColumn() {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column (
            modifier = Modifier.fillMaxHeight()
        ){

        }
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .size(height = 190.dp, width = 700.dp)
                    .background(
                        Color(0xFFED145B),
                    )

            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .size(height = 400.dp, width = 600.dp),
                    horizontalAlignment = Alignment.CenterHorizontally


                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ibm),
                        contentDescription = "Icone para IMC",
                        modifier = Modifier
                            .size(height = 90.dp, width = 90.dp)
                            .padding(top = 35.dp)
                    )
                    Text(
                        text = "Calculadora IMC",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        modifier = Modifier
                            .padding(20.dp)
                            .padding(top = 0.dp)

                    )

                }


            }

        }

    }
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .width(350.dp)
            .height(550.dp)
            .offset(y = 170.dp)
            .padding(start = 40.dp)

        ) {

        Column(
            modifier = Modifier
                .shadow(elevation = 10.dp)
                .background(Color.White, shape = RoundedCornerShape(10.dp), )
                .height(350.dp)
                .padding(top = 10.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        )
        {

            Text(
                text = "Seus dados",
                color = Color(0xFFED145B),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(top = 10.dp)


            )
            Column(modifier = Modifier.padding(start = 10.dp)) {
                Text(
                    text = "Seu peso:",
                    color = Color(0xFFED145B),
                    modifier = Modifier.padding(top = 20.dp)
                )
                TextField(
                    value = "Seu peso em kg",
                    onValueChange = {},
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .height(52.dp)
                        .border(1.dp, Color(0xFFED145B), shape = RoundedCornerShape(8.dp))


                )
                Text(
                    text = "Sua altura:",
                    color = Color(0xFFED145B),
                    modifier = Modifier.padding(top = 10.dp)
                )
                TextField(
                    value = "Sua altura em cm",
                    onValueChange = {},
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .height(52.dp)
                        .border(1.dp, Color(0xFFED145B), shape = RoundedCornerShape(8.dp))
                )


                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(50.dp)
                        .width(1000.dp)
                        .padding(horizontal = 20.dp, vertical = 60.dp)
                        .background(color = Color(0xFFED145B)),

                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFED145B))
                ) {
                    Text(text = "CALCULAR")
                }
            }

        }

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFF329F6B), shape = RoundedCornerShape(10.dp))
        ){
            Column (
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxHeight()
            ){
                Text(
                    text = "Resultado",
                    fontSize = 15.sp,
                    color = Color.White
                )
                Text(
                    text = "Peso Ideal",
                    fontSize = 20.sp,
                    color = Color.White)
            }
            Text(
                text = "21.3",
                fontSize = 35.sp,
                color = Color.White)
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculadoraIMCTheme {
        Greeting("Android")
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TesteColumnPreview() {
    CalculadoraIMCTheme {
        TesteColumn()
    }
}