//package ex14e6;
//import java.awt.*;
//import javax.swing.*;
//public class FrameWithPanel extends JFrame{
//	JPanel panel1 = new JPanel(), panel2 = new JPanel();
//	public static void main(String[] args) {
//		JFrame frame = new JFrame("FrameWithPanel");
//		JPanel panel1 = new JPanel();
//		JPanel panel2 = new JPanel();
//		frame.add(panel1, BorderLayout.CENTER);
//		frame.add(panel2, BorderLayout.PAGE_END);
//		panel2.add(new JButton("红色"));
//		panel2.add(new JButton("绿色"));
//		panel2.add(new JButton("蓝色"));
//		panel2.add(new JButton("黄色"));
//		panel1.setBackground(Color.CYAN);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(300, 150);
//		frame.setLocationRelativeTo(null);
//		frame.setVisible(true);
//	}
//}


package ex14e6;

import java.awt.*;
import javax.swing.*;

public class FrameWithPanel extends JFrame {
	JPanel panel1 = new JPanel(), panel2 = new JPanel();

	public FrameWithPanel(String title) {
		super(title);
		panel1.setBackground(Color.CYAN);
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		panel2.add(new JButton("红色"));
		panel2.add(new JButton("绿色"));
		panel2.add(new JButton("蓝色"));
		panel2.add(new JButton("黄色"));
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.PAGE_END);
		setSize(350, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		JFrame frame = new FrameWithPanel("FrameWithPanel");
	}
}
