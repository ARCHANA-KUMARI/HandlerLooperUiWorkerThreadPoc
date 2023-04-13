package com.example.handlerlooperuiworkerthreadpoc.runnable;

import android.util.Log;

/**
 * @Author: Archana Kumari
 * @Date: 12-04-2023
 */
public class HandlerThreadRunnable implements Runnable {
    private static String TAG = "ArchanaHandlerThreadRunnable";

    @Override
    public void run() {
        Log.i(TAG, "Start run: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        Log.i(TAG, "End run: ");
    }
}
