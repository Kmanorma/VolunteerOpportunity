package com.example.mastercheif.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                Button button2 = (Button) findViewById(R.id.button_send);
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // starting background task to update product
                        Intent fp1 = new Intent(getApplicationContext(), Opportunity.class);
                        startActivity(fp1);
                    }
                });
    }
}



