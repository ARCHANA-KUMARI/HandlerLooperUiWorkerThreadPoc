package com.example.handlerlooperuiworkerthreadpoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.app.UiAutomation;
import android.os.Bundle;

import com.example.handlerlooperuiworkerthreadpoc.databinding.ActivityMainBinding;
import com.example.handlerlooperuiworkerthreadpoc.viewmodel.UiModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mMainBinding;
    private UiModel mUiModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mUiModel = new ViewModelProvider(this).get(UiModel.class);
        mMainBinding.setMainUiModel(mUiModel);
    }
}
