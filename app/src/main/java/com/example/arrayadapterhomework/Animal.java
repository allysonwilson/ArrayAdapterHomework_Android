package com.example.arrayadapterhomework;

/**
 * Created by allysonwilson on 9/21/17.
 */

public class Animal {
    private int ranking;
    private String species;
    private String favouriteFood;

    public Animal(Integer ranking, String species, String favouriteFood) {
        this.ranking = ranking;
        this.species = species;
        this.favouriteFood = favouriteFood;
    }


    public int getRanking() {
        return ranking;
    }

    public String getSpecies() {
        return species;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }


}


