package com.blueradix.android.jetpackviewmodel.ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {
    // TODO: Implement the ViewModel
    private String total = "";

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}