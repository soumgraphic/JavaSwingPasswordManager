package ui.test;

import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;

public class UiTestScroll extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public UiTestScroll() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		JPanel panel = createContactPanel();

		JScrollPane sp = new JScrollPane();
		sp.setViewportView(panel);

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(sp, BorderLayout.CENTER);
	}

	public JPanel createContactPanel() {
		JLabel titleLbl = new JLabel("Title");
		titleLbl.setBounds(20, 20, 150, 20);
		
		JPanel panelGeneral = new JPanel();
		panelGeneral.setLayout(null);
		panelGeneral.add(titleLbl);
		panelGeneral.setBorder(new TitledBorder("General Information"));
		
		/*
		 
		JLabel firstNameLbl = new JLabel("First name ");
		firstNameLbl.setBounds(20, 50, 90, 20);

		JTextField firstNameTf = new JTextField();
		firstNameTf.setBounds(122, 50, 236, 20);

		panelGeneral.add(firstNameLbl);
		panelGeneral.add(firstNameTf);
		
		textField = new JTextField();
		textField.setBounds(122, 83, 236, 20);
		panelGeneral.add(textField);
		
		JLabel label = new JLabel("First name ");
		label.setBounds(20, 83, 90, 20);
		panelGeneral.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 116, 236, 20);
		panelGeneral.add(textField_1);
		
		JLabel label_1 = new JLabel("First name ");
		label_1.setBounds(20, 116, 90, 20);
		panelGeneral.add(label_1);
		
		*/
		
		int j = 50;
		int z = 33;
		int length = 11;
		for (int i = 0; i < length; i++) {
			
			JLabel firstNameLbl = new JLabel("First name " + i);
			firstNameLbl.setBounds(20, j, 90, 20);

			JTextField firstNameTf = new JTextField();
			firstNameTf.setBounds(122, j, 236, 20);

			panelGeneral.add(firstNameLbl);
			panelGeneral.add(firstNameTf);

			j = j + z;
		}
		// Pour 50 txtField d'affichage 1700 de dimension était nécessaire donc 1700 / 50 donne 34 ce qui fait que 34 est nécessaire à chaque fois pour afficher
		//un text field au complet donc si on fait length multiplié par 34 sa doit nous donner directement l'affichage top des txtfield de length
		panelGeneral.setPreferredSize(new Dimension(350, (int) (length * 36))); // Pour les scroll 350 largeur, 2000 hauteur
		//panelGeneral.setPreferredSize(new Dimension(350, 1700));
		
		//Pour gérer l'affichage je fais 
		if (((int) (length * 34)) < 400) {
			panelGeneral.setPreferredSize(new Dimension(350, 400));
		}else {
			panelGeneral.setPreferredSize(new Dimension(350, (int) (length * 33.5)));
		}
		
		return panelGeneral;
	}

	public static void main(String[] args) {
		UiTestScroll main = new UiTestScroll();
		main.setSize(400, 400);
		main.setVisible(true);
	}
}
