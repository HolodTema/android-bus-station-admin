package com.terabyte.core.network.dto.request

import kotlinx.serialization.Serializable

@Serializable
data class AdminRegisterRequest(
    val name: String,
    val surname: String,
    val email: String,
    val password: String
)

