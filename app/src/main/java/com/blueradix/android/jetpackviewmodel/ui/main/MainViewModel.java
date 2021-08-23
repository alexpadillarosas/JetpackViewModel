package com.blueradix.android.jetpackviewmodel.ui.main;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private String total = "";

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}