package com.example.android33;

import static com.example.android33.Fragment_Main.MASSAGE;
import static com.example.android33.Fragment_Main.THEME;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment3 extends Fragment {

    private Button button3;
    private EditText editTextName3, editTextSurname3;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_fragment3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        button3 = view.findViewById(R.id.btn3);
        editTextName3 = view.findViewById(R.id.ed_name3);
        editTextSurname3 = view.findViewById(R.id.ed_surname3);

        button3.setOnClickListener(view1 -> {
            MainActivity activity = (MainActivity) requireActivity();
            MainActivity.isMainFragment = false;
            Bundle bundle = new Bundle();
            Fragment fragment = new com.example.android33.Fragment4();
            if (editTextName3.getText()!=null){
                bundle.putString(THEME,editTextName3.getText().toString());
            }
            if (editTextSurname3.getText()!=null){
                bundle.putString(MASSAGE,editTextSurname3.getText().toString());
            }
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
        });
        Bundle bundle = getArguments();
        if (bundle != null) {
            String theme = bundle.getString(THEME);
            editTextName3.setText(theme);
        }
        if (bundle != null) {
            String theme = bundle.getString(MASSAGE);
            editTextSurname3.setText(theme);
        }

    }

}