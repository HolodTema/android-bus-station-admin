package com.terabyte.core.network.dto.response

import kotlinx.serialization.Serializable


@Serializable
data class DriverAuthResponse(
    val token: String,
    val driverId: Int
)

