package com.codefury.hackathon.safetyapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codefury.hackathon.safetyapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Settingsfragment extends Fragment {


    public Settingsfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settingsfragment, container, false);
    }

}
