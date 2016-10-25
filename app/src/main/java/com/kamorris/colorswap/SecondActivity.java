package com.kamorris.colorswap;

import android.app.Activity;
import android.os.Bundle;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getFragmentManager()
                .beginTransaction()
                .add(new ColorFragment(), null)
                .commit();
    }
}
