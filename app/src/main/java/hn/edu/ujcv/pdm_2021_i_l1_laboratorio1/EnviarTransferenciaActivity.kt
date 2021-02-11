package hn.edu.ujcv.pdm_2021_i_l1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cobrar_enee.*
import kotlinx.android.synthetic.main.activity_enviar_transferencia.*
import kotlinx.android.synthetic.main.activity_retirar_dinero.*

class EnviarTransferenciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enviar_transferencia)
        btnRegresarTransferencia.setOnClickListener{onBackPressed()}
    }
}