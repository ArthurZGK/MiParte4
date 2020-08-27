package com.example.miparte4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ActionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Notification Broadcast",Toast.LENGTH_SHORT).show();
        String action=intent.getAction();
        if(action.equals("pausar")){
            performAction1();
        }
        else if(action.equals("reproducir")){
            performAction2();
        }
    }
    public void performAction1(){
        ServicioMusica.reproductor.pause();
    }
    public void performAction2(){ ServicioMusica.reproductor.start(); }
}