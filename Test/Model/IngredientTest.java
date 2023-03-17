package Model;
import  Model.Ingredient;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import  Exception.InvalidNumberException;
public class IngredientTest {

    @Test
    public void sertupStage1(){

        // el objeto es creado correctamente.

        Ingredient ingredient = new Ingredient("Tomate ", 245);
        assertNotNull(ingredient);
        assertEquals(ingredient.getName(), "Tomate ");
        assertEquals(ingredient.getWeigth(), 245);

    }

        @Test
        public void AumentarPesoAlIngrediente() {
            Ingredient ingrediente = new Ingredient("Tomate ", 245);
            ingrediente.Aumentarpeso(54);
            assertEquals(299, ingrediente.getWeigth());


        }

        @Test
        public void DisminuirPesoAlIngrediente() {
          boolean result = false;
          try {

            Ingredient ingrediente = new Ingredient("Tomate ", 245);
            ingrediente.DisminuirPeso(-100);
            result = true;
        } catch (InvalidNumberException ex){

              ex.printStackTrace();
          }
          assertTrue(result);

    }



}
