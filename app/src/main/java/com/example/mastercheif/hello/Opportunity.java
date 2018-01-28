package com.example.mastercheif.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;


public class Opportunity extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          setContentView(R.layout.content_opportunity);

        String url = "http://192.168.0.5:3000/volunteers";
        ServiceHandler serviceHandler = new ServiceHandler();
        //serviceHandler.makeGetCall(url);
        String Response = serviceHandler.makeGetCall(url);

        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        ll.setGravity(Gravity.CENTER);

        try {
            JSONArray myarray = new JSONArray(Response);
            int size = myarray.length();
            for (int i = 0; i < size;i++){
                JSONObject jsonObj = myarray.getJSONObject(i);
                TextView tv1 = new TextView(this);

                Iterator<String> keys = jsonObj.keys();
                while (keys.hasNext()){
                    String key = keys.next();
                    String value = jsonObj.getString(key);
                    if (key.equals("_id")){
                        continue;
                    }
                    tv1.append(key + ":" + value + "\n");
                }

                tv1.setTextSize(10);
                tv1.setGravity(Gravity.CENTER);
                ll.addView(tv1);
                setContentView(ll);
            }

        } catch (JSONException e) {

        }



    }

}
