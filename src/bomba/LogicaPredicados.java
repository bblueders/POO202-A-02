package bomba;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogicaPredicados extends JPanel {

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



	public LogicaPredicados() {
		setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("(\u2203x)");
		rdbtnNewRadioButton.setBounds(21, 82, 56, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("(\u2203y)");
		rdbtnNewRadioButton_1.setBounds(21, 113, 56, 23);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("(\u2200x)");
		rdbtnNewRadioButton_2.setBounds(21, 144, 56, 23);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("(q(x)");
		rdbtnNewRadioButton_3.setBounds(96, 82, 56, 23);
		add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("(p(x)");
		rdbtnNewRadioButton_4.setBounds(96, 113, 56, 23);
		add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("\u00AC(p(x)");
		rdbtnNewRadioButton_5.setBounds(96, 144, 71, 23);
		add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("\u2227");
		rdbtnNewRadioButton_6.setBounds(169, 82, 56, 23);
		add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("p(x))");
		rdbtnNewRadioButton_7.setBounds(242, 82, 89, 23);
		add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnpx = new JRadioButton("q(x))");
		rdbtnpx.setBounds(242, 144, 67, 23);
		add(rdbtnpx);
		
		JLabel lblNewLabel = new JLabel("\"Algumas pedras s\u00E3o preciosas.\"");
		lblNewLabel.setBounds(21, 28, 156, 14);
		add(lblNewLabel);
		
		JButton btnConfirma = new JButton("Confirmar");
		btnConfirma.setBackground(new Color(65, 105, 225));
		btnConfirma.setBounds(228, 216, 89, 23);
		add(btnConfirma);
		
		JLabel tryAgain = new JLabel("Tente novamente!");
		tryAgain.setForeground(new Color(65, 105, 225));
		tryAgain.setBounds(228, 191, 91, 14);
		add(tryAgain);
		tryAgain.setVisible(false);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("\u2192");
		rdbtnNewRadioButton_8.setBounds(169, 113, 56, 23);
		add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("\u2228");
		rdbtnNewRadioButton_9.setBounds(169, 144, 56, 23);
		add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("\u00ACq(x))");
		rdbtnNewRadioButton_10.setBounds(242, 113, 80, 23);
		add(rdbtnNewRadioButton_10);
		
		JLabel lblNewLabel_1 = new JLabel("Monte a repreenta\u00E7\u00E3o correta:");
		lblNewLabel_1.setBounds(21, 61, 156, 14);
		add(lblNewLabel_1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtnNewRadioButton_3);
		group1.add(rdbtnNewRadioButton_4);
		group1.add(rdbtnNewRadioButton_5);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnNewRadioButton_6);
		group2.add(rdbtnNewRadioButton_9);
		group2.add(rdbtnNewRadioButton_8);
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(rdbtnNewRadioButton_7);
		group3.add(rdbtnNewRadioButton_10);
		group3.add(rdbtnpx);
		
		JLabel armed = new JLabel("Armado");
		armed.setForeground(Color.RED);
		armed.setFont(new Font("Tahoma", Font.BOLD, 12));
		armed.setBounds(209, 11, 56, 14);
		add(armed);
		
		JLabel desarmed = new JLabel("Desarmado");
		desarmed.setFont(new Font("Tahoma", Font.BOLD, 12));
		desarmed.setForeground(new Color(50, 205, 50));
		desarmed.setBounds(261, 12, 70, 14);
		add(desarmed);
		desarmed.setVisible(false);
		
		rdbtnNewRadioButton.addActionListener(null);
		rdbtnNewRadioButton_1.addActionListener(null);
		rdbtnNewRadioButton_2.addActionListener(null);
		rdbtnNewRadioButton_3.addActionListener(null);
		rdbtnNewRadioButton_4.addActionListener(null);
		rdbtnNewRadioButton_5.addActionListener(null);
		rdbtnNewRadioButton_6.addActionListener(null);
		rdbtnNewRadioButton_7.addActionListener(null);
		rdbtnNewRadioButton_8.addActionListener(null);
		rdbtnNewRadioButton_9.addActionListener(null);
		rdbtnNewRadioButton_10.addActionListener(null);
		rdbtnpx.addActionListener(null);
		
		btnConfirma.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				tryAgain.setVisible(true);
				if(rdbtnNewRadioButton.isSelected() && rdbtnNewRadioButton_4.isSelected() && rdbtnNewRadioButton_6.isSelected() && rdbtnpx.isSelected()) {
					tryAgain.setVisible(false);
					armed.setVisible(false);
					desarmed.setVisible(true);
					lblNewLabel.setEnabled(false);
					lblNewLabel_1.setEnabled(false);
					rdbtnNewRadioButton.setEnabled(false);
					rdbtnNewRadioButton_1.setEnabled(false);
					rdbtnNewRadioButton_2.setEnabled(false);
					rdbtnNewRadioButton_3.setEnabled(false);
					rdbtnNewRadioButton_4.setEnabled(false);
					rdbtnNewRadioButton_5.setEnabled(false);
					rdbtnNewRadioButton_6.setEnabled(false);
					rdbtnNewRadioButton_7.setEnabled(false);
					rdbtnNewRadioButton_8.setEnabled(false);
					rdbtnNewRadioButton_9.setEnabled(false);
					rdbtnNewRadioButton_10.setEnabled(false);
					rdbtnpx.setEnabled(false);
					btnConfirma.setEnabled(false);
					LogicaPredicados.this.desarmed = true;
					respostaCorreta++;
				}else {
					tryAgain.setVisible(true);
					respostaErrada++;
				}
			}
		});

	}

}
