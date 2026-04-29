package com.terabyte.core.network.dto.response

import kotlinx.serialization.Serializable


@Serializable
data class AdminAuthResponse(
    val token: String,
    val adminId: Int
)

