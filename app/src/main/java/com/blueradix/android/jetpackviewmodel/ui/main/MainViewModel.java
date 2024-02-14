package com.blueradix.android.jetpackviewmodel.ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

/**
 * This is a class that acts as screen  level state holder.
 * It exposes state to the UI and encapsulates related business logic.
 * Its principal advantage is that it caches state and persists it through configuration changes.
 * This means that your UI doesn't have to fetch data again when navigating between activities,
 * or following configuration changes, such as when rotating the screen.
 * <p>
 * More information about ViewModels:
 *  <a href="https://developer.android.com/topic/libraries/architecture/viewmodel/viewmodel-apis#java">...</a>
 * <p>
 *  if you wish to share a view model among different fragments:
 * <p>
 *  SharedViewModel viewModel;
 *      The ViewModel is scoped to the parent of `this` Fragment
 viewModel=new ViewModelProvider(requireParentFragment()).get(SharedViewModel.class);
 *
 */
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