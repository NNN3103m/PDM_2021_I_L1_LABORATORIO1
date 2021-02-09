package hn.edu.ujcv.pdm_2021_i_l1_laboratorio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cobrar_enee.*

class CobrarEneeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cobrar_enee)
        btnRegresarEnee.setOnClickListener{onBackPressed()}
    }
}