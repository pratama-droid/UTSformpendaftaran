package com.example.utsformpendaftaran

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNamaLengkap = findViewById<EditText>(R.id.inputNamaLengkap)
        val inputNim = findViewById<EditText>(R.id.inputNim)
        val inputPassword = findViewById<EditText>(R.id.inputPassword)
        val inputKonfirmasiPassword = findViewById<EditText>(R.id.inputKonfirmasiPassword)

        val btnSimpan = findViewById<Button>(R.id.btnSimpan)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnKembali = findViewById<Button>(R.id.btnKembali)

        btnSimpan.setOnClickListener {
            val nama = inputNamaLengkap.text.toString()
            val nim = inputNim.text.toString()
            val password = inputPassword.text.toString()
            val konfirmasi = inputKonfirmasiPassword.text.toString()

                if (nama == "Kevin Adi Pratama" &&
                    nim == "G.131.23.0072" &&
                    password == "1234" &&
                    konfirmasi == "1234") {
                    Toast.makeText(applicationContext, "Pendaftaran berhasil!", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(applicationContext, "Pendaftaran gagal", Toast.LENGTH_SHORT).show()
                }
            }

        btnReset.setOnClickListener {
            inputNamaLengkap.text.clear()
            inputNim.text.clear()
            inputPassword.text.clear()
            inputKonfirmasiPassword.text.clear()
            Toast.makeText(this, "Form direset", Toast.LENGTH_SHORT).show()
        }

        btnKembali.setOnClickListener {
            Toast.makeText(this, "Kembali ditekan", Toast.LENGTH_SHORT).show()
            finish() // Menutup aktivitas dan kembali ke sebelumnya
        }
    }
}
