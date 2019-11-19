package com.example.servicetest;

import com.google.gson.JsonArray;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {

    @GET("findall")
    Call<List<employ>> findAll();
}
