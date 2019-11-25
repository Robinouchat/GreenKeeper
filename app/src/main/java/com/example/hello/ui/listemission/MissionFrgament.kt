package com.example.hello.ui.listemission

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MissionFrgament: Fragment()  {


    companion object {

        fun newInstance(): MissionFrgament {
            return MissionFrgament()
        }
    }
    //private lateinit var listeMissionViewModel: ListeMissionViewModel

    public var mContext: Context? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(com.example.hello.R.layout.fragment_mission, container, false)
        //val textView: TextView = root.findViewById(com.example.hello.R.id.text_liste_mission)

        //val recyclerView = com.example.hello.R.id.recyclerView1 as RecyclerView
        //val recyclerView = root.findViewById(com.example.hello.R.id.recyclerView1) as RecyclerView

        return root
    }

}