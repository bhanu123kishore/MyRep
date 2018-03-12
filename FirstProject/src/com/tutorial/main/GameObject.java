package com.tutorial.main;

import java.awt.Graphics;

public abstract class GameObject {
	
	protected int x, y;
	protected ID id;
	protected int velX,velY;
	
	public GameObject(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public ID getID() {
		return id;
	}
	
	public int getvelX() {
		return velX;
	}
	
	public int getvelY() {
		return velY;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setID(ID id) {
		this.id = id;
	}
	
	public void setvelX(int velX) {
		this.velX = velX;
	}
	
	public void setvelY(int velY) {
		this.velY = velY;
	}
	
}
