package com.example.handlerlooperuiworkerthreadpoc.viewmodel;

import android.os.Handler;

import androidx.lifecycle.ViewModel;

import com.example.handlerlooperuiworkerthreadpoc.runnable.HandlerThreadRunnable;
import com.example.handlerlooperuiworkerthreadpoc.thread.HandlerThreadDemo;
import com.example.handlerlooperuiworkerthreadpoc.runnable.PlainThread;
import com.example.handlerlooperuiworkerthreadpoc.thread.PlainThreadDemo;

/**
 * @Author: Archana Kumari
 * @Date: 03-04-2023
 */
public class UiModel extends ViewModel {
    // Same thread can`t start again
    private PlainThread plainThreadRunnable = new PlainThread();
    private Thread plainThread = new Thread(plainThreadRunnable);

    public void startBackThread() {
        //new Thread(new PlainThread()).start();
        plainThread.start();
    }

    // HandlerThreadDemo handlerThreadDemo = new HandlerThreadDemo("HandlerThreadDemo");click again button to start thread then os will crash the appliction
    // Only one looper may be created per thread.

    public void startHandlerThread() {
        HandlerThreadDemo handlerThreadDemo = new HandlerThreadDemo("HandlerThreadDemo");
        handlerThreadDemo.start();
        Handler handler = handlerThreadDemo.initHandler();
        handler.post(new HandlerThreadRunnable());
    }

    PlainThreadDemo plainThreadDemo = new PlainThreadDemo();
    public void startBackThreadExtendsThread(){
        plainThreadDemo.start();
    }
}
