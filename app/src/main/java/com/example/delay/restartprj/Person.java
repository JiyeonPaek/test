package com.example.delay.restartprj;

import java.io.Serializable;
import java.io.StringReader;

/**
 * Created by delay on 2017. 1. 9..
 */

public class Person implements Serializable
{
    private String name;        //이름
    private  String gender;     //성별
    private String organization;//소속


    public Person(String name, String gender, String organization)
    {
        this.name = name;
        this.gender = gender;
        this.organization = organization;
    }

    public String getString()
    {
        return String.format("이름 : %s\n 성별 : %s\n  소속 : %s", name, gender, organization);
    }



}
