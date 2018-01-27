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

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.click);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // starting background task to update product
                Intent fp = new Intent(getApplicationContext(), VolunteerOpportunity.class);
                startActivity(fp);
            }
        });
    }
}



