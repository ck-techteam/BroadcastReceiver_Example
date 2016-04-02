package com.codekhadi.broadcastreceiver_demo;

/**
 * Created by admin on 02-04-2016.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String extra_state = extras.getString(TelephonyManager.EXTRA_STATE);
            Log.d("My_state", extra_state);
            if (extra_state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                String mobileNumber = extras
                        .getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.d("My_state", mobileNumber);
            }
        }
    }
}
