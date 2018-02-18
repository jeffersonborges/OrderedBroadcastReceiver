package br.com.jborges.orderedbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * Created by jeffe on 18/02/2018.
 */
class MeuReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val results = getResultExtras(true)
        val extras = results.getString("extras")
        results.putString("extras", extras + "->" + "meuoutroreceiver")
    }

}