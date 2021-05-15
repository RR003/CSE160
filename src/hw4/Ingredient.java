package hw4;

import java.util.ArrayList;

public class Ingredient {

    private String name;
    private String measuringUnit;
    private int caloriesPerUnit;

    public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
        this.name = name;
        this.measuringUnit = measuringUnit;
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(String measuringUnit) {
        this.measuringUnit = measuringUnit;
    }

    public int getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public void setCaloriesPerUnit(int caloriesPerUnit) {
        this.caloriesPerUnit = caloriesPerUnit;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", measuringUnit='" + measuringUnit + '\'' +
                ", caloriesPerUnit=" + caloriesPerUnit;
    }

    public boolean equals(Object o) {
        if (o instanceof Ingredient) {
            return (this.getName().equals(((Ingredient) o).getName()) && this.getCaloriesPerUnit() == ((Ingredient) o).getCaloriesPerUnit() && this.getMeasuringUnit().equals(((Ingredient) o).getMeasuringUnit()));
        }
        return false;
    }
}



class RecipeIngredient extends Ingredient{

    private float quantity;

    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
        super(name, measuringUnit, caloriesPerUnit);
        this.quantity = quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getQuantity();
    }

    public boolean equals(Object o) {
        if (o instanceof RecipeIngredient) {
            return super.equals(o) && this.getQuantity() == ((RecipeIngredient) o).getQuantity();
        }
        return false;
    }
}



class CookingRecipe {
    private String name;
    private ArrayList<RecipeIngredient> recipeIngredients;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CookingRecipe(String name) {
        this.name = name;
        recipeIngredients = new ArrayList<>();
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
        boolean isInList = false;
        for (int i = 0; i < recipeIngredients.size(); i++) {
            if (recipeIngredients.get(i).equals(ingredient)) {
                recipeIngredients.get(i).setQuantity(quantity);
                isInList = true;
            }
        }
        if (!isInList) {
            recipeIngredients.add(new RecipeIngredient(ingredient.getName(), ingredient.getMeasuringUnit(), ingredient.getCaloriesPerUnit(), quantity));
        }
    }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
        return getRecipeIngredient(ingredient.getName());
    }

    public RecipeIngredient getRecipeIngredient(String ingredientName) {
        for (RecipeIngredient recipeIngredient : recipeIngredients) {
            if (recipeIngredient.getName().equals(ingredientName)) return recipeIngredient;
        }
        return null;
    }

    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
        return removeRecipeIngredient(ingredient.getName());
    }

    public RecipeIngredient removeRecipeIngredient(String ingredientName) {
        for (int i = 0; i < recipeIngredients.size(); i++) {
            RecipeIngredient recipeIngredient = recipeIngredients.get(i);
            if (recipeIngredient.getName().equals(ingredientName)) {
                recipeIngredients.remove(i);
                return recipeIngredient;
            }
        }
        return null;
    }

    public float calculateCalories() {
        int result = 0;
        for (int i = 0; i < recipeIngredients.size(); i++) {
            result += recipeIngredients.get(i).getCaloriesPerUnit();
        }
        return result;
    }

    public int getNumberOfIngredients() {return recipeIngredients.size(); }

    public String toString() {
        String s = "[";
        s += this.getName() + "\n";
        for (RecipeIngredient rc : recipeIngredients) {
            s += rc.toString() + " ";
        }
        s += "]";
        return s;
    }

    public boolean equals(Object o) {
        if (o instanceof CookingRecipe) {
            CookingRecipe c = (CookingRecipe) o;
            return this.getName().equals(((CookingRecipe) o).getName());
        }
        return false;
    }
}



class RecipeBook {
    private String bookName;
    private ArrayList<CookingRecipe> recipeBook;

    public RecipeBook(String bookName) {
        this.bookName = bookName;
        recipeBook = new ArrayList<>();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {

        boolean isInBook = false;
        for (CookingRecipe cook : recipeBook) {
            if (cook.getName().equals(name)){

                isInBook = true;
                return null;
            }
        }
        if (!isInBook) {
            CookingRecipe recipe = new CookingRecipe(name);
            for (int i = 0; i < ingredients.length; i++) {
                recipe.addOrUpdateRecipeIngredient(ingredients[i], ingredients[i].getQuantity());
            }
            recipeBook.add(recipe);
            return recipe;
        }
        return null;
    }

    public CookingRecipe removeRecipe(String name) {
        int i = 0;
        for (CookingRecipe cookingRecipe : recipeBook) {
            if (cookingRecipe.getName().equals(name)) {
                recipeBook.remove(i);
                break;
            }
            i++;
        }
        return null;
    }

    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < recipeBook.size(); i++) {
            CookingRecipe recipe = recipeBook.get(i);
            for (int j = 0; j < ingredients.length; j++) {
                RecipeIngredient ing = recipe.getRecipeIngredient(ingredients[j]);
                if (ing == null) break;
                if (j == ingredients.length - 1) list.add(i);
            }
        }
        if (list.size() == 0) return null;
        // System.out.println(list);
        CookingRecipe[] cookingRecipes = new CookingRecipe[list.size()];
        for (int i = 0; i < cookingRecipes.length; i++) {
            cookingRecipes[i] = recipeBook.get(list.get(i));
        }
        return cookingRecipes;
    }

    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients){
        ArrayList<Integer> list = new ArrayList<>();
        int k = 0;
        for (CookingRecipe recipe : recipeBook) {
            if (recipe.getNumberOfIngredients() <= numberOfIngredients) list.add(k);
            k++;
        }
        if (list.size() == 0) return null;
        CookingRecipe[] recipes = new CookingRecipe[list.size()];
        for (int i = 0; i < list.size(); i++) {
            recipes[i] = recipeBook.get(list.get(i));
        }
        return recipes;
    }

    public CookingRecipe[] findRecipesLowCalories() {
        ArrayList<Integer> list = new ArrayList<>();
        int min = 999999999;
        int iter = 0;
        for (CookingRecipe recipe : recipeBook) {
            if (recipe.calculateCalories() < min) {
                list = new ArrayList<>();
                list.add(iter);
            }else if (recipe.calculateCalories() == min) list.add(iter);
            iter++;
        }

        CookingRecipe[] cookingRecipes = new CookingRecipe[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cookingRecipes[i] = recipeBook.get(i);
        }
        return cookingRecipes;
    }

    public String toString() {
        String s = "[";
        for (CookingRecipe rc : recipeBook) {

            s += rc.toString() + "\n";
        }
        s += "]";
        return s;
    }

    public boolean equals(Object o) {
        if (o instanceof RecipeBook) {
            CookingRecipe c = (CookingRecipe) o;
            return this.getBookName().equals(((RecipeBook) o).getBookName());
        }
        return false;
    }
}
