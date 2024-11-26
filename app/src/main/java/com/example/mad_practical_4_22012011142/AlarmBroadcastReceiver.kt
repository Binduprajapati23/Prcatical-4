package com.example.mad_practical_4_22012011142
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
class AlarmBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val action = intent.getStringExtra("Service1")
        if (action == "Start") {
            context.startService(Intent(context, AlarmService::class.java))
        } else if (action == "Stop") {
            context.stopService(Intent(context, AlarmService::class.java))
        }
    }
}