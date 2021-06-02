package hn.edu.ujcv.PDM_2021_II_L1_LABORATORIO1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cobrar_enee.*

class CobrarEneeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cobrar_enee)
        btnRegresarEnee.setOnClickListener{onBackPressed()}
        btnEnviar.setOnClickListener{enviar_pago()}

    }

    fun enviar_pago(){
        if(txtClavePrimaria.text.toString().isEmpty() && txtClavePrimaria.text.toString().isEmpty()){
            Toast.makeText(this,"Debe Ingresar La Clave Primaria", Toast.LENGTH_SHORT).show()
        }
        else if (txtNumFactura.text.toString().isNotEmpty() && txtNumFactura.text.toString().isEmpty()){
            Toast.makeText(this,"Debe Ingresar Numero de Factura .", Toast.LENGTH_SHORT).show()
        }
        else if (txtMontoPagar.text.toString().isEmpty() && txtMontoPagar.text.toString().isNotEmpty() ){
            Toast.makeText(this,"Debe Ingresar un monto.", Toast.LENGTH_SHORT).show()
        }
        else if (txtCuentaDebitar.text.toString().isEmpty() && txtCuentaDebitar.text.toString().isNotEmpty() ){
            Toast.makeText(this,"Ingrese la Cuenta a Debitar.", Toast.LENGTH_SHORT).show()
        }
        else if (txtConcepto.text.toString().isEmpty() && txtConcepto.text.toString().isNotEmpty() ){
            Toast.makeText(this,"por que su deposito", Toast.LENGTH_SHORT).show()
        }
        else{
            val intent = Intent(this, FinalizadoActivity::class.java)
            //intent.putExtra("nombre",txtNombre.text.toString())
            startActivity(intent)
        }

        }

    }
