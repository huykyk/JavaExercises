package ex14e1;
import javax.swing.*;
public class HelloWorldSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorldSwing");
		JLabel label = new JLabel("��һ��Swing����", SwingConstants.CENTER);
		frame.setSize(300, 100);
		frame.add(label);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
