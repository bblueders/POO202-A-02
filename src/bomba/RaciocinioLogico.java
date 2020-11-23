package bomba;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;

public class RaciocinioLogico extends JPanel{

	/**
	 * Create the panel.
	 */
	public RaciocinioLogico() {
		
		JLabel lblNewLabel = new JLabel("I.   Todas as cabras s\u00E3o aves.");
		
		JLabel lblNewLabel_1 = new JLabel("II.  Algumas tortas s\u00E3o cabras.");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Todas as tortas s\u00E3o aves");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Cabras comem tortas");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Algumas tortas s\u00E3o aves");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Nenhuma cabra \u00E9 torta");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Todas as aves s\u00E3o cabras");
		
		JLabel lblNewLabel_2 = new JLabel("Qual alternativa est\u00E1 correta?");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton_2)
						.addComponent(rdbtnNewRadioButton_3)
						.addComponent(rdbtnNewRadioButton_4)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel))
					.addContainerGap(165, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
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
					.addComponent(rdbtnNewRadioButton_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnNewRadioButton_4)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
