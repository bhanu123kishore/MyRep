package com.game.main;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameInput extends Canvas {
	
	private static final long serialVersionUID = 6333059982291593793L;

	public GameInput(int width, int height, String title, int GS) {
		
		JFrame frame = new JFrame(title);
		frame.setSize(width,height);
		
		GridLayout layout = new GridLayout(GS,GS);
		layout.setHgap(10);
		layout.setVgap(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(100, 100, 300, 300);
		
		JTextField tf[][] = new JTextField[GS][GS];
		
		for (int i=0;i<GS;i++) {
			for (int j=0;j<GS;j++) {
				tf[i][j] = new JTextField();
				tf[i][j].setBounds((i+1)*20,(j+1)*20,10,10);
				panel.add(tf[i][j]);
			}
		}
		
		panel.setLayout(layout);
		
		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
