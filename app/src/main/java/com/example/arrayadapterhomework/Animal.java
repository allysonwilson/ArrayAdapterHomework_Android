package com.example.arrayadapterhomework;

/**
 * Created by allysonwilson on 9/21/17.
 */

public class Animal {
    private int rank;
    private String species;
    private String favouriteFood;

    public Animal(Integer rank, String species, String favouriteFood) {
        this.rank = rank;
        this.species = species;
        this.favouriteFood = favouriteFood;
    }


    public int getRank() {
        return rank;
    }

    public String getSpecies() {
        return species;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }


}


