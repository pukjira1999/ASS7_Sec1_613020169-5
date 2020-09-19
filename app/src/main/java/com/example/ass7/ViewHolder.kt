package com.example.ass7

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.show_view.view.*

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val tvname : TextView = view.tv_name
    val tvgende : TextView = view.tv_gender
    val tvemail : TextView = view.tv_email
    val tvsalary : TextView = view.tv_salary

}