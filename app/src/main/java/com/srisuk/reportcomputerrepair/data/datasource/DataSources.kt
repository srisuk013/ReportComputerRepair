package com.srisuk.reportcomputerrepair.data.datasource

import com.srisuk.reportcomputerrepair.data.map.MapObject
import com.srisuk.reportcomputerrepair.data.models.UserDb
import com.srisuk.reportcomputerrepair.data.database.Users
import com.srisuk.reportcomputerrepair.data.request.LoginRequest
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction

object DataSources {
    fun selectUser(req:LoginRequest): UserDb {
        return  transaction {
            addLogger(StdOutSqlLogger)
            Users.select { Users.username eq "" }
                .andWhere { Users.password eq "" }
                .map { MapObject.toUser(it) }
                .single()
        }
    }
}