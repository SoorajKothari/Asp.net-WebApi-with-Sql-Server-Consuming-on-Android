package com.example.servicetest;

public class ApiUtil {

    //ip here or link to ur webapi 
    public static final String Base_URL = "http://192.168.0.1:49655/api/web/";

    public static UserService getuserservce(){

        return RemoteClient.getclient(Base_URL).create(UserService.class);
    }
}
