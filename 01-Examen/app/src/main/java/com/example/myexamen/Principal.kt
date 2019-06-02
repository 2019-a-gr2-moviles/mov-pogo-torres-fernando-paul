package com.example.myexamen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_principal.*
import android.util.Log
import android.support.design.widget.Snackbar

class Principal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val n = intent.getIntExtra("forSnack",0)
        when (n) {
            1 -> {
                Log.i("snack", "insert")
            }
            0 -> Log.i("snack", "no")
        }

        btn_SistemasOperativos.setOnClickListener{
            listarSO()
        }

        btn_nuevoRegistro.setOnClickListener{
            registrarSO()
        }
    }

    fun listarSO(){
        val intent = Intent(
            this,
            SistemasOperativos::class.java
        )
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }

    fun registrarSO(){
        val intent = Intent(
            this,
            NuevoRegistro::class.java
        )
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }
}
