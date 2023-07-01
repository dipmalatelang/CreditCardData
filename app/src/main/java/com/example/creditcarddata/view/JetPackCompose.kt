package com.example.creditcarddata.view

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import com.example.creditcarddata.R



@Composable
fun SurveyScreen(){
    Row (
        modifier = Modifier
            .padding(top = 40.dp)
            .border(10.dp, Color.Yellow)
            .background(Color.Cyan),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    )

    {
        Text(text = "Dipmala", modifier = Modifier)
        Text(text = "Jadhav")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "karan")
    }
}

@Preview(showBackground = true,
      fontScale = 1.5f,
         showSystemUi = true
)


@Composable
fun SurveyScreenPreview(){
    SurveyScreen()
}
