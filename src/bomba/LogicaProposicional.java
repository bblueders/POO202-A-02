package bomba;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class LogicaProposicional extends JPanel {

	/**
	 * Create the panel.
	 */
	public LogicaProposicional() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qual das frases abaixo pode ser considerada a nega\u00E7\u00E3o de");
		lblNewLabel.setBounds(29, 24, 288, 23);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\"Se como comida boa, ent\u00E3o fico feliz\"?");
		lblNewLabel_1.setBounds(29, 45, 288, 14);
		add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Como comida boa e fico feliz.");
		rdbtnNewRadioButton.setBounds(29, 77, 188, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("N\u00E3o como comida boa e n\u00E3o fico feliz.");
		rdbtnNewRadioButton_1.setBounds(29, 103, 205, 23);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Se n\u00E3o como omida boa, n\u00E3o fico feliz.");
		rdbtnNewRadioButton_2.setBounds(29, 129, 254, 23);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Como comida boa e n\u00E3o fico feliz.");
		rdbtnNewRadioButton_3.setBounds(29, 155, 242, 23);
		add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Se n\u00E3o fico feliz, ent\u00E3o como comida boa.");
		rdbtnNewRadioButton_4.setBounds(29, 180, 254, 23);
		add(rdbtnNewRadioButton_4);

	}
}
