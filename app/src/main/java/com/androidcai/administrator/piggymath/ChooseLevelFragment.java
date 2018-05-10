package com.androidcai.administrator.piggymath;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ChooseLevelFragment extends Fragment {

    private int modelAnInt;
    private String userNameString;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Get Value From SharePerfer
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("MyData", Context.MODE_PRIVATE);
        modelAnInt = sharedPreferences.getInt("Mode", 0);
        userNameString = sharedPreferences.getString("Username", "");
        Log.d("10MayV1", "Mode ==> " + modelAnInt);
        Log.d("10MayV1", "User ==> " + userNameString);


    }   // Main Method

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_choose_level, container, false);
        return view;
    }
}
