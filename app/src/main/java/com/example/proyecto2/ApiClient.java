package com.example.proyecto2;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    /*Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.123.137:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    */

    private static final String BASE_URL = "http://192.168.123.137:8080/";
    private static  Retrofit retrofit;

    public static ApiInterface getPersonaService() {
        if ( retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.123.137:8080/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }

}
