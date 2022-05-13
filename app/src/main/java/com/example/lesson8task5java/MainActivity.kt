package com.example.lesson8task5java

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.lesson8task5java.Fragments.Contact
import com.example.lesson8task5java.Fragments.Posts
import com.example.lesson8task5java.Fragments.Users
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var adapterPager: AdapterPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        hideActionBar()
    }

    private fun initViews() {
        tabLayout = findViewById(R.id.table_layoutId)
        viewPager = findViewById(R.id.viewpager_ID)

        adapterPager = AdapterPager(supportFragmentManager)


        adapterPager.addLists(Contact(), "Contacts")
        adapterPager.addLists(Users(), "Users")
        adapterPager.addLists(Posts(), "Posts")

        viewPager.adapter = adapterPager
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)?.setIcon(R.drawable.people)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.jfsdfkdfhdjfhd)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.people1)

    }
    private fun hideActionBar() {
        supportActionBar?.hide()
    }

}