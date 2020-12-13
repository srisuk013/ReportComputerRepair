package com.srisuk.reportcomputerrepair.ui

import android.os.Bundle
import android.os.StrictMode
import androidx.appcompat.app.AppCompatActivity
import com.srisuk.reportcomputerrepair.data.datasource.DataSource
import com.srisuk.reportcomputerrepair.data.datasource.DataSourceImpl

import org.jetbrains.exposed.sql.Database

abstract class BaseActivity:AppCompatActivity() {
    val dataSource: DataSource = DataSourceImpl
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder().permitAll().build())
        val host = "192.168.43.52"
        val databaseName = "repairdb"
        val url = "jdbc:mysql://$host:3306/$databaseName?useUnicode=true&characterEncoding=utf-8"
        Database.connect(
            url = url,
            driver = "com.mysql.jdbc.Driver",
            user = "srisuk015",
            password = "srisuk015",
        )
    }
}