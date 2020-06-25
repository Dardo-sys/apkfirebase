package com.example.navapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main6.*

class Main6Activity : AppCompatActivity() {

    val numeroSecreto=(Math.random() * 100).toInt()



    var vidas:Int = 10
    var intentos:Int = 0
    var numAyuda:Int = 3
    var ayuda:Int = 1
    var cantidadAyuda:Int =  numeroSecreto*2



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        btnAyuda6.setOnClickListener {
            val intent: Intent = Intent(this, ayudaSuerte::class.java)
            startActivity(intent)
            finish()

        }

        btnVolver6.setOnClickListener {
            val intent: Intent = Intent(this, Main5Activity::class.java)
            startActivity(intent)
            finish()

        }

        btnReiniciar.setOnClickListener {
            val intent: Intent = Intent(this, Main6Activity::class.java)
            startActivity(intent)

        }



        txtVidas.text = "Intentos Restantes: $vidas"
        txtIntentos.text = "Cantidad de Intentos: $intentos"
        txtAyuda.text = "Pistas Restantes: $numAyuda"
///////////////////////////////////////////////////////////////////////////////////////////////////

        btnPistas6.setOnClickListener{ //Boton de pistas
            when(ayuda)
            {
                1 ->
                    if (numeroSecreto <= 50)
                    {
                        Toast.makeText(this, "El Número Es Menor a 51 ", Toast.LENGTH_LONG).show()
                    } else
                    {
                        Toast.makeText(this, "El Número Es Mayor a 50 ", Toast.LENGTH_LONG).show()
                    }

                2 ->
                    if (numeroSecreto %2 == 0)
                    {
                        Toast.makeText(this, "El Número es PAR", Toast.LENGTH_LONG).show()
                    }else
                    {
                        Toast.makeText(this, "El Número es IMPAR", Toast.LENGTH_LONG).show()
                    }
                3 ->

                    if (numeroSecreto <= 100)
                    {
                        Toast.makeText(this, "(El Número Es igual a $cantidadAyuda /2) ", Toast.LENGTH_LONG).show()
                    }


            }

            ayuda = ayuda + 1
            if(numAyuda > 0) {
                numAyuda = numAyuda - 1
                txtAyuda.text = "Ayudas disponibles: " + numAyuda
            }

        }
////////////////////////////////////////////////////////////////////////////////////////////////////

        btnMeRindo.setOnClickListener{ //Boton me rindo
            Toast.makeText(this,"El Número Secreto es: $numeroSecreto" , Toast.LENGTH_LONG).show()
            btnAdivinar.isEnabled = false
            btnPistas6.isEnabled = false
            txtIngNum.isEnabled = false
            txtResFinal.text = "Te Retiraste"
            txtResFinal.visibility = View.VISIBLE
            txtResFinal.setTextColor(txtResFinal.getContext().getResources().getColor(R.color.colorPrimary))
        }

        //////////////////////////////////////////////////////////////////////////////////////////////

        btnAdivinar.setOnClickListener{//boton avidinar

            if (1 == 1) {

                if (vidas > 1) {
                    if (numeroSecreto.toString() == txtIngNum.text.toString()) {
                        if (ayuda < 3) {
                            Toast.makeText(this, "Ganaste Felicitaciones ", Toast.LENGTH_LONG).show()
                            txtResFinal.text = "GANASTE"
                        } else {
                            Toast.makeText(this, "Ganaste con una manito ", Toast.LENGTH_LONG).show()
                            txtResFinal.text = "GANASTE CON PISTAS"
                        }
                        vidas = vidas - 1
                        intentos = intentos + 1
                        txtVidas.text = "Intentos Restantes: " + vidas
                        txtIntentos.text = "Cantidad de Intentos: " + intentos
                        btnAdivinar.isEnabled = false
                        btnPistas6.isEnabled = false
                        btnMeRindo.isEnabled = false
                        txtIngNum.isEnabled = false
                        txtResFinal.visibility = View.VISIBLE


                    } else {
                        Toast.makeText(this, "Incorrecto", Toast.LENGTH_LONG).show()
                        vidas = vidas - 1
                        intentos = intentos + 1
                        txtVidas.text = "Intentos Restantes: " + vidas
                        txtIntentos.text = "Cantidad de Intentos: " + intentos
                    }
                } else {
                    Toast.makeText(this, "PERDISTE", Toast.LENGTH_LONG).show()
                    vidas = vidas - 1
                    intentos = intentos + 1
                    txtVidas.text = "Intentos Restantes: " + vidas
                    txtIntentos.text = "Cantidad de Intentos: " + intentos
                    btnAdivinar.isEnabled = false
                    btnMeRindo.isEnabled = false
                    btnPistas6.isEnabled = false
                    txtIngNum.isEnabled = false
                    txtResFinal.text = "PERDISTE"
                    txtResFinal.visibility = View.VISIBLE
                    txtResFinal.setTextColor(
                        txtResFinal.getContext().getResources().getColor(R.color.colorPrimary)
                    )

                }
            }else
            {
                Toast.makeText(this, "El nuemero debe ser MENOR A 100", Toast.LENGTH_LONG).show()
            }

        }

    }
}