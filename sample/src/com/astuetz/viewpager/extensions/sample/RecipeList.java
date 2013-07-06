package com.astuetz.viewpager.extensions.sample;

import java.util.HashMap;
import java.util.Map;

public class RecipeList {
	
	private static int color = 0xFF666666;
	
	private static String[] knowMoreLink = {
		"http://en.m.wikipedia.org/wiki/Mashed_potato",
		"http://en.m.wikipedia.org/wiki/Bhelpuri",
		"https://en.m.wikipedia.org/wiki/Boiled_egg",
		"http://en.m.wikipedia.org/wiki/Biryani",
		"https://en.m.wikipedia.org/wiki/Coffee",
		"https://en.m.wikipedia.org/wiki/Potato_chip",
		"https://en.m.wikipedia.org/wiki/Kheer",
		"http://en.m.wikipedia.org/wiki/Maggi_noodles",
		"http://en.m.wikipedia.org/wiki/Noodles",
		"http://en.m.wikipedia.org/wiki/Oats",
		"http://en.m.wikipedia.org/wiki/Pakora",
		"http://en.m.wikipedia.org/wiki/Pasta",
		"http://en.m.wikipedia.org/wiki/Flattened_rice",
		"http://en.m.wikipedia.org/wiki/Popcorn",
		"https://en.m.wikipedia.org/wiki/Rice",
		"http://en.m.wikipedia.org/wiki/Sandwich",
		"http://en.m.wikipedia.org/wiki/Soup",
		"http://en.m.wikipedia.org/wiki/Tea"
	};

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
	
	public static int getColor() {
		return color;
	}

	public static void setColor(int color) {
		RecipeList.color = color;
	}

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

	public static String[] getKnowMoreLink() {
		return knowMoreLink;
	}

	public static void setKnowMoreLink(String[] knowMoreLink) {
		RecipeList.knowMoreLink = knowMoreLink;
	}
	public static String getsetKnowMoreLinkByIndex(int index) {
		return knowMoreLink[index];
	}
}