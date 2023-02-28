package com.example.proyecto2;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import java.util.List;

public interface ApiInterface {
    @GET("persones")
    Call<List<Persona>> getPersones();




}
