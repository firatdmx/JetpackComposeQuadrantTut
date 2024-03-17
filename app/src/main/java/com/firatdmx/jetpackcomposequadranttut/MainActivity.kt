package com.firatdmx.jetpackcomposequadranttut

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.firatdmx.jetpackcomposequadranttut.ui.theme.JetpackComposeQuadrantTutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeQuadrantTutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant(modifier: Modifier = Modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(modifier.weight(1f)) {
                InfoCard(title = stringResource(id = R.string.title1), textBody = stringResource(id = R.string.text1) , bgColor = Color(0xFFEADDFF),modifier.weight(1f))
                InfoCard(title = stringResource(id = R.string.title2), textBody = stringResource(id = R.string.text2) , bgColor = Color(0xFFD0BCFF),modifier.weight(1f))
            }
            Row(modifier.weight(1f)) {
                InfoCard(title = stringResource(id = R.string.title3), textBody = stringResource(id = R.string.text3) , bgColor = Color(0xFFB69DF8),modifier.weight(1f))
                InfoCard(title = stringResource(id = R.string.title4), textBody = stringResource(id = R.string.text4) , bgColor = Color(0xFFF6EDFF),modifier.weight(1f))
            }
        }
}


@Composable
fun InfoCard(title: String, textBody:String,bgColor: Color, modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .background(color = bgColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = title, fontSize = 16.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
        Text(text = textBody, textAlign = TextAlign.Justify)
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    JetpackComposeQuadrantTutTheme {
        Quadrant()
    }
}