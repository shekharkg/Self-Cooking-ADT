package com.astuetz.viewpager.extensions.sample;

import java.util.HashMap;
import java.util.Map;

public class RecipeList {
	private static String[] recipeName = {
			"Aloo Mash",
			"Bhelmoori",
			"Boilegg",
			"Biryani",
			"Coffee",
			"Chips",
			"Kheer",
			"Maggi",
			"Noodles",
			"Oats",
			"Pakora",
			"Pasta",
			"Pohe",
			"Popcorn",
			"Rice",
			"Sandwich",
			"Soup",
			"Tea"
		};
	private static Integer[] recipeImage = {
				R.drawable.aloo,
				R.drawable.bhel,
				R.drawable.egg,
				R.drawable.biryani,
				R.drawable.coffee,
				R.drawable.chips,
				R.drawable.kheer,
				R.drawable.maggi,
				R.drawable.noodles,
				R.drawable.oats,
				R.drawable.pakora,			
				R.drawable.pasta,
				R.drawable.chidwa,
				R.drawable.popcorn,
				R.drawable.rice,
				R.drawable.sandwich,
				R.drawable.soup,
				R.drawable.tea
				};
	
	public static Map<String, Integer> getRecipeDetails(int index) {
		Map<String, Integer> recipe = new HashMap<String, Integer>();
		recipe.put(recipeName[index], recipeImage[index]);
		return recipe;
	}

	public static String[] getRecipeName() {
		return recipeName;
	}

	public static void setRecipeName(String[] recipeName) {
		RecipeList.recipeName = recipeName;
	}

	public static Integer[] getRecipeImage() {
		return recipeImage;
	}

	public static void setRecipeImage(Integer[] recipeImage) {
		RecipeList.recipeImage = recipeImage;
	}
	
	public static String getRecipeNameByIndex(int index) {
		return recipeName[index];
	}
	
	public static Integer getRecipeImageByIndex(int index) {
		return recipeImage[index];
	}

}
