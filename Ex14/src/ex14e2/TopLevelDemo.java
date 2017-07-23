package ex14e2;
import java.awt.*;
import javax.swing.*;
public class TopLevelDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TopLevelDemo");
		//创建一个菜单栏对象并设置有关属性
		JMenuBar greenMenuBar = new JMenuBar();
		greenMenuBar.setOpaque(true);
		greenMenuBar.setBackground(new Color(154, 165, 127));
		greenMenuBar.setPreferredSize(new Dimension(300, 20));
		
		JLabel yellowLabel = new JLabel();
		yellowLabel.setOpaque(true);
		yellowLabel.setBackground(new Color(248, 213, 131));
		yellowLabel.setPreferredSize(new Dimension(500, 180));
		
		frame.setJMenuBar(greenMenuBar);
		frame.add(yellowLabel, BorderLayout.CENTER);
		frame.setSize(300, 130);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
