package com.isi.signuploginrealtime;

public class user {
    public String username  , email;
    public Integer age;

    public user(String username, Integer age, String email, String password, String rad){

    }
    public user(String username,String email,Integer age ){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
