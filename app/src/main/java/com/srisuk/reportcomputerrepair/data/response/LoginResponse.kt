package com.srisuk.reportcomputerrepair.data.response

data class LoginResponse(
    var success: Boolean = false,
    var message: String? = null,
    var userId: Int? = null,
)
