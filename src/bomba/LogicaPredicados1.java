package bomba;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogicaPredicados1 extends JPanel {

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



	public LogicaPredicados1() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\"Toda a cobra \u00E9 venenosa.\"");
		lblNewLabel.setBounds(26, 31, 149, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Com base na senten\u00E7a, qual \u00E9 a representa\u00E7\u00E3o correta?");
		lblNewLabel_1.setBounds(26, 66, 274, 14);
		add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("(\u2200x)(c(x) \u2192 v(x))");
		rdbtnNewRadioButton.setBounds(26, 109, 131, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("(\u2200x)(v(x) \u2192 c(x))");
		rdbtnNewRadioButton_1.setBounds(26, 135, 131, 23);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("(\u2200x)(c(x) \u2227 \u00ACv(x))");
		rdbtnNewRadioButton_2.setBounds(26, 161, 131, 23);
		add(rdbtnNewRadioButton_2);
		
		JButton btnConfirma = new JButton("Confirmar");
		btnConfirma.setBackground(new Color(65, 105, 225));
		btnConfirma.setBounds(232, 216, 89, 23);
		add(btnConfirma);
		
		JLabel tryAgain = new JLabel("Tente novamente!");
		tryAgain.setForeground(new Color(65, 105, 225));
		tryAgain.setBounds(232, 193, 89, 14);
		add(tryAgain);
		tryAgain.setVisible(false);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("(\u2200x)(c(x) \u2228 v(x))");
		rdbtnNewRadioButton_3.setBounds(26, 187, 131, 23);
		add(rdbtnNewRadioButton_3);
		
		JLabel armed = new JLabel("Armado");
		armed.setFont(new Font("Tahoma", Font.BOLD, 12));
		armed.setForeground(Color.RED);
		armed.setBounds(197, 11, 58, 14);
		add(armed);
		
		JLabel desarmed = new JLabel("Desarmado");
		desarmed.setForeground(new Color(50, 205, 50));
		desarmed.setFont(new Font("Dialog", Font.BOLD, 12));
		desarmed.setBounds(253, 11, 68, 14);
		add(desarmed);
		desarmed.setVisible(false);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		group.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton.addActionListener(null);
		rdbtnNewRadioButton_1.addActionListener(null);
		rdbtnNewRadioButton_2.addActionListener(null);
		rdbtnNewRadioButton_3.addActionListener(null);
		
		btnConfirma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tryAgain.setVisible(true);
				respostaErrada++;
				if(rdbtnNewRadioButton.isSelected()) {
					tryAgain.setVisible(false);
					desarmed.setVisible(true);
					armed.setVisible(false);
					lblNewLabel.setEnabled(false);
					lblNewLabel_1.setEnabled(false);
					rdbtnNewRadioButton.setEnabled(false);
					rdbtnNewRadioButton_1.setEnabled(false);
					rdbtnNewRadioButton_2.setEnabled(false);
					rdbtnNewRadioButton_3.setEnabled(false);
					btnConfirma.setEnabled(false);
					LogicaPredicados1.this.desarmed = true;
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
			}
		});

	}
}
