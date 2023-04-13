package com.example.handlerlooperuiworkerthreadpoc.thread;

import android.util.Log;

/**
 * @Author: Archana Kumari
 * @Date: 13-04-2023
 */
public class PlainThreadDemo extends Thread {
    private static String TAG = "ArchanaPlainThreadDemo";

    @Override
    public void run() {
        Log.i(TAG, "Start run: ");
        for (int i = 0; i < 5; i++) {
            Log.i(TAG, "run: i" + i);
        }
        Log.i(TAG, "End run: ");
    }
}
