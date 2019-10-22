package com.example.intentrizkyagunglesmana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProsesActivity : AppCompatActivity() {
    private lateinit var nimDat: TextView
    private lateinit var namDat: TextView
    private lateinit var nilDat: TextView
    private lateinit var tmp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proses)


        nimDat = findViewById(R.id.nim_dat)
        namDat = findViewById(R.id.name_dat)
        nilDat = findViewById(R.id.nilai_dat)
        tmp = findViewById(R.id.nilai_tamp)

        val bundle = intent.extras
        if (bundle != null) {
            nimDat.setText("Nim      : " + bundle.getString("dataNim"))
            namDat.setText("Nama     : " + bundle.getString("dataNama"))
            nilDat.setText("Nilai    : " + bundle.getString("dataNilai"))


            //--
            val nilaidata = bundle.getString("dataNilai")
            val nilaiIn = toInt(nilaidata.toString())

                if (nilaiIn?: 0 >=  80) {
                    tmp.setText("Keterangan : A")
                } else if (nilaiIn?: 0 >= 60) {
                    tmp.setText("Keterangan : B")
                } else if (nilaiIn?: 0 >= 40) {
                    tmp.setText("Keterangan : C")
                } else if (nilaiIn?: 0 >= 20 ) {
                    tmp.setText("Keterangan : D")
                } else if (nilaiIn?: 0 >= 0) {
                    tmp.setText("Keterangan : E")
                }
        //--
        }
    }
}

private fun toInt(nli: String): Int? {
    return try {
        nli.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

