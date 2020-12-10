package com.srisuk.reportcomputerrepair.data.datasource

import com.srisuk.reportcomputerrepair.data.request.LoginRequest
import com.srisuk.reportcomputerrepair.data.response.LoginResponse

interface DataSource {
    fun login(req: LoginRequest): LoginResponse
}