package com.hyunjine.alarmtest

import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val alarm = AlarmSettingManager(this)
        btn.setOnClickListener {
            for (i in AlarmDataList) {
                alarm.setAlarmManager(i)
            }
        }
    }
}