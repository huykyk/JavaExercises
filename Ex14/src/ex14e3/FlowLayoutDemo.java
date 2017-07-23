package ex14e3;
import java.awt.*;
import javax.swing.*;
public class FlowLayoutDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("FlowLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//创建一个FlowLayout对象
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 10, 20);
		frame.setLayout(layout);
		frame.add(new JButton("Button 1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("Button 3"));
		frame.add(new JButton("Long-Named Button 4"));
		frame.add(new JButton("Button 5"));
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
