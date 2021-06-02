package hn.edu.ujcv.PDM_2021_II_L1_LABORATORIO1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_recarga_claro.*

class RecargaClaroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recarga_claro)
        btnRegresarRecargaClaro.setOnClickListener{onBackPressed()}
        btnRecarga.setOnClickListener{recarga()}
        btnSuperRecarga.setOnClickListener{super_recarga()}
    }

    fun recarga(){
        if(editIngreseTelefono.text.toString().isEmpty() && editIngreseTelefono.text.toString().isEmpty()){
            Toast.makeText(this,"Debe Ingresar Numero Telefonico", Toast.LENGTH_SHORT).show()
        }
        else if (editMontoRecarga.text.toString().isNotEmpty() && editMontoRecarga.text.toString().isEmpty()){
            Toast.makeText(this,"Ingrese Cantidad de la Recarga .", Toast.LENGTH_SHORT).show()
        }
        else{
            val intent = Intent(this, FinalizadoActivity::class.java)
            //intent.putExtra("nombre",txtNombre.text.toString())
            startActivity(intent)
        }

    }

    fun super_recarga(){
        if(editingreseTelefonoSuper.text.toString().isEmpty() && editingreseTelefonoSuper.text.toString().isEmpty()){
            Toast.makeText(this,"Debe Ingresar Numero Telefonico", Toast.LENGTH_SHORT).show()
        }
        else if (editingreseTelefonoSuper.text.toString().isNotEmpty() && editingreseTelefonoSuper.text.toString().isEmpty()){
            Toast.makeText(this,"Ingrese Cantidad de super recarga .", Toast.LENGTH_SHORT).show()
        }
        else{
            val intent = Intent(this, FinalizadoActivity::class.java)
            //intent.putExtra("nombre",txtNombre.text.toString())
            startActivity(intent)
        }

    }

}