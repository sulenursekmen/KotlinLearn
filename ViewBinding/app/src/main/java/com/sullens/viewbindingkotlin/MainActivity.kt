package com.sullens.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.sullens.viewbindingkotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //private lateinit var textView: TextView
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


        //binding.textView.text="Merhaba"

       // textView=findViewById(R.id.textView)
    }

    fun ismiDegistir(view: View){
       //eklentisiz bu şekilde tanımlayıp yapabilirsin javadaki gibi
       // val textView=findViewById<TextView>(R.id.textView)

       // textView.text="Merhaba Kotlin"
        binding.textView.text="Merhaba"


    }







}