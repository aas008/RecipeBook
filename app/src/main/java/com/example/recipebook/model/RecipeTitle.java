package com.example.recipebook.model;

import java.util.List;

public class RecipeTitle {
    private String name;
    private List<FlavorTitle> flavorTitles;

    public RecipeTitle(String name, List<FlavorTitle> flavorTitles) {
        this.name = name;
        this.flavorTitles = flavorTitles;
    }

    public String getName() {
        return name;
    }

    public List<FlavorTitle> getFlavorTitles() {
        return flavorTitles;
    }
}
