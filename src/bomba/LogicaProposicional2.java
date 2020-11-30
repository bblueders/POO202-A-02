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

public class LogicaProposicional2 extends Enigma {

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
		rdbtnNewRadioButton_2.setBounds(136, 193, 89, 23);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("II, III e IV.");
		rdbtnNewRadioButton_3.setBounds(136, 218, 89, 23);
		add(rdbtnNewRadioButton_3);
		
		JLabel LabelArmed = new JLabel("Armado");
		LabelArmed.setForeground(Color.RED);
		LabelArmed.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelArmed.setBounds(212, 11, 48, 15);
		add(LabelArmed);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		group.add(rdbtnNewRadioButton_3);
		
		JLabel LabelDesarmed = new JLabel("Desarmado");
		LabelDesarmed.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelDesarmed.setForeground(new Color(50, 205, 50));
		LabelDesarmed.setBounds(258, 12, 82, 14);
		LabelDesarmed.setVisible(false);
		add(LabelDesarmed);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBounds(235, 216, 89, 23);
		add(btnNewButton);
		
		JLabel tryAgain = new JLabel("Tente novamente!");
		tryAgain.setForeground(new Color(65, 105, 225));
		tryAgain.setBounds(235, 196, 90, 14);
		add(tryAgain);
		tryAgain.setVisible(false);
		
		rdbtnNewRadioButton.addActionListener(null);
		rdbtnNewRadioButton_1.addActionListener(null);
		rdbtnNewRadioButton_2.addActionListener(null);
		rdbtnNewRadioButton_3.addActionListener(null);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tryAgain.setVisible(true);
				respostaErrada++;
				if(rdbtnNewRadioButton_1.isSelected()) {
					LabelArmed.setVisible(false);
					LabelDesarmed.setVisible(true);
					lblNewLabel.setEnabled(false);
					lblNewLabel_1.setEnabled(false);
					lblNewLabel_2.setEnabled(false);
					lblNewLabel_3.setEnabled(false);
					lblNewLabel_4.setEnabled(false);
					lblNewLabel_5.setEnabled(false);
					lblNewLabel_6.setEnabled(false);
					lblNewLabel_7.setEnabled(false);
					lblNewLabel_8.setEnabled(false);
					rdbtnNewRadioButton.setEnabled(false);
					rdbtnNewRadioButton_1.setEnabled(false);
					rdbtnNewRadioButton_2.setEnabled(false);
					rdbtnNewRadioButton_3.setEnabled(false);
					btnNewButton.setEnabled(false);
					tryAgain.setVisible(false);
					desarmed = true;
					respostaCorreta++;
				}
				if(rdbtnNewRadioButton.isSelected()) {
					tryAgain.setVisible(true);
					respostaErrada++;
				}
				if(rdbtnNewRadioButton_2.isSelected()) {
					tryAgain.setVisible(true);
					respostaErrada++;
				}
				if(rdbtnNewRadioButton_3.isSelected()) {
					tryAgain.setVisible(true);
					respostaErrada++;
				}
				
			}
		});

	}

}
