package com.example.receiverapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.receiverapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(intent!!) {
            binding.un.text = getString(R.string.username,getStringExtra("username"))
            binding.age.text = getString(R.string.age,getStringExtra("age"))
        }
    }
}