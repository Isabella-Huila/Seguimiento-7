package Model;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {


    @Test

    public void steupStage1(){

        Recipe recipe = new Recipe("");
        assertNotNull(recipe);
       // assertEquals(0, recipe.getIngredients().size());

    }

     @Test
    public void steupStage2(){

        Ingredient primerIngrediente = new Ingredient("Cebolla ", 315);

        Ingredient segundoIngrediente = new Ingredient("Ajo", 58);

        Ingredient tercerIngrediente = new Ingredient("Arroz ", 520);


        Recipe recipe = new Recipe("");

        recipe.agregarUnIngrediente(primerIngrediente);
        recipe.agregarUnIngrediente(segundoIngrediente);
        recipe.agregarUnIngrediente(tercerIngrediente);


        assertEquals(3, recipe.getIngredients().size());
        //assertEquals();

        assertTrue(recipe.getIngredients().contains(primerIngrediente));
        assertTrue(recipe.getIngredients().contains(segundoIngrediente));
        assertTrue(recipe.getIngredients().contains(tercerIngrediente));


    }
}
