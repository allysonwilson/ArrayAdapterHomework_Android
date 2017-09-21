package com.example.arrayadapterhomework;


import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/21/17.
 */

public class AnimalList {

    private ArrayList<Animal> list;

    public AnimalList(){
        list = new ArrayList<Animal>();
        list.add(new Animal(1, "Giraffe", "leaves"));
        list.add(new Animal(2, "Lion", "goat"));
        list.add(new Animal(3, "Penguin", "mackerel"));
        list.add(new Animal(4, "Otter", "fish"));
        list.add(new Animal(5, "Monkey", "fruit"));
        list.add(new Animal(6, "Bat", "fruit"));
        list.add(new Animal(7, "Meerkat", "fruit"));
        list.add(new Animal(8, "Bear", "fish"));
        list.add(new Animal(9, "Wolf", "meat"));
        list.add(new Animal(10, "Lynx", "meat"));
        list.add(new Animal(11, "Deer", "grass"));
        list.add(new Animal(12, "Elephant", "fruit"));
    }

    public ArrayList<Animal> getList { return new ArrayList<Animal>(list); }
}
