package hn.edu.ujcv.PDM_2021_II_L1_LABORATORIO1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finalizado.*

class FinalizadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalizado)
        btnFelicidadesRegresar.setOnClickListener{onBackPressed()}
    }
}