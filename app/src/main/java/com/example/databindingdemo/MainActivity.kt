package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson :Person = Person("Ali", "123456", "ali@gmail.com", "123 Jalan xyz")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.personData = aPerson

//        binding.tvName.text = aPerson.name
//        binding.tvIc.text = aPerson.ic
//        binding.tvEmail.text = aPerson.email
//        binding.tvAddress.text = aPerson.address

        binding.btnUpdate.setOnClickListener(){
                aPerson.email = "abu@gmail.com"
                binding.apply{ invalidateAll() }
        }

    }
}