package com.example.holleword;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HELLOWORD extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloword);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.helloword, menu);
        return true;
    }
    
}
