package com.terabyte.core.designsystem.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.terabyte.core.designsystem.preview.PreviewTheme
import com.terabyte.core.designsystem.theme.AppShapes
import com.terabyte.core.designsystem.theme.AppTypography
import com.terabyte.core.designsystem.theme.BusStationTheme

@Composable
fun AppButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        shape = AppShapes.medium
    ) {
        Text(
            text = text,
            style = AppTypography.labelLarge
        )
    }
}


@PreviewTheme
@Composable
fun AppButtonPreview() {
    BusStationTheme {
        AppButton("Click me") { }
    }
}