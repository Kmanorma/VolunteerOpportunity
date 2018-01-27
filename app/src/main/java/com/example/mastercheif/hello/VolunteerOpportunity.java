package com.example.mastercheif.hello;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import org.apache.http.NameValuePair;

public class VolunteerOpportunity extends Activity {
    Button btnsubmit;
    EditText em,ot,od,scl,str,city;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer);
        em=(EditText)findViewById(R.id.Email);
        ot=(EditText)findViewById(R.id.Opportunity_title);
        od=(EditText)findViewById(R.id.Opportunity_des);
        scl =(EditText)findViewById(R.id.School);
        str=(EditText)findViewById(R.id.Street);
        city =(EditText)findViewById(R.id.City);
        btnsubmit=(Button)findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View vw) {
                String field1 = em.getText().toString();
                String field2 = ot.getText().toString();
                String field3 = od.getText().toString();
                String field4 = scl.getText().toString();
                String field5 = str.getText().toString();
                String field6 = city.getText().toString();
                Tuple[] arrayValues = {
                        new Tuple("Email", field1),
                        new Tuple("Opportunity Title", field2),
                        new Tuple("Opportunity Description", field3),
                        new Tuple("School", field4),
                        new Tuple("Street", field5),
                        new Tuple("City", field6)
                };

                        List<Tuple> listOfValues = Arrays.asList(arrayValues);

                String url = "http://192.168.0.5:3000/volunteers";
               ServiceHandler serviceHandler = new ServiceHandler();
               serviceHandler.makePostCall(url, listOfValues);
            }
        });
    }
}

