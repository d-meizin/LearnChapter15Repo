package com.chapter15;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;

class OdometerPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	long hitCount = 239472938472L;
	
	public void paint(Graphics myGraphics) {
		myGraphics.setFont(new Font("Monospaced", Font.BOLD, 24));
		myGraphics.drawString("Вы - посетитель номер " + 
				Long.toString(hitCount++), 50, 50);
	}
}
