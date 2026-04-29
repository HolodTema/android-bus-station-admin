package com.terabyte.core.network.dto.request

import kotlinx.serialization.Serializable

@Serializable
data class DriverLoginRequest(
    val email: String,
    val password: String
)

