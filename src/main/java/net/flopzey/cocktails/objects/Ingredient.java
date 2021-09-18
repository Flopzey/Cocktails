package net.flopzey.cocktails.objects;

import java.util.ArrayList;
import java.util.List;

public class Ingredient {

    private String name;
    private String type;
    private boolean alcohol;
    private List<Tag> tags;

    public Ingredient() {

        this.tags = new ArrayList<>();

    }

    public void setName( String name ){
        this.name = name;
    }

    public void setType( String type ){
        this.type = type;
    }

    public void setAlcohol( boolean alcohol ){
        this.alcohol = alcohol;
    }

    public void addTags( Tag tag ){
        this.tags.add( tag );
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public boolean isAlcohol() {
        return this.alcohol;
    }

    public List<Tag> getTags() {
        return this.tags;
    }
}
