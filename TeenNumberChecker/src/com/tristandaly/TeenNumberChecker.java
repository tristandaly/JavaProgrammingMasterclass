package com.tristandaly;

public class TeenNumberChecker {
	public static boolean hasTeen(int x, int y, int z) {
		return ((x > 12 && x < 20 || y > 12 && y < 20 || z > 12 && z < 20) ? true: false);
	}
	
	public static boolean isTeen(int j) {
		return ((j > 12 && j < 20)? true: false);
	}
}
