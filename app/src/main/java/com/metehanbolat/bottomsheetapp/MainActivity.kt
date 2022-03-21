package com.metehanbolat.bottomsheetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.metehanbolat.bottomsheetapp.databinding.ActivityMainBinding
import com.metehanbolat.bottomsheetapp.databinding.BottomSheetDialogBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bottomOpenButton.setOnClickListener {
            val dialog = BottomSheetDialog(this)
            val bottomView = BottomSheetDialogBinding.inflate(LayoutInflater.from(it.context))
            bottomView.bottomButton.setOnClickListener {
                dialog.dismiss()
            }
            dialog.setCancelable(true)
            dialog.setContentView(bottomView.root)
            dialog.show()
        }

    }
}