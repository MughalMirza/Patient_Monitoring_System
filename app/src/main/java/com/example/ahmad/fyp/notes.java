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
import android.widget.TextView;

/**
 * Created by ahmad on 10/14/2017.
 */

public class notes extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View notes = inflater.inflate(R.layout.notes,container,false);

        CardView card = (CardView) notes.findViewById(R.id.card_view1);

        Animation slide = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.slide_bottom_to_top);

        card.startAnimation(slide);


        return notes;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Notes");
    }
}
