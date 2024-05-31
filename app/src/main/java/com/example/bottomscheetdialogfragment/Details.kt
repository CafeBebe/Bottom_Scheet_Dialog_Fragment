package com.example.bottomscheetdialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomscheetdialogfragment.databinding.DetailsBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class Details :BottomSheetDialogFragment(),View.OnClickListener {

    private var binding: DetailsBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= DetailsBinding.inflate(inflater,container,false)


        binding?.myHeight?.text = arguments?.getString("height").toString()
        binding?.myWeight?.text = arguments?.getString("weight").toString()
        binding?.myHobby?.text = arguments?.getString("hobby").toString()

        when(binding?.myHeight?.text){


            getString(R.string.height)->binding?.myFoto?.setImageResource(R.color.ping)
        }

        binding?.closePanel?.setOnClickListener(this)


        return binding?.root
    }

    override fun onClick(view: View?) {
       when(view?.id){
           R.id.closePanel -> dismiss()
       }
    }

}