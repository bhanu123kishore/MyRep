package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject {

	public Random r=new Random();
	
	public Player(int x, int y, ID id) {
		super(x, y, id);
		
		velX=r.nextInt(5);
		velY=r.nextInt(5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x+=velX;
		y+=velY;
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 30, 30);
		
		// TODO Auto-generated method stub
		
	}
	
	
}
