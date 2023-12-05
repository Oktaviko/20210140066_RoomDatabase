package com.example.persistencedata

import android.app.Application
import com.example.persistencedata.repositori.ContainerApp
import com.example.persistencedata.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container : ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}