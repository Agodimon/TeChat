package com.bignerdranch.android.telechat.ui.fragments

import androidx.fragment.app.Fragment
import com.bignerdranch.android.telechat.R
import com.bignerdranch.android.telechat.utilits.AppTextWatcher
import com.bignerdranch.android.telechat.utilits.showToast
import kotlinx.android.synthetic.main.fragment_enter_code.*


class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {
    override fun onStart() {
        super.onStart()
        register_input_code.addTextChangedListener(AppTextWatcher {
            val string = register_input_code.text.toString()
            if (string.length == 6) {
                verificateCode()
            }
        })
    }

    fun verificateCode() {
        showToast("OK")
    }
}