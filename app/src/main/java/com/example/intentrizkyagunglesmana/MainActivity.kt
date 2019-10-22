package com.example.intentrizkyagunglesmana
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var datName: EditText
    private lateinit var datNim: EditText
    private lateinit var datNilai: EditText
    private lateinit var btnProses: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        datNim = findViewById(R.id.nim)
        datName = findViewById(R.id.nama)
        datNilai = findViewById(R.id.nilai)
        btnProses = findViewById(R.id.btn_klik)

        btnProses.setOnClickListener{

            val bundle = Bundle()
            bundle.putString("dataNim", datNim.text.toString())
            bundle.putString("dataNama", datName.text.toString())
            bundle.putString("dataNilai", datNilai.text.toString())

            val intent = Intent(this, ProsesActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}


// NAMA : RIZKY AGUNG LESMANA
// NIM  : 5180421001

