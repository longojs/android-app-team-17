package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Rodolfo on 11/16/17.
 */

public class AlarmReciever extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "ALARM!!!!", Toast.LENGTH_LONG).show();
        Vibrator vib = (Vibrator)context.getSystemService(context.VIBRATOR_SERVICE);
        vib.vibrate(2000);
        //Log.d("MyAlarmBelal", "Alarm just fired");
    }
}
