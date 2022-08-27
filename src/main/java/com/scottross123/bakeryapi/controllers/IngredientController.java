package com.scottross123.bakeryapi.controllers;

import com.scottross123.bakeryapi.model.Ingredient;
import com.scottross123.bakeryapi.model.Recipe;
import com.scottross123.bakeryapi.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "api/v1/ingredient")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping
    public List<Ingredient> getIngredients() {
        return ingredientService.getIngredients();
    }

    @GetMapping("/{id}")
    public Ingredient getIngredient(@PathVariable Long id) {
        return ingredientService.getIngredient(id);
    }

    @PostMapping
    public void addIngredient(@RequestBody Ingredient ingredient) {
        ingredientService.addIngredient(ingredient);
    }

    @DeleteMapping("/{id}")
    public void deleteIngredient(@PathVariable Long id) {
        ingredientService.deleteIngredient(id);
    }

    @PutMapping("/{id}")
    public void updateIngredient(@PathVariable Long id, @RequestBody Ingredient updatedIngredient) {
        ingredientService.updateIngredient(id, updatedIngredient);
    }

    @GetMapping("/{id}/recipes")
    public Set<Recipe> getRecipes(@PathVariable Long id) {
        return ingredientService.getRecipes(id);
    }
}
