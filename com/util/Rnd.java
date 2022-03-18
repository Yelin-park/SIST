package com.util;

// p503 예제9-29
public class Rnd {
	public static int getRand(int from, int to) { // 5,2 값을 줘도        2,5
		return (int)(Math.random() * (Math.abs(to-from)+1)) + Math.min(from, to);
	} // getRand
	
	public static int[] fillRand(int[] arr, int from, int to) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getRand(from, to);
		}
		return arr;
	} // fillRand
	
} // Rnd
