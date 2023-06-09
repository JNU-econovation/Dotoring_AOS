package com.example.dotoring.ui.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotoring.R
import com.example.dotoring.ui.register.util.RegisterScreenNextButton
import com.example.dotoring.ui.register.util.RegisterScreenTop
import com.example.dotoring.ui.theme.DotoringTheme

@Composable
fun FifthRegisterScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 50.dp)
    ) {

        RegisterScreenTop(
            screenNumber = 5,
            question = R.string.register5_q5,
            stringResource(id = R.string.register5_guide)
        )

        Spacer(modifier = Modifier.size(15.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(text = stringResource(id = R.string.register5_accept))

            val checkedState = remember { mutableStateOf(true) }

            Checkbox(
                checked = checkedState.value,
                onCheckedChange = { checkedState.value = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = colorResource(id = R.color.green),
                    uncheckedColor = colorResource(id = R.color.grey_500),
                    checkmarkColor = Color(0xffffffff)
                )
            )

        }

        Spacer(modifier = Modifier.weight(1f))

        RegisterScreenNextButton()

        Spacer(modifier = Modifier.weight(3f))

    }
}

@Preview(showSystemUi = true)
@Composable
private fun RegisterScreenPreview() {
    DotoringTheme {
        FifthRegisterScreen()
    }
}