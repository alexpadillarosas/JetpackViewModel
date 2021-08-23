package com.blueradix.android.jetpackviewmodel.ui.main;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.blueradix.android.jetpackviewmodel.R;
import com.blueradix.android.jetpackviewmodel.databinding.MainFragmentBinding;
import com.google.android.material.textfield.TextInputEditText;

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
        View view = binding.getRoot();
        return view;

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        //set data into the UI component as soon as the View is created. To avoid errors, initialize the property total with an empty string.
        //update the UI setting a value to total when the app starts or restarts due to a Device Rotation
        binding.message.setText(mViewModel.getTotal().toString());

        binding.doubleItButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!binding.amountTextInputEditText.getText().toString().equals("")){
                    String amount = binding.amountTextInputEditText.getText().toString();
                    double total = Double.parseDouble(amount) * 2;
                    //update the view model
                    mViewModel.setTotal(String.valueOf(total));
                    //update the UI
                    binding.message.setText(mViewModel.getTotal().toString());
                }else{
                    mViewModel.setTotal("NO VALUE");
                    binding.message.setText("NO VALUE");
                }
            }
        });
    }

}