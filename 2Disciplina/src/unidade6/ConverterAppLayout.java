package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConverterAppLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Celsius Converter");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		cont.setLayout(new GridLayout(2,2)); //duas linhas por duas colunas
		//cont.setLayout(new FlowLayout());
		//cont.setLayout(new BorderLayout());
		
		
		

		cont.add(new JTextField("0"));
		cont.add(new JLabel("Celsius"));
		cont.add(new JButton("Convert"));
		cont.add(new JLabel("32 Fahrenheit"));

		frame.setVisible(true);

		
	}

}
