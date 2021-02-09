package hn.edu.ujcv.pdm_2021_i_l1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnENEE.setOnClickListener{cobrarEnee()}
        btnSANAA.setOnClickListener{cobrarSanaa()}
        btnRecargaClaro.setOnClickListener{recargaTigo()}
        btnRecargaTigo.setOnClickListener{recargaClaro()}
        btnRetirarDinero.setOnClickListener{retirarDinero()}
        btnTransferencia.setOnClickListener{enviarTransferencia()}
    }
    fun cobrarEnee(){
        val intent = Intent(this,CobrarEneeActivity::class.java)
        startActivity(intent)
    }
    fun cobrarSanaa(){
        val intent = Intent(this,CobrarSanaaActivity::class.java)
        startActivity(intent)
    }
    fun recargaTigo(){
        val intent = Intent(this,RecargaTigoActivity::class.java)
        startActivity(intent)
    }
    fun recargaClaro(){
        val intent = Intent(this,RecargaClaroActivity::class.java)
        startActivity(intent)
    }
    fun retirarDinero(){
        val intent = Intent(this,RetirarDineroActivity::class.java)
        startActivity(intent)
    }
    fun enviarTransferencia(){
        val intent = Intent(this,EnviarTransferenciaActivity::class.java)
        startActivity(intent)
    }
}