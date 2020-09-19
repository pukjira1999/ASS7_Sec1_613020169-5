package com.example.ass7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.adddata.*
import kotlinx.android.synthetic.main.adddata.view.*

class MainActivity : AppCompatActivity() {
    val employeeList : ArrayList<Employee> = arrayListOf<Employee>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        employeeData()
        recycler_view.adapter = EmpolyeeAdapter(this.employeeList,applicationContext)
        recycler_view.layoutManager = LinearLayoutManager(applicationContext)
    }
    fun employeeData(){
        employeeList.add(Employee("Danny","Male","danny@kku.ac.th",30000))
        employeeList.add(Employee("Sara","Female","sara@kku.ac.th",34000))
    }
    fun addEmployee(view: View){

        val mDialogView : View = LayoutInflater.from(this).inflate(R.layout.adddata,null)
        val myBuilder = AlertDialog.Builder(this)
        myBuilder.setView(mDialogView)

        val mAlertDialog : AlertDialog = myBuilder.show()



        mAlertDialog.adddata.setOnClickListener {
            val id = mAlertDialog.radioGroup.checkedRadioButtonId
            val a = mAlertDialog.findViewById<RadioButton>(id)

            employeeList.add(
                Employee(
                    mAlertDialog.edit_name.text.toString(),
                    a?.text.toString(),
                    mAlertDialog.edit_mail.text.toString(),
                    mAlertDialog.edit_saraly.text.toString().toInt()
                )
            )
            recycler_view.adapter?.notifyDataSetChanged()
            Toast.makeText(
                applicationContext,
                "This employee is added successfully",
                Toast.LENGTH_LONG
            ).show()
            mAlertDialog.dismiss()
        }
        mAlertDialog.cencel.setOnClickListener {
            mAlertDialog.dismiss()
        }
    }
}