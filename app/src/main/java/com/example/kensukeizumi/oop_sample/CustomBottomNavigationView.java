package com.example.kensukeizumi.oop_sample;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by kensukeizumi on 2017/08/02.
 */

public class CustomBottomNavigationView extends LinearLayout {
    private LayoutInflater inflater;

    public CustomBottomNavigationView(Context context) {
        this(context, null);
    }

    public CustomBottomNavigationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d("fjeoifj", "jfaiwejf");
        setGravity(Gravity.CENTER_HORIZONTAL);
        setOrientation(HORIZONTAL);
        inflater = LayoutInflater.from(getContext());
        setOnClickListener(null);
    }
}
