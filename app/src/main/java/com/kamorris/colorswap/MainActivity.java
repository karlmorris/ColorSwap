package com.kamorris.colorswap;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity implements ColorFragment.OnFragmentInteractionListener{

    ColorFragment[] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragments = new ColorFragment[4];

        fragments[0] = ColorFragment.newInstance("purple", 0);
        fragments[1] = ColorFragment.newInstance("cyan", 1);
        fragments[2] = ColorFragment.newInstance("darkgrey", 2);
        fragments[3] = ColorFragment.newInstance("red", 3);

        getFragmentManager()
                .beginTransaction()
                .add(R.id.box0, fragments[0])
                .commit();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.box1, fragments[1])
                .commit();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.box2, fragments[2])
                .commit();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.box3, fragments[3])
                .commit();

    }


    public void changeColor(int id){
        for (int i = 0; i < fragments.length; i++){
            if (i != id)
                fragments[i].changeYourColor();
        }
    }

}
