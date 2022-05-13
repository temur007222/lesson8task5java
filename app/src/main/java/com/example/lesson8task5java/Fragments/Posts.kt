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
import kotlinx.android.synthetic.main.posts.view.*

class Posts: Fragment() {
    private lateinit var list: ArrayList<String>
    private var textView1: TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.posts, container, false)
        textView1 = view.findViewById(R.id.text_Posts_ID)
        view.posts_RecyclerView_ID.layoutManager = GridLayoutManager(container?.context, 1)
        list = ArrayList()
        for (i in 1..14) {
            list.add("There is some functions!")
            textView1?.text = list.toString()

        }
        val adapter = AdapterPager2(list)
        view.posts_RecyclerView_ID.adapter = adapter
        return view
    }
}