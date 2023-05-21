package com.example.recipebook.model;

public class FlavorTitle {
    private String title;
    private Flavor flavor;

    public FlavorTitle(String title, Flavor flavor) {
        this.title = title;
        this.flavor = flavor;
    }

    public String getTitle() {
        return title;
    }

    public Flavor getFlavor() {
        return flavor;
    }
}
