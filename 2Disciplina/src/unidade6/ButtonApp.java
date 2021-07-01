package unidade6;

import java.awt.Container;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class ButtonApp {
	
	public static UIManager.LookAndFeelInfo looks[];
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Aplicação");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(new JButton("Isto é um botão!"));
		
		//Look and Feel
		looks = UIManager.getInstalledLookAndFeels();
		try{
			UIManager.setLookAndFeel(looks[0].getClassName());			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		frame.setVisible(true);
	}

}
