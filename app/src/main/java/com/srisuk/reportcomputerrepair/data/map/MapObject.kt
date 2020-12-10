package com.srisuk.reportcomputerrepair.data.map

import com.srisuk.reportcomputerrepair.data.models.UserDb
import com.srisuk.reportcomputerrepair.data.database.Users
import org.jetbrains.exposed.sql.ResultRow

object MapObject {
    fun toUser(row: ResultRow)= UserDb(
        userId = row[Users.userId],
        userName = row[Users.username],
        passWord = row[Users.password]

    )
}