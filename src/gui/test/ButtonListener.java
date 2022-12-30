package gui.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonListener implements ActionListener {
	JButton btn1, btn2;
	JLabel lbl;
	
	
	
	public ButtonListener(JButton btn1, JButton btn2, JLabel lbl) {
		super();
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.lbl = lbl;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ImageIcon icon = null;
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
