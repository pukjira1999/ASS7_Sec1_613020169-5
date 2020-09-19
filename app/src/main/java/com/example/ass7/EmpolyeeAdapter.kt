package com.example.ass7

import android.app.job.JobWorkItem
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EmpolyeeAdapter (val item: List<Employee>, val Contect : Context):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item : View = LayoutInflater.from(parent.context).inflate(R.layout.show_view,parent,false)
        return ViewHolder(view_item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvname.text = "Name: "+item[position].name
        holder.tvgende.text = "Gender: "+item[position].gender
        holder.tvemail.text = "E-mail: "+item[position].mail
        holder.tvsalary.text = "Sarary: "+item[position].salary.toString()
    }

    override fun getItemCount(): Int {
        return item.size
    }
}