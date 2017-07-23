package ex14e5;
import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("GridLayoutDemo");
		frame.setLayout(new GridLayout(3, 2));
		for (int i = 1; i <= 8; i++) {
			frame.add(new JButton("Button" + i));
		}
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
