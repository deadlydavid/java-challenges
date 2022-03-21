package it.dionis.challenges;

import java.util.Arrays;

/**
Create a function that takes an array of numbers and return "Boom!" if the 
digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

taken from https://edabit.com/challenge/CKqfEowjmSTw2jsso
*/
public abstract class SevenBoom {

    public static String sevenBoom(int... integers) {
	return (containsSeven(integers) ? "Boom!"
		                        : "there is no 7 in the array");
    }

    public static boolean containsSeven(int... integers) {
	return Arrays.stream(integers)
	             .anyMatch(x -> ((Integer)x).toString().contains("7"));
    }

}
