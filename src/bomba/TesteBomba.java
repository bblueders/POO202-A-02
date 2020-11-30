package bomba;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TesteBomba  {

	private JPanel contentPane;

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meu primeiro frame em Java");
        frame.setSize(500,500);
        frame.setVisible(true);
		
		LogicaPredicados painel = new LogicaPredicados();
		frame.add(painel);

		
	}

}
