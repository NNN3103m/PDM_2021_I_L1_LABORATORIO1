package hn.edu.ujcv.pdm_2021_i_l1_laboratorio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cobrar_enee.*
import kotlinx.android.synthetic.main.activity_retirar_dinero.*
import android.widget.Toast
import android.content.Intent

class RetirarDineroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retirar_dinero)
        btnRegresarRetirarDinero.setOnClickListener{onBackPressed()}
        btnRetirarDineroEnviar.setOnClickListener{enviar()}
    }

    var montoperm = 5000;

    fun enviar(){
        if(txtMonto.text.toString().isEmpty() && txtCuenta.text.toString().isEmpty()){
            Toast.makeText(this,"Debe Ingresar un monto y una cuenta.", Toast.LENGTH_SHORT).show()
        }
        else if (txtMonto.text.toString().isNotEmpty() && txtCuenta.text.toString().isEmpty()){
            Toast.makeText(this,"Debe Ingresar una cuenta.", Toast.LENGTH_SHORT).show()
        }
        else if (txtMonto.text.toString().isEmpty() && txtCuenta.text.toString().isNotEmpty() ){
            Toast.makeText(this,"Debe Ingresar un monto.", Toast.LENGTH_SHORT).show()
        }
        else if(txtMonto.text.toString() > montoperm.toString()){
            Toast.makeText( this, "Monto válido (máximo 5000)", Toast.LENGTH_SHORT).show()
        }
        else{
            val intent = Intent(this, FinalizadoActivity::class.java)
            //intent.putExtra("nombre",txtNombre.text.toString())
            startActivity(intent)
        }
    }
}
