package bomba;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RaciocinioLogico2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public RaciocinioLogico2() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("I. Se eu estudar, ent\u00E3o n\u00E3o sou reprovado.");
		lblNewLabel.setBounds(29, 29, 226, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("II. Ou eu jogo, ou eu estudo.");
		lblNewLabel_1.setBounds(29, 47, 226, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("III. Eu fui reprovado.");
		lblNewLabel_2.setBounds(29, 65, 193, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Analisando as afirma\u00E7\u00F5es, \u00E9 poss\u00EDvel concluir que:");
		lblNewLabel_3.setBounds(29, 90, 251, 14);
		add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Eu joguei.");
		rdbtnNewRadioButton.setBounds(20, 111, 109, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Eu estudei.");
		rdbtnNewRadioButton_1.setBounds(20, 137, 109, 23);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Eu estudei e tamb\u00E9m joguei.");
		rdbtnNewRadioButton_2.setBounds(20, 163, 235, 23);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Eu nem estudei e nem joguei.");
		rdbtnNewRadioButton_3.setBounds(20, 189, 235, 23);
		add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Eu estudei, mas n\u00E3o joguei.");
		rdbtnNewRadioButton_4.setBounds(20, 215, 202, 23);
		add(rdbtnNewRadioButton_4);

	}

}
