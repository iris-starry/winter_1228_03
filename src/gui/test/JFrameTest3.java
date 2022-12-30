package gui.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameTest3 extends JFrame implements ActionListener{
	ImageIcon icon = new ImageIcon("image/list02.png");
	JLabel lbl = new JLabel(icon, JLabel.CENTER);
	JButton btn1 = new JButton("Ive");
	JButton btn2 = new JButton("Black Pink");
	JButton btn3 = new JButton("New Jeans");
	public JFrameTest3() {
		JPanel pan = new JPanel();
		
		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		add(pan, "North");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		add(lbl);
		setTitle("JFrame 상속 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLocation(200,200);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameTest3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object btnSource =  e.getSource();
		if(btnSource == btn1) {
			icon = new ImageIcon("image/list02.png");
		}else if(btnSource == btn2) {
			icon = new ImageIcon("image/bt_fill_in_back.png");
		}else {
			icon = new ImageIcon("image/bt_memo.png");
		}
		lbl.setIcon(icon);
	}

}
