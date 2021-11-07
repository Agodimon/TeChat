package com.bignerdranch.android.telechat.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bignerdranch.android.telechat.R
import com.bignerdranch.android.telechat.databinding.ActivityRegisterBinding
import com.bignerdranch.android.telechat.ui.fragments.EnterPhoneNumberFragment
import com.bignerdranch.android.telechat.utilits.replaceActivity
import com.bignerdranch.android.telechat.utilits.replaceFragment

class RegisterActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityRegisterBinding
    private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        mToolbar = mBinding.registerToolbar
        setSupportActionBar(mToolbar)
        title=getString(R.string.register_title_your_phone)

        replaceFragment(EnterPhoneNumberFragment())


    }
}