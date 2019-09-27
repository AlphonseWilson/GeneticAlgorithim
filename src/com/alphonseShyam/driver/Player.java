package com.alphonseShyam.driver;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{

	public Player(int x, int y, ID id) {
		super(x, y, id);
		
		this.setX(x);
		this.setY(y);
		this.setId(id);
		
	}
	public static int Random(int min, int max) {
		int r = (int) (Math.random()*(max-min)+1)+min;
		return r;
	}

	public void tick() {
		velX = 1;
		velY = 1;
		int xr = Random(-11, 10);
		int yr = Random(-11, 10);

		x += xr;
		y += yr;
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, 32, 32);
	}

}
