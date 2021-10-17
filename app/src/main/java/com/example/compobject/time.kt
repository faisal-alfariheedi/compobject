package com.example.compobject


import android.graphics.Color.parseColor
import android.view.View


class time {
    companion object{
        var time=""
        fun backtime(s: View,t: Int){
            when(t){
                0 -> s.setBackgroundColor(parseColor("#999999"))
                1 -> s.setBackgroundColor(parseColor("#000000"))
            }


        }
    }
}