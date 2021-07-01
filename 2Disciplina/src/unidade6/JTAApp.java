package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTAApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Aplicação");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		JTextArea ta = new JTextArea("Digite Aqui:");
		cont.add(ta,BorderLayout.NORTH);
		frame.setVisible(true);
	}

}
