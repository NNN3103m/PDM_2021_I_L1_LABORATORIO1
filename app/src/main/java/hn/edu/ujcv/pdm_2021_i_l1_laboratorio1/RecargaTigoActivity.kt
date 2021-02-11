package hn.edu.ujcv.pdm_2021_i_l1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cobrar_enee.*
import kotlinx.android.synthetic.main.activity_recarga_claro.*
import kotlinx.android.synthetic.main.activity_recarga_tigo.*
import kotlinx.android.synthetic.main.activity_recarga_tigo.btnRecarga
import kotlinx.android.synthetic.main.activity_recarga_tigo.btnSuperRecarga
import kotlinx.android.synthetic.main.activity_recarga_tigo.editIngreseTelefono
import kotlinx.android.synthetic.main.activity_recarga_tigo.editMontoRecarga
import kotlinx.android.synthetic.main.activity_recarga_tigo.editingreseTelefonoSuper

class RecargaTigoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recarga_tigo)
        btnRegresarRecargaTigo.setOnClickListener{onBackPressed()}
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