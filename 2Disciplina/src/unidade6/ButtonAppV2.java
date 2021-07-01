package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonAppV2 extends JFrame implements ActionListener,WindowListener{

	public static void main(String[] args) {
		ButtonAppV2 frame = new ButtonAppV2();
		frame.setTitle("Button App V2");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		JButton botao = new JButton("Isto é um Botão");
		botao.addActionListener(frame);
		cont.add(botao);
		frame.addWindowListener(frame);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent ev) {
		JOptionPane.showMessageDialog(null,"Encerrando aplicação...");
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
