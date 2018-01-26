package com.example.mastercheif.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.Menu;
import android.view.View;
import android.util.Log;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBtn1 = (Button) findViewById(R.id.button_send);
        mBtn1.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        Log.i("clicks","You Clicked B1");
        Intent i=new Intent(MainActivity.this, VolunteerOpportunity.class);
        startActivity(i);
    }

}

