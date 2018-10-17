package com.game.main;

import java.util.ArrayList;

public class MainTest {
	
	public static final int GS = 9;
	
	public static void main (String[] args) {
	
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>(GS);
		
		BruteForce bf = new BruteForce(list,GS);
		
		bf.searchAlgorithm();
	}
}