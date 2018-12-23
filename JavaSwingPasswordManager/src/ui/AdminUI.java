package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import bean.UserBean;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.JScrollBar;

public class AdminUI {

	public JFrame frame;
	JLabel userNameLbl;
	JLabel userEmailLbl;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminUI window = new AdminUI();
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
	public AdminUI() {
		initialize();
	}
	
	public AdminUI(UserBean userBean) {
		initialize();
		
		userNameLbl.setText(userBean.getNameUser());
		userEmailLbl.setText(userBean.getEmailUser());
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 1200, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBackground(new Color(255, 255, 240));
		panel.setBounds(0, 8, 1194, 150);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel userIconLbl = new JLabel("");
		userIconLbl.setHorizontalAlignment(SwingConstants.CENTER);
		userIconLbl.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/user.png")));
		userIconLbl.setBounds(1016, 13, 60, 60);
		panel.add(userIconLbl);
		
		userNameLbl = new JLabel("DIARRA SOUMAILA A");
		userNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		userNameLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		userNameLbl.setForeground(new Color(112, 128, 144));
		userNameLbl.setBounds(917, 86, 259, 20);
		panel.add(userNameLbl);
		
		userEmailLbl = new JLabel("diarra176@gmail.com");
		userEmailLbl.setHorizontalAlignment(SwingConstants.CENTER);
		userEmailLbl.setForeground(new Color(60, 179, 113));
		userEmailLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		userEmailLbl.setBounds(917, 115, 259, 17);
		panel.add(userEmailLbl);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(895, 0, 10, 150);
		panel.add(separator);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(78, 24, 64, 64);
		panel.add(label);
		label.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/pm_logo64.png")));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBorder(null);
		label.setAlignmentX(0.5f);
		
		JLabel lblPasswordManager = new JLabel("<html>\r\nPassword Manager\r\n</html>");
		lblPasswordManager.setForeground(new Color(112, 128, 144));
		lblPasswordManager.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPasswordManager.setBounds(31, 99, 154, 20);
		panel.add(lblPasswordManager);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(208, 0, 10, 150);
		panel.add(separator_1);
		
		JLabel lblBienvenue = new JLabel("SOUMGRAPHIC PASSWORD MANAGER DASHBOARD");
		lblBienvenue.setForeground(new Color(112, 128, 144));
		lblBienvenue.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBienvenue.setBounds(273, 29, 424, 20);
		panel.add(lblBienvenue);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/dashboard.png")));
		lblNewLabel_3.setBounds(230, 24, 30, 30);
		panel.add(lblNewLabel_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(208, 71, 688, 2);
		panel.add(separator_4);
		
		JLabel scoreSecuriteLbl = new JLabel("Score de sécurité");
		scoreSecuriteLbl.setForeground(new Color(112, 128, 144));
		scoreSecuriteLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scoreSecuriteLbl.setBounds(228, 88, 105, 17);
		panel.add(scoreSecuriteLbl);
		
		JLabel scoreSecuritePourcentageLbl = new JLabel("74%");
		scoreSecuritePourcentageLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		scoreSecuritePourcentageLbl.setForeground(new Color(112, 128, 144));
		scoreSecuritePourcentageLbl.setBounds(258, 109, 44, 22);
		panel.add(scoreSecuritePourcentageLbl);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(355, 72, 10, 78);
		panel.add(separator_5);
		
		JLabel disconnectLbl = new JLabel("");
		disconnectLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		disconnectLbl.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/logout.png")));
		disconnectLbl.setHorizontalAlignment(SwingConstants.CENTER);
		disconnectLbl.setBounds(812, 77, 64, 64);
		panel.add(disconnectLbl);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(790, 71, 10, 78);
		panel.add(separator_6);
		
		JLabel lblNombreDeCompte = new JLabel("Nombre de compte enregistré");
		lblNombreDeCompte.setForeground(new Color(112, 128, 144));
		lblNombreDeCompte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreDeCompte.setBounds(450, 86, 183, 17);
		panel.add(lblNombreDeCompte);
		
		JLabel label_2 = new JLabel("10");
		label_2.setForeground(new Color(112, 128, 144));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(519, 107, 44, 22);
		panel.add(label_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(60, 179, 113));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(0, 0, 1194, 8);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 255, 240));
		panel_1.setBounds(0, 179, 792, 423);
		frame.getContentPane().add(panel_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 58, 792, 12);
		panel_1.add(separator_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/lock_pass.png")));
		lblNewLabel.setBounds(12, 13, 32, 32);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Compte enregistré");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setForeground(new Color(112, 128, 144));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(56, 18, 167, 22);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblCompte = new JLabel("Compte");
		lblCompte.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCompte.setForeground(new Color(112, 128, 144));
		lblCompte.setBounds(12, 72, 56, 16);
		panel_1.add(lblCompte);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setForeground(new Color(112, 128, 144));
		lblMotDePasse.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMotDePasse.setBounds(246, 73, 91, 17);
		panel_1.add(lblMotDePasse);
		
		JLabel lblUrl = new JLabel("URL");
		lblUrl.setForeground(new Color(112, 128, 144));
		lblUrl.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUrl.setBounds(500, 73, 91, 17);
		panel_1.add(lblUrl);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(0, 101, 792, 12);
		panel_1.add(separator_7);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(764, 114, 16, 296);
		panel_1.add(scrollBar);
		
		JLabel label_6 = new JLabel("");
		label_6.setOpaque(true);
		label_6.setBackground(new Color(60, 179, 113));
		label_6.setBounds(0, 171, 792, 8);
		frame.getContentPane().add(label_6);
		
		JLabel label_1 = new JLabel("");
		label_1.setOpaque(true);
		label_1.setBackground(new Color(60, 179, 113));
		label_1.setBounds(797, 171, 397, 8);
		frame.getContentPane().add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 255, 240));
		panel_2.setBounds(797, 179, 397, 423);
		frame.getContentPane().add(panel_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 58, 792, 12);
		panel_2.add(separator_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/editing.png")));
		label_3.setBounds(12, 13, 32, 32);
		panel_2.add(label_3);
		
		JLabel lblEditionDeCompte = new JLabel("Edition de compte");
		lblEditionDeCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditionDeCompte.setForeground(new Color(112, 128, 144));
		lblEditionDeCompte.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEditionDeCompte.setBounds(56, 18, 167, 22);
		panel_2.add(lblEditionDeCompte);
	}
}
