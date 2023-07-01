package com.example.creditcarddata.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.creditcarddata.viewmodel.CreditCardViewModel
import com.example.creditcarddata.model.CreditCardResponse


@Composable
fun Screen(viewModel: CreditCardViewModel) {
    val creditCards by viewModel.creditCards.observeAsState(null)

    LaunchedEffect(Unit) {
        viewModel.fetchCreditCards()
    }

    Column {
        if (creditCards == null) {
            // Show loading indicator or placeholder
            Text(text = "Loading...")
        } else {
            // Display the list of credit cards
            CreditCardItem(creditCards!!)
        }
    }
}


@Composable
fun CreditCardItem(creditCard: CreditCardResponse) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        // elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = creditCard.credit_card_number,
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Expiry Date: ${creditCard.credit_card_expiry_date}",
                style = MaterialTheme.typography.bodySmall
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = creditCard.credit_card_type,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
    @Preview
    @Composable
    fun ScreenPreview() {
        Screen(viewModel = CreditCardViewModel())

        }
