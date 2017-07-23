package ex14e4;
import java.awt.*;
import javax.swing.*;
public class BorderLayoutDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("BorderLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jButton1 = new JButton("��"),
				jButton2 = new JButton("��"),
				jButton3 = new JButton("��"),
				jButton4 = new JButton("��");
		JTextField jTextField = new JTextField("��");
		frame.setLayout(new BorderLayout(10,10));//���ò��ֹ�����
		frame.add(jButton1, BorderLayout.PAGE_START);
		frame.add(jButton2, BorderLayout.PAGE_END);
		frame.add(jButton3, BorderLayout.LINE_START);
		frame.add(jButton4, BorderLayout.LINE_END);
		frame.add(jTextField, BorderLayout.CENTER);
		
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
