package com.bignerdranch.android.telechat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bignerdranch.android.telechat.activities.RegisterActivity
import com.bignerdranch.android.telechat.databinding.ActivityMainBinding
import com.bignerdranch.android.telechat.ui.fragments.ChatsFragment
import com.bignerdranch.android.telechat.ui.objects.AppDrawer
import com.bignerdranch.android.telechat.utilits.replaceActivity
import com.bignerdranch.android.telechat.utilits.replaceFragment

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mAppDrawer: AppDrawer
    private lateinit var mToolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    private fun initFunc() {
        if (false) {
            setSupportActionBar(mToolbar)
            mAppDrawer.create()
            replaceFragment(ChatsFragment())
        } else {
            replaceActivity(RegisterActivity())

        }

    }


    private fun initFields() {

        mToolbar = mBinding.mainToolbar
        mAppDrawer = AppDrawer(this, mToolbar)
    }

}

