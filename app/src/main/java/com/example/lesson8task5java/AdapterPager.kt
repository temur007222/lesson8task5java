package com.example.lesson8task5java

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class AdapterPager (fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {
    private var list = ArrayList<Fragment>()
    private var title = ArrayList<String>()

    fun addLists(fragment: Fragment, string: String) {
        list.add(fragment)
        title.add(string)
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    override fun getPageTitle(position: Int): CharSequence {
        return title[position]
    }
}