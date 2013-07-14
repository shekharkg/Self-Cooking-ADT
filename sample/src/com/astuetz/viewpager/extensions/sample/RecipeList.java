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
	private static String[] ingredients = {
		"<html><body><div><ol><li>2-3 potatoes</li><li>2 onions</li> <li>2 tbsp chilli powder</li><li>1 tbsp salt or as desired</li><li>1-2 tbsp tomato sauce</li></ol></div></body></html>",
		"<html><body><div><ol><li>2 bowl Moori or puffed rice</li><li>1 onion chopped</li><li>1 boil potato</li><li>2 green chillies thinly chopped</li><li>1 tbsp tomato ketchup</li><li>2 carrot thinly chopped</li><li>Salt to taste</li><li>2 tbsp mustard oil</li><li>Some peanuts</li> </ol></div></body></html>",
		"<html><body><div><ol><li>2 Eggs</li><li>2 cup water</li> </ol></div></body></html>",
		"<html><body><div><ol><li>1 cup rice</li><li>2 cup water</li><li>2 chopped onions</li><li>2 tomatoes chopped</li><li>2 green chilli chopped</li><li>1 carrot chopped</li><li>2 tbsp chilli powder</li><li>1/2 tbsp turmeric powder</li><li>1 tbsp salt to taste</li><li>1 tbsp lemon juice</li><li>A pinch of cumin seeds</li> </ol></div></body></html>",
		"<html><body><div><ol><li>2 tbsp coffee</li><li>3-4 tbsp milk powder</li><li>4 tbsp sugar</li><li>2 cup water</li> </ol></div></body></html>",
		"<html><body><div><ol><li>2-3 potatoes</li><li>Oil for deep frying</li><li>Salt for sprinkling</li><li>Chilli powder(optional)</li><li>Tomato ketchup</li> </ol></div></body></html>",
		"<html><body><div><ol><li>1/2 litre Amul tazza milk</li><li>1 bowl rice</li><li>1 bowl sugar</li><li>10 finely chopped almonds</li><li>2 piece elaichi(optional)</li> </ol></div></body></html>",
		"<html><body><div><ol><li>2 pack maggi noodles</li><li>2 cup water</li> </ol></div></body></html>",
		"<html><body><div><ol><li>1 pack noodles</li><li>1 onion chopped</li><li>2 tomatoes chopped</li><li>1 carrot chopped</li><li>2 green chillies chopped</li><li>A pinch of cumin seeds</li><li>1 tbsp butter/oil</li><li>1 tbsp lemon juice(optional)</li> </ol></div></body></html>",
		"<html><body><div><ol><li>2-3 tbsp oats</li><li>1 cup water</li><li>1 tbsp milk powder</li><li>1/2 tbsp sugar</li><li>1-2 piece biscuit preferably Marigold biscuit</li> </ol></div></body></html>",
		"<html><body><div><ol><li>2 potatoes</li><li>1/2 cabbage thinly chopped</li><li>1 onion thinly chopped</li><li>A pinch of black pepper</li><li>1/2 tbsp turmeric powder</li><li>1/2 tbsp dhania powder</li><li>1 tbsp chilli powder</li><li>1-2 tbsp salt to taste</li><li>Oil for deep frying</li><li>2-3 tbsp wheat flour/gram flour</li><li>2tbsp tomato ketchup</li> </ol></div></body></html>",
		"<html><body><div><ol><li>1 pack pasta</li><li>1 onion chopped</li><li>2 tomatoes chopped</li><li>1 carrot chopped</li><li>2 green chillies chopped</li><li>A pinch of cumin seeds</li><li>1 tbsp butter/oil</li><li>1 tbsp lemon juice(optional)</li> </ol></div></body></html>",
		"<html><body><div><ol><li>2 cup Pohe (Flaked, beaten rice)</li><li>1 small onion</li><li>1 potato</li><li>1 tomato</li><li>3-4 green chillies</li><li>1 teaspoon lemon juice</li><li>2-3 teaspoon sugar</li><li>salt to taste</li><li>1 tbsp oil</li><li>2 teaspoon mustard seeds</li><li>1 teaspoon asafoetida</li><li>2 teaspoon turmeric powder</li> </ol></div></body></html>",
		"<html><body><div><ol><li>1 pack of ACTSII popcorn or any other available in the market</li><li>A pinch of salt to taste</li> </ol></div></body></html>",
		"<html><body><div><ol><li>1 cup rice</li><li>2 cup water</li> </ol></div></body></html>",
		"<html><body><div><ol><li>1 pack bread</li><li>2-3 potatoes</li><li>2 onions chopped</li><li>2 tomatoes chopped</li><li>2 green chilli chopped</li><li>1 tbsp salt or as desired</li><li>2 tbsp chill powder</li><li>1/2 tbsp turmeric powder</li><li>1 tbsp butter</li><li>A pinch of black pepper,optional</li> </ol></div></body></html>",
		"<html><body><div><ol><li>4-5 tomatoes</li><li>1 onion chopped</li><li>4 cloves garlic crushed</li><li>1 tbsp butter/ghee</li><li>A pinch of black pepper</li><li>2 green chillies chopped</li><li>Salt to taste</li> </ol></div></body></html>",
		"<html><body><div><ol><li>2 cup water</li><li>2-3 tbsp milk powder</li><li>2 tbsp sugar</li><li>1 tbsp tea</li> </ol></div></body></html>"
	};
	
	private static String[] stepsFollowed = {
		"<html><body><div><ol><li>Add water to the Electric kettle and switch on it to boil.</li><li>After 2 minutes add potatoes and allowed it to boil for approx 5 minutes.</li><li>Check it again and allowed it to boil for 5 more minutes.</li><li>By the time chop the onions.</li><li>Take out the boiled potatoes from the kettle and allowed it to cool.</li><li>Peel the skin of the potatoes and mash it up with your hands.</li><li>Add the left out ingredients and mix it well.</li><li>Your Aloo Mash is ready to eat with boiled rice or as suitable.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Boil water in the kettle for 2 minutes.</li><li>Add potato to the boiling water.</li><li>Close the lid and boil it for 5 minutes.</li><li>Take out the boiled potato,peel and mash it up and mix the remaining vegetables with the tomato ketchup.</li><li>Add mustard oil and the vegetable mixture to the bowl of moori/puffed rice.</li><li>Mix it properly.</li><li>Add the peanuts.</li><li>Spicy Bhelmoori is ready to eat.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Add water to the kettle and switch on the kettle.</li><li>Boil it for 2 minutes.</li><li>Add two eggs at a time to boil in the kettle.</li><li>Allow it to boil for 5 minutes.</li><li>Boiled Egg is ready to eat.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Boil water in the electric kettle for two minutes.</li><li>Add rice to the kettle.</li><li>Close the lid of the kettle.</li><li>Allow it to boil for 2 minutes.</li><li>Open the lid and stir in between to prevent sticking.</li><li>Rice is ready.</li><li>Add butter/ghee in a sauce pan and put it in the induction.</li><li>As soon as it is heated up add cumin seeds and green chilli.</li><li>Add chopped onions,tomatoes and carrots.</li><li>Reduce the temerature of the induction.</li><li>Stir the mixture and add chilli powder,turmeric powder and salt to taste.</li><li>After 2 minutes add the boiled rice.</li><li>Stir properly and add lemon juice(optional).</li><li>Your Biryani is ready.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Boil water in the electric kettle as required.</li><li>Add coffee,milk powder,sugar in a cup and then add little amount of water.</li><li>Stir it till the sugar melts and the color of coffee changes.</li><li>Add boiled water and stir it well.</li><li>Your coffee is ready.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Place a heavy bottomed saucepan in the induction and add oil in it.</li><li>Heat the oil setting the suitable temperature mentioned in the induction.</li><li>Chopped the potatoes in a circular manner and wash with water and dried it up.</li><li>Add the chopped potatoes for deep frying.</li><li>Use a big sieve type spoon to bring out the fried potatoes when they attain brownish color.</li><li>Use napkin to oak extra oil.</li><li>Sprinkle salt and chilli powder to taste.</li><li>Chips are ready to eat with tomato ketchup.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Add water to the bowl of rice and keep it for sometime.</li><li>Place a heavy bottomed saucepan in the induction and add milk for boiling.</li><li>Boil the milk until it reduces to half.</li><li>Boil rice in the electric kettle with the required measurement of water.</li><li>Mix the cooked rice to the milk place in the induction.</li><li>Stir properly.</li><li>Add sugar and almonds.</li><li>Stir until the mixture attains a thick sticky consistency.</li><li>Add elaichi(optional)</li><li>Your sweet dish is ready.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Add water to the kettle. </li><li>Boil for 2 minutes.</li><li>Add maggi noodles and stir.</li><li>Add Maggi tastemaker which comes with its packet.</li><li>Stir for few seconds and close the lid of the kettle.</li><li>Boil it for 1-2 minutes</li><li>The maggie is ready to eat.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Boil water in the electric kettle for two minutes.</li><li>Add noodles to the kettle.</li><li>Close the lid of the kettle.</li><li>Allow it to boil for 2 minutes.</li><li>Open the lid and stir in between to prevent sticking.</li><li>Noodles are boiled.</li><li>Add butter/ghee in a sauce pan and place it in the induction.</li><li>As soon as it is heated up add cumin seeds and green chilli.</li><li>Add chopped onions,tomatoes and carrots.</li><li>Reduce the temerature of the induction.</li><li>Stir the mixture and add chilli powder,turmeric powder and salt to taste.</li><li>After 2 minutes add the boiled noodles.</li><li>Increase the temperature of the induction if necessary.</li><li>Stir properly and add lemon juice(optional).</li><li>Your noodles are ready.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Boil water in the kettle or in the induction for two minutes.</li><li>Add the amount of oats,sugar,milk powder in a bowl.</li><li>Add the boiling water slowly and simultaneously stir the mixture.</li><li>Add the biscuits in the mixture.</li><li>Stir it properly.</li><li>Delicious Oats are ready to eat.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Mix all the ingredients in a bowl properly except oil.</li><li>Place a heavy bottomed saucepan in the induction and add oil to it.</li><li>Heat it at the required temperature.</li><li>Put small amount of mixture giving it a shape from your hands in the heated oil.</li><li>Fry it until it attains brownish color.</li><li>Follow the same procedure for the whole mixture.</li><li>Spicy Pakoras are ready to eat with tomato ketchup.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Boil water in the electric kettle for two minutes.</li><li>Add pasta to the kettle.</li><li>Close the lid of the kettle.</li><li>Allow it to boil for 2 minutes.</li><li>Open the lid and stir in between to prevent sticking.</li><li>Pasta is boiled.</li><li>Add butter/oil in a sauce pan and put it in the induction.</li><li>As soon as it is heated up add cumin seeds and green chilli.</li><li>Add chopped onions,tomatoes and carrots.</li><li>Reduce the temerature of the induction.</li><li>Stir the mixture and add chilli powder and salt to taste.</li><li>After 2 minutes add the boiled pasta.</li><li>Increase the temperature of the induction as suitable.</li><li>Stir properly and add lemon juice(optional).</li><li>Your Pasta is ready.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Soak Pohe in water. Drain water and keep it aside for 10 to 15 minutes.</li><li>Now rub some salt, sugar and lemon juice to it.</li><li>Chop green chillies, onion,potatoes,tomatoes.</li><li>Place a sauce pan in the induction and heat oil in a pan.</li><li> Add mustard seeds. When they splutter, add asafoetida,turmeric powder, onion pieces, potato pieces and green chillies.</li><li>Reduce the temperature of the induction as necessary.</li><li>Mix properly and when potatoes turn tender, add pohe and stir.</li><li>Cover and cook for sometime. Remove the lid, stir and again allow it to cook for 2 minutes.</li><li>Pohe is ready to eat.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Add the mixture contained in the popcorn packet to the electric kettle.</li><li>Switch on the electric kettle and stir the mixture for 1/2 minute.</li><li>Close the lid of the kettle.</li><li>After 1-2 minutes open the lid.</li><li>Add salt to taste.</li><li>Your popcorn is ready</li></ol></div></body></html>",
		"<html><body><div><ol><li>Boil water in the electric kettle for two minutes.</li><li>Add rice to the kettle.</li><li>Close the lid of the kettle.</li><li>Allow it to boil for 2 minutes.</li><li>Open the lid and stir in between to prevent sticking.</li><li>Rice is ready to eat</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Add water to the Electric kettle and switch it on to boil.</li><li>After 2 minutes add potatoes and allowed it to boil for approx 5 minutes.</li><li>Check it again and allowed it to boil for 5 more minutes.</li><li>Take out the boiled potatoes from the kettle and allowed it to cool.</li><li>Separate the covering of the potatoes and mash it up with your hands.</li><li>Add the left out ingredients and mix it well.</li><li>Add butter to one side of bread.</li><li>Spread the aloo mash to that side of the bread</li><li>Another piece of bread with butter is added so the aloo mash remains in between.</li><li>Just like this apply the aloo mash to each pair of bread.</li><li>Sanwiches are ready to eat.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Boil the tomatoes in the electric kettle for 5-10 minutes.</li><li>Peel and mash the boiled tomatoes.</li><li>Place a saucepan in the induction with the required temperature.</li><li>Add butter/ghee in the pan and after a few seconds add green chillies,garlic and onion.</li><li>Stir it well for 1 minute.</li><li>Reduce the temperature of the induction and add the puree of mashed tomatoes.</li><li>Stir properly.</li><li>Increase the temperature if required.</li><li>Cook it for 5-10 minutes in the induction.</li><li>Your soup is ready to eat.</li> </ol></div></body></html>",
		"<html><body><div><ol><li>Boil water in the electric kettle for one minute.</li><li>Add milk powder in the kettle and stir it.</li><li>Boil it for another 1 minute.</li><li>Add augar and tea.</li><li>Close the lid of the kettle and boil it for 1 minute.</li><li>Strain the tea through the sieve.</li><li>Your tea is ready.</li> </ol></div></body></html>"
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
	public static String[] getIngredients() {
		return ingredients;
	}
	public static void setIngredients(String[] ingredients) {
		RecipeList.ingredients = ingredients;
	}
	public static String[] getStepsFollowed() {
		return stepsFollowed;
	}
	public static void setStepsFollowed(String[] stepsFollowed) {
		RecipeList.stepsFollowed = stepsFollowed;
	}
	public static String getsetIngredientsByIndex(int index) {
		return ingredients[index];
	}
	public static String getsetStepsFollowedByIndex(int index ){
		return stepsFollowed[index];
	}
}