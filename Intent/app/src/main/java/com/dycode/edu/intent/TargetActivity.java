package com.dycode.edu.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        TextView txtResult = (TextView) findViewById(R.id.textView);

        //get data
        if(getIntent().getExtras() != null ){
            String data = getIntent().getExtras().getString(MainActivity. EXTRA_DATA );
            txtResult.setText(data);
    }
    }
}
