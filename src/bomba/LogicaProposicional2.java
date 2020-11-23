package bomba;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class LogicaProposicional2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public LogicaProposicional2() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u03B1: O n\u00FAmero 9 \u00E9 primo.");
		lblNewLabel.setBounds(25, 12, 167, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u03B2: O n\u00FAmero 170 \u00E9 par.");
		lblNewLabel_1.setBounds(25, 26, 154, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Considerando a proposi\u00E7\u00E3o \u03B1 como falsa e a proposi\u00E7\u00E3o \u03B2 como");
		lblNewLabel_2.setBounds(24, 51, 316, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("verdadeira, analise as afirma\u00E7\u00F5es:");
		lblNewLabel_3.setBounds(25, 65, 300, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("I. p \u2227 q \u00E9 falso.");
		lblNewLabel_4.setBounds(25, 90, 99, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("II. p \u2228 q \u00E9 verdadeiro.");
		lblNewLabel_5.setBounds(25, 109, 230, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("III. ~p \u2227 q \u00E9 verdadeiro.");
		lblNewLabel_6.setBounds(24, 128, 184, 14);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("IV. ~p \u2228 ~q \u00E9 falso.");
		lblNewLabel_7.setBounds(25, 147, 241, 14);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("A afirma\u00E7\u00E3o correta \u00E9:");
		lblNewLabel_8.setBounds(25, 172, 167, 14);
		add(lblNewLabel_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("I e II.");
		rdbtnNewRadioButton.setBounds(25, 192, 109, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("I, II e III.");
		rdbtnNewRadioButton_1.setBounds(25, 218, 109, 23);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("III e IV.");
		rdbtnNewRadioButton_2.setBounds(192, 192, 109, 23);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("II, III e IV.");
		rdbtnNewRadioButton_3.setBounds(192, 218, 109, 23);
		add(rdbtnNewRadioButton_3);

	}

}
