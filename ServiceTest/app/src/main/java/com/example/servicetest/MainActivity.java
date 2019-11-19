package com.example.servicetest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MyActivity";
    ListView listView;
    UserService userService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       listView = (ListView)findViewById(R.id.listview1);
        userService = ApiUtil.getuserservce();

        check();
    }

    public void check() {
        Call<List<employ>> call = userService.findAll();
        call.enqueue(new Callback<List<employ>>() {
            @Override
            public void onResponse(Call<List<employ>> call, Response<List<employ>> response) {

                List<employ> employs = (List<employ>) response.body();
                listView.setAdapter(new EmployListAdapter(employs,getApplicationContext()));

            }

            @Override
            public void onFailure(Call<List<employ>> call, Throwable t) {
                Log.d(TAG,"" + t.getMessage());
                Toast.makeText(MainActivity.this, ""+ t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }


}
