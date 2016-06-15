package com.techreviewsandhelp.studyhelper;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by crua9 on 6/15/2016.
 */
public class Settings extends Activity{

    private Button dropbox, googledrive, email;
    private Spinner topic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }
}
