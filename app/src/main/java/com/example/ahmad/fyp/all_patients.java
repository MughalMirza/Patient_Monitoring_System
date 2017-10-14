package com.example.ahmad.fyp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by ahmad on 10/13/2017.
 */

public class all_patients extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View patient =inflater.inflate(R.layout.all_patients,container,false);

        CardView card = (CardView) patient.findViewById(R.id.card_view1);
        CardView card2 = (CardView) patient.findViewById(R.id.card_view2);

        Animation fade = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.myanimation);

        card.startAnimation(fade);
        card2.startAnimation(fade);


        return patient;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("All Patients");
    }
}
