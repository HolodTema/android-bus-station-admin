package com.terabyte.core.network.api

import com.terabyte.core.network.dto.request.AdminLoginRequest
import com.terabyte.core.network.dto.request.AdminRegisterRequest
import com.terabyte.core.network.dto.request.DriverLoginRequest
import com.terabyte.core.network.dto.request.DriverRegisterRequest
import com.terabyte.core.network.dto.response.AdminAuthResponse
import com.terabyte.core.network.dto.response.DriverAuthResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthAPI {

    @POST("/api/auth/admin/login")
    fun loginAdmin(@Body adminLoginRequest: AdminLoginRequest): Response<AdminAuthResponse>

    @POST("/api/auth/admin/register")
    fun registerAdmin(@Body adminRegisterRequest: AdminRegisterRequest): Response<AdminAuthResponse>

    @POST("/api/auth/driver/login")
    fun loginAdmin(@Body driverLoginRequest: DriverLoginRequest): Response<DriverAuthResponse>

    @POST("/api/auth/driver/register")
    fun registerDriver(@Body driverRegisterRequest: DriverRegisterRequest): Response<DriverAuthResponse>
}