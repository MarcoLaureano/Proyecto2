package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;

import java.util.List;

import com.example.proyecto2.ApiClient.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface personaService = ApiClient.getPersonaService();
        Call<List<Persona>> call = personaService.getPersones();

        call.enqueue(new Callback<List<Persona>>() {
            @Override
            public void onResponse(Call<List<Persona>> call, Response<List<Persona>> response) {
               if(response.isSuccessful()) {
                   List<Persona> personas = response.body();

                   for (Persona p : personas){
                       System.out.println(p.toString());
                   }
               }
            }

            @Override
            public void onFailure(Call<List<Persona>> call, Throwable t) {
                System.out.println("Error Aqui =>");
            }
        });
    }


}