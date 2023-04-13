package com.example.handlerlooperuiworkerthreadpoc.thread;

import android.os.Handler;
import android.os.HandlerThread;

/**
 * @Author: Archana Kumari
 * @Date: 12-04-2023
 */
public class HandlerThreadDemo extends HandlerThread {
    private android.os.Handler mTaskHandler;

    public HandlerThreadDemo(String name) {
        super(name);
    }

    public HandlerThreadDemo(String name, int priority) {
        super(name, priority);
    }

    public Handler initHandler() {
        mTaskHandler = new android.os.Handler(this.getLooper());
        return mTaskHandler;
    }
}
