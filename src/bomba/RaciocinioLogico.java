package bomba;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComponent;

public class RaciocinioLogico extends Enigma{

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



	public RaciocinioLogico() {
	
		
		JLabel lblNewLabel = new JLabel("I.   Todas as cabras s\u00E3o aves.");
		
		JLabel lblNewLabel_1 = new JLabel("II.  Algumas tortas s\u00E3o cabras.");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Todas as tortas s\u00E3o aves");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Cabras comem tortas");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Algumas tortas s\u00E3o aves");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Nenhuma cabra \u00E9 torta");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Todas as aves s\u00E3o cabras");
		
		JLabel lblNewLabel_2 = new JLabel("Qual alternativa est\u00E1 correta?");
		
		JLabel LabelArmed = new JLabel("Armado");
		LabelArmed.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelArmed.setForeground(Color.RED);
		LabelArmed.setVisible(true);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		group.add(rdbtnNewRadioButton_3);
		group.add(rdbtnNewRadioButton_4);
		
		rdbtnNewRadioButton.addActionListener(null);
		rdbtnNewRadioButton_1.addActionListener(null);
		rdbtnNewRadioButton_2.addActionListener(null);
		rdbtnNewRadioButton_3.addActionListener(null);
		rdbtnNewRadioButton_4.addActionListener(null);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(100, 149, 237));
		
		JLabel LabelDesarmed = new JLabel("Desarmado");
		LabelDesarmed.setForeground(new Color(50, 205, 50));
		LabelDesarmed.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelDesarmed.setVisible(false);
		
		JLabel tryAgain = new JLabel("Tente novamente!");
		tryAgain.setForeground(new Color(65, 105, 225));
		tryAgain.setVisible(false);
		
		//Radio Buttons
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tryAgain.setVisible(true);
				respostaErrada++;
				if(rdbtnNewRadioButton_2.isSelected()) {
					LabelArmed.setVisible(false);
					LabelDesarmed.setVisible(true);
					lblNewLabel.setEnabled(false);
					lblNewLabel_1.setEnabled(false);
					lblNewLabel_2.setEnabled(false);
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
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(LabelArmed)
							.addGap(25)
							.addComponent(LabelDesarmed))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton_4)
								.addComponent(lblNewLabel_2)
								.addComponent(rdbtnNewRadioButton)
								.addComponent(rdbtnNewRadioButton_1)
								.addComponent(rdbtnNewRadioButton_2)
								.addComponent(rdbtnNewRadioButton_3)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel))
							.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(tryAgain, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(34))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(LabelArmed)
						.addComponent(LabelDesarmed))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(lblNewLabel_2)
					.addGap(16)
					.addComponent(rdbtnNewRadioButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnNewRadioButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnNewRadioButton_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_3)
						.addComponent(tryAgain))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_4)
						.addComponent(btnNewButton))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
	}
	
}
