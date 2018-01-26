package com.example.mastercheif.hello;

import org.apache.http.NameValuePair;

public class Tuple implements NameValuePair{
String Name;
String Value;

public Tuple(String name, String value){
    Name = name;
    Value = value;
}

public String getName(){
    return Name;
}
    public String getValue(){
        return Value;
    }

};
