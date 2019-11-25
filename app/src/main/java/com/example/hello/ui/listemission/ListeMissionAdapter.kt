package com.example.hello.ui.listemission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hello.R
import com.example.hello.data.model.MissionModel
import android.os.Bundle





class ListeMissionAdapter(val missionListe: ArrayList<MissionModel>) : RecyclerView.Adapter<ListeMissionAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.mission_card, p0, false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return missionListe.size
    }
    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        p0.name?.text = missionListe[p1].titre
        p0.detail?.text = missionListe[p1].description
        p0.image?.setImageResource(com.example.hello.R.drawable.test)

    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(com.example.hello.R.id.item_title)
        val detail = itemView.findViewById<TextView>(com.example.hello.R.id.item_detail)
        val image = itemView.findViewById<ImageView>(com.example.hello.R.id.item_image)

    }

}

