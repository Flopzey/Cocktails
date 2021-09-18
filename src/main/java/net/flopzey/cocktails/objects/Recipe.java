package net.flopzey.cocktails.objects;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private List<RecipeStep> recipeSteps;
    //private String rating; //todo create rating class
    private boolean favorite;

    public Recipe(){

        this.recipeSteps = new ArrayList<>();

    }

    public void addRecipeSteps( RecipeStep recipeStep ) {
        this.recipeSteps.add(recipeStep);
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public List<RecipeStep> getRecipeSteps() {
        return this.recipeSteps;
    }

    public boolean isFavorite() {
        return this.favorite;
    }

}
