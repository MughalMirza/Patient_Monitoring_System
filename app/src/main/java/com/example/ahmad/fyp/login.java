package com.example.ahmad.fyp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by ahmad on 10/13/2017.
 */

public class login extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.login,container,false);

        ImageView logo = (ImageView)  view.findViewById(R.id.ecg_logo);

        TextView textCode = (TextView) view.findViewById(R.id.textcode);
        TextView textPass = (TextView) view.findViewById(R.id.textpass);

        EditText editCode = (EditText) view.findViewById(R.id.editcode);
        EditText editPass = (EditText) view.findViewById(R.id.editpass);

        Button login = (Button) view.findViewById(R.id.login);

        Animation slide = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.slide_top_to_bottom);
        Animation fade = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.fade);

        logo.startAnimation(slide);

        textCode.startAnimation(fade);
        textPass.startAnimation(fade);

        editCode.startAnimation(fade);
        editPass.startAnimation(fade);

        login.startAnimation(fade);

        // LOCK THE NAVIGATION DRAWER
        ((MainActivity)getActivity()).lockDrawer();

        Button button = (Button) view.findViewById(R.id.login);
        final EditText editccode = (EditText) view.findViewById(R.id.editcode);
        EditText editpass = (EditText) view.findViewById(R.id.editpass);

        final String edittcode = editccode.getText().toString();
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               // Toast.makeText(getActivity() ,edittcode, Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).unlockDrawer();
            }
        });




// CHANGE COLOR BACKGROUND
//            int[] androidColors = getResources().getIntArray(R.array.androidcolors);
//            int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
//            view.setBackgroundColor(randomAndroidColor);



        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Login");

    }
}
