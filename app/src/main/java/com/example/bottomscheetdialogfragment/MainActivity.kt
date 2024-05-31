package com.example.bottomscheetdialogfragment


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomscheetdialogfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)



        binding?.buttonMovie?.setOnClickListener(this)

    }

    override fun onClick(view: View?) {


        val details = Details()
        val parameters = Bundle()


        parameters.putString("height",binding?.yourHeight?.text?.toString())
        parameters.putString("weight",binding?.yourWeight?.text?.toString())
        parameters.putString("hobby",binding?.yourHobby?.text?.toString())

        details.arguments = parameters


        details.show(supportFragmentManager,"details")

    }
}
