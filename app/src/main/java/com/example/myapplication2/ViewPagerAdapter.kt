package com.example.myapplication2

import android.database.sqlite.SQLiteDatabase
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(val fa: FragmentActivity, var database: SQLiteDatabase): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        var frag: Fragment? = null
        when (position) {
            0->frag = MainFragment(database)
            1->frag = ImageFragment(database, fa)
            2->frag = SettingFragment(database)
        }
        return frag!!
    }

}