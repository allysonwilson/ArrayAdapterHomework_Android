package com.example.arrayadapterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class AnimalListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_list);

        AnimalList animalList = new AnimalList();
        ArrayList<Animal> list = animalList.getList();



    }


}
