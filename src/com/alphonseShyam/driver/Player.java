package com.alphonseShyam.driver;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{

	public Player(int x, int y, ID id) {
		super(x, y, id);
		
		this.setX(x);
		this.setY(y);

		
	}

	public void tick() {
		velX = 1;
		velY = 1;
		x += velX;
		y += velY;
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, 32, 32);
	}

}
