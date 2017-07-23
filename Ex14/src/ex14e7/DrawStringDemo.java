package ex14e7;

import java.awt.*;
import javax.swing.*;

public class DrawStringDemo extends JFrame {
	private class MyPanel extends JPanel { // 成员内部类
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(new Color(0, 0, 255));
			g.setFont(new Font("Courier New", Font.BOLD + Font.ITALIC, 24));
			g.drawString("Welcome to Java", 50, 50);
		}
	}

	MyPanel mp = new MyPanel();

	public DrawStringDemo() {
		this("No Title");
	}

	public DrawStringDemo(String title) {
		super(title);
		add(mp, BorderLayout.CENTER);
		setSize(300, 150);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new DrawStringDemo("DrawString");
	}
}
