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

public class RaciocinioLogico2 extends Enigma {

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
		rdbtnNewRadioButton_3.setBounds(20, 189, 202, 23);
		add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Eu estudei, mas n\u00E3o joguei.");
		rdbtnNewRadioButton_4.setBounds(20, 215, 202, 23);
		add(rdbtnNewRadioButton_4);
		
		JLabel LabelArmed = new JLabel("Armado");
		LabelArmed.setForeground(Color.RED);
		LabelArmed.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelArmed.setBounds(217, 12, 48, 15);
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
		LabelDesarmed.setBounds(262, 12, 78, 14);
		LabelDesarmed.setVisible(false);
		add(LabelDesarmed);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBounds(240, 215, 89, 23);
		add(btnNewButton);
		
		JLabel tryAgain = new JLabel("Tente novamente!");
		tryAgain.setForeground(new Color(65, 105, 225));
		tryAgain.setBounds(240, 193, 100, 14);
		add(tryAgain);
		tryAgain.setVisible(false);
		
		rdbtnNewRadioButton.addActionListener(null);
		rdbtnNewRadioButton_1.addActionListener(null);
		rdbtnNewRadioButton_2.addActionListener(null);
		rdbtnNewRadioButton_3.addActionListener(null);
		rdbtnNewRadioButton_4.addActionListener(null);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tryAgain.setVisible(true);
				respostaErrada++;
				if(rdbtnNewRadioButton.isSelected()) {
					LabelArmed.setVisible(false);
					LabelDesarmed.setVisible(true);
					lblNewLabel.setEnabled(false);
					lblNewLabel_1.setEnabled(false);
					lblNewLabel_2.setEnabled(false);
					lblNewLabel_3.setEnabled(false);
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
				if(rdbtnNewRadioButton_1.isSelected()) {
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
				if(rdbtnNewRadioButton_4.isSelected()) {
					tryAgain.setVisible(true);
					respostaErrada++;
				}
			}
		});

	}

}
