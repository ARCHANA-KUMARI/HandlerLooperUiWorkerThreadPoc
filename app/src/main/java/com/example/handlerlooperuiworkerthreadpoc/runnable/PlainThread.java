package com.example.handlerlooperuiworkerthreadpoc.runnable;

import android.os.Handler;
import android.util.Log;

/**
 * @Author: Archana Kumari
 * @Date: 03-04-2023
 */
public class PlainThread  implements Runnable{
    private static String TAG = "ArchanaPlainThread";
    private Handler mHandler;
    @Override
    public void run() {
        Log.i(TAG, "start run: ");
       // mHandler = new Handler();
        Log.i(TAG, "End run: ");
    }
}
