package hw4;

import hw4.CookingRecipe;
import hw4.Ingredient;
import hw4.RecipeBook;
import hw4.RecipeIngredient;

public class IngredientTest {
    public static void main(String[] args) {
        RecipeBook julia = new RecipeBook("French Cooking");
        julia.addRecipe("soup", new RecipeIngredient[] {
                new RecipeIngredient("potato", "lb", 100, 1),
                new RecipeIngredient("leaks", "lb", 50, 1)
        });
        julia.addRecipe("omlete", new RecipeIngredient[] {
                new RecipeIngredient("eggs", "count", 100, 2)
        });


        System.out.println(julia);

        CookingRecipe[] c = julia.findRecipes(new RecipeIngredient[] {
                new RecipeIngredient("eggs", "count", 100, 2)
        });
        // System.out.println(c.length);
        for (CookingRecipe c1 : c) System.out.println(c1);
        System.out.println("fewest ingredients");
        c = julia.findRecipesWithFewIngredients(1);
        for (CookingRecipe c1 : c) System.out.println(c1);
        System.out.println("fewest Calories");
        c = julia.findRecipesLowCalories();
        for (CookingRecipe c1 : c) System.out.println(c1);


        Ingredient ing1 = new Ingredient("eggs", "lb", 100);
        Ingredient ing2 = new Ingredient("eggs", "l", 100);
        System.out.println(ing1.equals(ing2));
    }
}
