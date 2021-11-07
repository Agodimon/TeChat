package com.bignerdranch.android.telechat.ui.fragments

import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.bignerdranch.android.telechat.MainActivity
import com.bignerdranch.android.telechat.R
import com.bignerdranch.android.telechat.activities.RegisterActivity
import com.bignerdranch.android.telechat.utilits.AUTH
import com.bignerdranch.android.telechat.utilits.replaceActivity


class SettingsFragment : BaseFragment(R.layout.fragment_settings) {


    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.settings_action_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.settings_menu_exit->{
                AUTH.signOut()
                (activity as MainActivity).replaceActivity(RegisterActivity())
            }
        }
        return true
    }

}