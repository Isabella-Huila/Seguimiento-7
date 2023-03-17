package Model;

import  java.util.ArrayList;
import java.util.Arrays;

public class Recipe {

    private String name2;

    private ArrayList<Ingredient> ingredients;


    public Recipe (String name2) {
        this.name2 = name2;
        this.ingredients = new ArrayList<Ingredient>();

    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


    public  void agregarUnIngrediente(Ingredient ingredient){
        if( ingredient != null ){
            this.ingredients.add(ingredient);
        }
    }


    public void removerUnIngrediente( Ingredient ingredient){
        this.ingredients.remove(ingredient);
    }
}
