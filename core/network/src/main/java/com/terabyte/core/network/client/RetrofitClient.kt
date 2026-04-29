package com.terabyte.core.network.client

import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory

class RetrofitClient(
    private val baseUrl: String,
    private var adminToken: String? = null,
    private var driverToken: String? = null
) {

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(createLoggingInterceptor())
        .addInterceptor(createAuthInterceptor())
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(okHttpClient)
        .addConverterFactory(
            Json.asConverterFactory("application/json".toMediaType())
        )
        .build()

    fun updateAdminToken(newToken: String) {
        adminToken = newToken
    }

    fun updateDriverToken(newToken: String) {
        driverToken = newToken
    }

    fun <T> create(serviceClass: Class<T>): T {
        return retrofit.create(serviceClass)
    }

    private fun createAuthInterceptor(): Interceptor {
        return Interceptor { chain ->
            val request = chain.request()
            val path = request.url.encodedPath

            val requiresAdminToken = false
            if (requiresAdminToken) {

            }
            chain.proceed(request)
        }
    }

    private fun createLoggingInterceptor(): Interceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }
}