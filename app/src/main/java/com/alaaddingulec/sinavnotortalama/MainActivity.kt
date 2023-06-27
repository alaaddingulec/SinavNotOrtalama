package com.alaaddingulec.sinavnotortalama

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.RequiresApi
import com.alaaddingulec.sinavnotortalama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            if (binding.editTextNumber1.text.isNotEmpty()&&binding.editTextNumber2.text.isNotEmpty()
                &&binding.editTextNumber3.text.isNotEmpty()&&binding.editTextNumber2.text.isNotEmpty())
            {
                var sinav1 = binding.editTextNumber1.text.toString().toInt()
                var sinav2 = binding.editTextNumber2.text.toString().toInt()
                var sinav3 = binding.editTextNumber3.text.toString().toInt()
                var sinav4  = binding.editTextNumber4.text.toString().toInt()
                var sonuc:Double=(sinav1+sinav2+sinav3+sinav4)/4.toDouble()
                if(sonuc>=50){
                    binding.textView.text=sonuc.toString()+" "+"Geçtiniz."
                    binding.textView.setTextColor(getColor(R.color.green))
                }else{
                    (sonuc<=50)
                    binding.textView.text=sonuc.toString()+" "+"Kaldınız."
                    binding.textView.setTextColor(getColor(R.color.red))

                }

            } else{
                binding.textView.text="LÜTFEN SINAV SONUCUNU GİRİNİZ."
                binding.textView.setTextColor(getColor(R.color.red))




            }


        }
    }
}


