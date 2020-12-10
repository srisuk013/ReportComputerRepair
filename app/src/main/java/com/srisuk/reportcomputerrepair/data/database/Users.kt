package com.srisuk.reportcomputerrepair.data.database

import org.jetbrains.exposed.sql.Table

object Users :Table("user"){

    val userId= integer("User_Id").autoIncrement()
    val username= varchar("User_Name",50)
    val password= varchar("Password",11)

    override val primaryKey: PrimaryKey?
        get() = PrimaryKey(userId, name = "User_Id")
}