package ex14e8;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ActionEventDemo {
	JLabel jLabel = new JLabel("Please Click the Button.", SwingConstants.CENTER);
	JButton btn1 = new JButton("OK"),
			btn2 = new JButton("Cancel");
	JPanel jp = new JPanel();
	public ActionEventDemo() {
		JFrame frame = new JFrame("ActionEvent Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(jLabel, BorderLayout.CENTER);
		jp.add(btn1);
		jp.add(btn2);
		frame.add(jp, BorderLayout.PAGE_END);
		ButtonClickListener listener = new ButtonClickListener();
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		frame.setSize(300, 100);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	public class ButtonClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if ((JButton)e.getSource() == btn1) {
				jLabel.setText("你单击了OK按钮");
			}else if ((JButton)e.getSource() == btn2) {
				jLabel.setText("你单击了Cancel按钮");
			}
		}
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ActionEventDemo();
			}
		});
	}
}
