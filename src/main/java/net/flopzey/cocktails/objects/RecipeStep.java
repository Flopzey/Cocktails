package net.flopzey.cocktails.objects;

public class RecipeStep {

    private Ingredient ingredient;
    private String quantity;
    private String description;

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Ingredient getIngredient() {
        return this.ingredient;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public String getDescription() {
        return this.description;
    }

}
