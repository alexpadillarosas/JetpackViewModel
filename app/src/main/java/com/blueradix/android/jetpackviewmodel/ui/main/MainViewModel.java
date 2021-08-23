package com.blueradix.android.jetpackviewmodel.ui.main;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private String message = "";

    public String getTotal() {
        return message;
    }

    public void setTotal(String total) {
        this.message = total;
    }
}