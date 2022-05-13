package com.example.lesson8task5java.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson8task5java.R
import com.example.lesson8task5java.RecyclerViewAdapter.AdapterPager1
import kotlinx.android.synthetic.main.contact_layout.view.*


class Contact: Fragment() {
    lateinit var list: ArrayList<String>
    private var textView: TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.contact_layout, container, false)
        textView = view.findViewById(R.id.text_Contacts_ID)
        view.contacts_RecyclerView_ID.layoutManager = GridLayoutManager(container?.context, 1)
        list = ArrayList()
        for (i in 1..19) {
            list.add("Alisher")
            textView?.text = list.toString()
        }
        val adapter = AdapterPager1(list)
        view.contacts_RecyclerView_ID.adapter = adapter
        return view
    }
}