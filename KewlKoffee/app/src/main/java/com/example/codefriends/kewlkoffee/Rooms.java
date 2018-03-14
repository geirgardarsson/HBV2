package com.example.codefriends.kewlkoffee;

/**
 * Created by adalsteinn95 on 18.2.2018.
 */

public class Rooms {

    private String name;
    private int id;
    private String token;
    private String stream;


    public Rooms(int i, String n, String a, String s){
        /* id set */
        id = i;
        /* name for room set */
        name = n;

        /* stream url */
        stream = s;

        /* Token generated */
        token = generateToken();

    }

    public String generateToken(){
        return "kewl";
    }

    public String getStream(){
        return stream;
    }

    public String getName(){
        return name;
    }


}
