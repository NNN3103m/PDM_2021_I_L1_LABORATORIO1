package hn.edu.ujcv.pdm_2021_i_l1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cobrar_enee.*
import kotlinx.android.synthetic.main.activity_cobrar_sanaa.*

class CobrarSanaaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cobrar_sanaa)
        btnRegresarSanaa.setOnClickListener { onBackPressed() }
        btnEnviarSanaa.setOnClickListener {enviar()}
    }
        fun enviar(){
            if(txtContrato.text.toString().isEmpty() && txtContrato.text.toString().isEmpty()){
                Toast.makeText(this,"Debe Ingresar numero de contrato", Toast.LENGTH_SHORT).show()
            }
            else if (txtFacturas.text.toString().isNotEmpty() && txtFacturas.text.toString().isEmpty()){
                Toast.makeText(this,"Debe Ingresar Numero de Factura .", Toast.LENGTH_SHORT).show()
            }
            else if (txtMontoPagarSanaa.text.toString().isEmpty() && txtMontoPagarSanaa.text.toString().isNotEmpty() ){
                Toast.makeText(this,"Debe Ingresar un monto.", Toast.LENGTH_SHORT).show()
            }
            else if (txtCuentaDebitarSanaa.text.toString().isEmpty() && txtCuentaDebitarSanaa.text.toString().isNotEmpty() ){
                Toast.makeText(this,"Ingrese la Cuenta a Debitar.", Toast.LENGTH_SHORT).show()
            }
            else if (txtConceptoSanaa.text.toString().isEmpty() && txtConceptoSanaa.text.toString().isNotEmpty() ){
                Toast.makeText(this,"por que su deposito", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, FinalizadoActivity::class.java)
                //intent.putExtra("nombre",txtNombre.text.toString())
                startActivity(intent)
            }

        }
    }
