package com.blueradix.android.jetpackviewmodel.ui.main;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blueradix.android.jetpackviewmodel.databinding.MainFragmentBinding;

public class MainFragment extends Fragment {

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    private MainViewModel mViewModel;

    private MainFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        binding = MainFragmentBinding.inflate(inflater, container, false); // The magic happens here
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //here the owner is this
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        //set data into the UI component as soon as the View is created. To avoid errors, initialize the property total with an empty string.
        //update the UI setting a value to total when the app starts or restarts due to a Device Rotation
        binding.totalTextView.setText(mViewModel.getTotal());

        binding.doubleItButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount = binding.amountTextInputEditText.getEditableText().toString();
                Log.i("amount", amount);
                if(!TextUtils.isEmpty(amount)){

                    double total = Double.parseDouble(amount) * 2;
                    //update the view model, so it has the latest value
                    mViewModel.setTotal(String.valueOf(total));
                    //update the UI
                    binding.totalTextView.setText(mViewModel.getTotal());
                }else{
                    binding.totalTextView.setText("NO VALUE");
                }
            }
        });
    }

}