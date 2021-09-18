package net.flopzey.cocktails.objects;

import java.util.ArrayList;
import java.util.List;

public class Cocktail {

    private String name;
    private String description;
    private List<Recipe> recipes;
    //private String rating; //todo create rating class
    private boolean favorite;
    private List<Tag> tags;

    public Cocktail() {

        this.recipes = new ArrayList<>();
        this.tags = new ArrayList<>();

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addRecipes( Recipe recipe ){
        this.recipes.add(recipe);
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public void addTags(Tag tag){
        this.tags.add(tag);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public List<Recipe> getRecipes() {
        return this.recipes;
    }

    public boolean isFavorite() {
        return this.favorite;
    }

    public List<Tag> getTags() {
        return this.tags;
    }
}
