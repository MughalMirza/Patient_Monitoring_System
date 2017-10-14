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

public class clinical_menu extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View clinical =inflater.inflate(R.layout.clinical_menu,container,false);

        CardView card1 = (CardView)  clinical.findViewById(R.id.card_view1);
        CardView card2 = (CardView)  clinical.findViewById(R.id.card_view2);
        CardView card3 = (CardView)  clinical.findViewById(R.id.card_view3);

        Animation clockwise = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.clockwise);

        card1.startAnimation(clockwise);
        card2.startAnimation(clockwise);
        card3.startAnimation(clockwise);


        return clinical;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Clinical Menu");
    }
}
