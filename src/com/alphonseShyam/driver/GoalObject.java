package com.alphonseShyam.driver;

import java.awt.Color;
import java.awt.Graphics;

public class GoalObject extends GameObject{

	public GoalObject(int x, int y, ID id) {
		super(x, y, id);
		
//		velX = 1;
//		velY = 1;
	}

	public void tick() {
		
		x = velX;
		y = velY;
	}

	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, 50, 50);
	}

}
