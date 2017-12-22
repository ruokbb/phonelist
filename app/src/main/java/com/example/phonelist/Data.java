package com.example.phonelist;

/**
 * Created by lenovo on 2017/12/21.
 */

public class Data {
    private String name;
    private  String number;

    public Data (String name,String number){
        this.name=name;
        this.number=number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName(){
        return this.name;
    }

    public  String getNumber(){
        return  this.number;
    }
}
