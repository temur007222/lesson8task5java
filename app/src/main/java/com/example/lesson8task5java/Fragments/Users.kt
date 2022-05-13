package com.example.lesson8task5java.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.lesson8task5java.R
import com.example.lesson8task5java.RecyclerViewAdapter.AdapterPager2
import kotlinx.android.synthetic.main.page2.view.*

class Users: Fragment() {
    private lateinit var list: ArrayList<String>
    private var textView1: TextView? = null
    private var textView2: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.page2, container, false)
        textView1 = view.findViewById(R.id.text_Users_ID)
        textView2 = view.findViewById(R.id.text_UsersNumber_ID)
        view.users_RecyclerView_ID.layoutManager = GridLayoutManager(container?.context, 1)
        list = ArrayList()
        for (i in 0..17) {
            list.add("Alisher")
            list.add("+998 97 8774494")
            textView1?.text = list.toString()
            textView2?.text = list.toString()
        }
        val adapter = AdapterPager2(list)
        view.users_RecyclerView_ID.adapter = adapter
        return view
    }

}