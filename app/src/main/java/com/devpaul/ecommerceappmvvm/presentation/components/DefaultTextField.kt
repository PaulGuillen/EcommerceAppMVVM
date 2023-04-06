package com.devpaul.ecommerceappmvvm.presentation.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.devpaul.ecommerceappmvvm.presentation.screens.auth.login.LoginScreen
import com.devpaul.ecommerceappmvvm.presentation.ui.theme.Blue500
import com.devpaul.ecommerceappmvvm.presentation.ui.theme.EcommerceAppMVVMTheme

@Composable
fun DefaultTextField(
    modifier: Modifier,
    value: String,
    onValueChange: (value: String) -> Unit,
    labelText: String,
    icon: ImageVector,
    contentDescription: String,
    keyboardType: KeyboardType = KeyboardType.Text
) {
    OutlinedTextField(
        modifier = modifier,
        value = value,
        onValueChange = { text ->
            onValueChange(text)
        },
        label = {
            Text(text = labelText)
        },
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
                tint = Blue500
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
//                        colors = TextFieldDefaults.textFieldColors(
//                            backgroundColor = Color.White
//                        )
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    EcommerceAppMVVMTheme {
        LoginScreen()
    }
}