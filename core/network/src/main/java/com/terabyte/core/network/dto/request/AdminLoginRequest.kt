package com.terabyte.core.network.dto.request

import kotlinx.serialization.Serializable

@Serializable
data class AdminLoginRequest(
    val email: String,
    val password: String
)

