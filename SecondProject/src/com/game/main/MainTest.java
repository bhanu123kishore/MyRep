package com.game.main;

public class MainTest {
	
	public static final int WIDTH = 500, HEIGHT = WIDTH;
	
	public static final int GS = 9;
	
	public MainTest() {
		
		new GameInput(WIDTH,HEIGHT,"Sudoku Game", GS);		
		
	}
	
	public static void main (String[] args) {
		
		new MainTest();
	}
	
	
}