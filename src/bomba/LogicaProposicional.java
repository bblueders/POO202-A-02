package bomba;

import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class LogicaProposicional extends Enigma {

	private boolean desarmed;
	private int respostaCorreta;
	private int respostaErrada;
	
	
	public boolean isDesarmed() {
		return desarmed;
	}



	public void setDesarmed(boolean desarmed) {
		this.desarmed = desarmed;
	}



	public int getRespostaCorreta() {
		return respostaCorreta;
	}



	public void setRespostaCorreta(int respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}



	public int getRespostaErrada() {
		return respostaErrada;
	}



	public void setRespostaErrada(int respostaErrada) {
		this.respostaErrada = respostaErrada;
	}



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
		
		JLabel LabelArmed = new JLabel("Armado");
		LabelArmed.setForeground(Color.RED);
		LabelArmed.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelArmed.setBounds(201, 11, 48, 15);
		add(LabelArmed);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		group.add(rdbtnNewRadioButton_3);
		group.add(rdbtnNewRadioButton_4);
		
		JLabel LabelDesarmed = new JLabel("Desarmado");
		LabelDesarmed.setForeground(new Color(50, 205, 50));
		LabelDesarmed.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelDesarmed.setBounds(259, 12, 81, 14);
		LabelDesarmed.setVisible(false);
		add(LabelDesarmed);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBounds(228, 216, 89, 23);
		add(btnNewButton);
		
		JLabel tryAgain = new JLabel("Tente novamente!");
		tryAgain.setForeground(new Color(65, 105, 225));
		tryAgain.setBounds(121, 220, 96, 14);
		add(tryAgain);
		tryAgain.setVisible(false);
		
		rdbtnNewRadioButton.addActionListener(null);
		rdbtnNewRadioButton_1.addActionListener(null);
		rdbtnNewRadioButton_2.addActionListener(null);
		rdbtnNewRadioButton_3.addActionListener(null);
		rdbtnNewRadioButton_4.addActionListener(null);
		
		//Radio Buttons
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tryAgain.setVisible(true);
				respostaErrada++;
				if(rdbtnNewRadioButton_3.isSelected()) {
					LabelArmed.setVisible(false);
					LabelDesarmed.setVisible(true);
					lblNewLabel.setEnabled(false);
					lblNewLabel_1.setEnabled(false);
					rdbtnNewRadioButton.setEnabled(false);
					rdbtnNewRadioButton_1.setEnabled(false);
					rdbtnNewRadioButton_2.setEnabled(false);
					rdbtnNewRadioButton_3.setEnabled(false);
					rdbtnNewRadioButton_4.setEnabled(false);
					btnNewButton.setEnabled(false);
					tryAgain.setVisible(false);
					desarmed = true;
					respostaCorreta++;
				}
				if(rdbtnNewRadioButton.isSelected()) {
					tryAgain.setVisible(true);
					respostaErrada++;
				}
				if(rdbtnNewRadioButton_1.isSelected()) {
					tryAgain.setVisible(true);
					respostaErrada++;
				}
				if(rdbtnNewRadioButton_2.isSelected()) {
					tryAgain.setVisible(true);
					respostaErrada++;
				}
				if(rdbtnNewRadioButton_4.isSelected()) {
					tryAgain.setVisible(true);
					respostaErrada++;
				}
			}
		});

	}
}
