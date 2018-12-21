package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Cursor;

public class AuthenticationUI extends JFrame{

	public JFrame frame;
	private JTextField emailTxtfield;
	private JPasswordField passwordTxtfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthenticationUI window = new AuthenticationUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AuthenticationUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(394, 0, 406, 478);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSoumgraphic = new JLabel("<html>\nSoumgraphic Password Manager\n</html>");
		lblSoumgraphic.setForeground(new Color(112, 128, 144));
		lblSoumgraphic.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSoumgraphic.setBounds(80, 282, 272, 27);
		panel.add(lblSoumgraphic);
		
		JLabel label = new JLabel("");
		label.setAlignmentX(0.5f);
		label.setBorder(null);
		//./assets/img/pm_logo.png
		label.setIcon(new ImageIcon(AuthenticationUI.class.getResource("/ui/images/pm_logo.png")));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(141, 125, 133, 145);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setBounds(0, 0, 395, 478);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Heureux de vous revoir à nouveau !");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(51, 75, 320, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblEnterYourDetails = new JLabel("Connexion à votre compte");
		lblEnterYourDetails.setForeground(Color.WHITE);
		lblEnterYourDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnterYourDetails.setBounds(51, 103, 282, 31);
		panel_1.add(lblEnterYourDetails);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(51, 210, 320, 12);
		panel_1.add(separator_1);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(51, 165, 282, 16);
		panel_1.add(lblEmail);
		
		emailTxtfield = new JTextField();
		emailTxtfield.setCaretColor(new Color(255, 255, 255));
		emailTxtfield.setForeground(Color.WHITE);
		emailTxtfield.setFont(new Font("Tahoma", Font.BOLD, 12));
		emailTxtfield.setColumns(10);
		emailTxtfield.setBorder(null);
		emailTxtfield.setBackground(new Color(60, 179, 113));
		emailTxtfield.setBounds(51, 193, 320, 16);
		panel_1.add(emailTxtfield);
		
		JLabel lblPassword = new JLabel("Mot de passe");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(51, 234, 282, 16);
		panel_1.add(lblPassword);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBackground(Color.WHITE);
		separator_2.setBounds(51, 279, 320, 12);
		panel_1.add(separator_2);
		
		passwordTxtfield = new JPasswordField();
		passwordTxtfield.setBorder(null);
		passwordTxtfield.setCaretColor(new Color(255, 255, 255));
		passwordTxtfield.setBackground(new Color(60, 179, 113));
		passwordTxtfield.setForeground(new Color(255, 255, 255));
		passwordTxtfield.setFont(new Font("Tahoma", Font.BOLD, 12));
		passwordTxtfield.setBounds(51, 262, 320, 16);
		panel_1.add(passwordTxtfield);
		
		JButton inscriptionBtn = new JButton("Se connecter");
		inscriptionBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		inscriptionBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		inscriptionBtn.setForeground(new Color(255, 255, 255));
		inscriptionBtn.setContentAreaFilled(false);
		inscriptionBtn.setFocusPainted(false);
		inscriptionBtn.setBorder(new LineBorder(new Color(255, 255, 255)));
		inscriptionBtn.setBounds(51, 320, 320, 40);
		panel_1.add(inscriptionBtn);
		
		JButton goToInscription = new JButton("<html>\nPas encore de compte ? <u>Inscription</u>\n</html>");
		goToInscription.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		goToInscription.setFont(new Font("Tahoma", Font.BOLD, 12));
		goToInscription.setBorder(null);
		goToInscription.setForeground(new Color(255, 255, 255));
		goToInscription.setBounds(51, 381, 320, 21);
		panel_1.add(goToInscription);
	}
}
