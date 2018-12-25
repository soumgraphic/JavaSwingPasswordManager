package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import bean.AccountItemView;
import bean.UserBean;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class AdminUI_OLD {

	public JFrame frame;
	JLabel userNameLbl;
	JLabel userEmailLbl;
	private final JPanel panel = new JPanel();
	private JTextField passwordItemTxtFld;
	private JTextField usernameItemTxtFld;
	private JTextField urlItemTxtFld;
	private JTextField nomCompletItemTxtFld;
	private JTextField etatPasswordItemTxtFld;
	private JTextField etatUrlItemTxtFld;
	private JTextField nomCompletEditTxtFld;
	private JTextField usernameEditTxtFld;
	private JPasswordField passwordEditTxtFld;
	private JTextField urlEditTxtFld;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminUI_OLD window = new AdminUI_OLD();
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
	public AdminUI_OLD() {
		initialize();
	}

	public AdminUI_OLD(UserBean userBean) {
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
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 8, 1200, 150);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel userIconLbl = new JLabel("");
		userIconLbl.setHorizontalAlignment(SwingConstants.CENTER);
		userIconLbl.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/user.png")));
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
		label.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/pm_logo64.png")));
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
		lblNewLabel_3.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/dashboard.png")));
		lblNewLabel_3.setBounds(230, 24, 30, 30);
		panel.add(lblNewLabel_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(214, 61, 688, 12);
		panel.add(separator_4);

		JLabel scoreSecuriteLbl = new JLabel("Score de sécurité");
		scoreSecuriteLbl.setForeground(new Color(112, 128, 144));
		scoreSecuriteLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scoreSecuriteLbl.setBounds(228, 88, 105, 17);
		panel.add(scoreSecuriteLbl);

		JLabel scoreSecuritePourcentageLbl = new JLabel("74%");
		scoreSecuritePourcentageLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		scoreSecuritePourcentageLbl.setForeground(new Color(112, 128, 144));
		scoreSecuritePourcentageLbl.setBounds(259, 111, 44, 22);
		panel.add(scoreSecuritePourcentageLbl);

		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(355, 72, 10, 78);
		panel.add(separator_5);

		JLabel disconnectLbl = new JLabel("");
		disconnectLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		disconnectLbl.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/logout.png")));
		disconnectLbl.setHorizontalAlignment(SwingConstants.CENTER);
		disconnectLbl.setBounds(812, 77, 64, 64);
		panel.add(disconnectLbl);

		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(790, 71, 10, 78);
		panel.add(separator_6);

		JLabel nbreCompteEnregistrerLbl = new JLabel("Nombre de compte enregistré");
		nbreCompteEnregistrerLbl.setForeground(new Color(112, 128, 144));
		nbreCompteEnregistrerLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nbreCompteEnregistrerLbl.setBounds(377, 86, 183, 17);
		panel.add(nbreCompteEnregistrerLbl);

		JLabel chiffreNbreCompteEnregistrerLbl = new JLabel("10");
		chiffreNbreCompteEnregistrerLbl.setForeground(new Color(112, 128, 144));
		chiffreNbreCompteEnregistrerLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		chiffreNbreCompteEnregistrerLbl.setBounds(457, 111, 22, 22);
		panel.add(chiffreNbreCompteEnregistrerLbl);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(572, 72, 10, 78);
		panel.add(separator_8);
		
		JLabel lblWeAreHappy = new JLabel("We are happy you like it !");
		lblWeAreHappy.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeAreHappy.setForeground(new Color(112, 128, 144));
		lblWeAreHappy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWeAreHappy.setBounds(595, 89, 183, 17);
		panel.add(lblWeAreHappy);
		
		JLabel githubIconLbl = new JLabel("");
		githubIconLbl.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/github_logo.png")));
		githubIconLbl.setForeground(new Color(112, 128, 144));
		githubIconLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		githubIconLbl.setBounds(640, 115, 23, 23);
		panel.add(githubIconLbl);
		
		JLabel fbIconLbl = new JLabel("");
		fbIconLbl.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/facebook.png")));
		fbIconLbl.setForeground(new Color(112, 128, 144));
		fbIconLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		fbIconLbl.setBounds(675, 115, 24, 24);
		panel.add(fbIconLbl);
		
		JLabel twitterIconLbl = new JLabel("");
		twitterIconLbl.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/twitter.png")));
		twitterIconLbl.setForeground(new Color(112, 128, 144));
		twitterIconLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		twitterIconLbl.setBounds(711, 116, 24, 24);
		panel.add(twitterIconLbl);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(60, 179, 113));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(0, 0, 1200, 8);
		frame.getContentPane().add(lblNewLabel_2);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 179, 792, 432);
		frame.getContentPane().add(panel_1);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 58, 792, 12);
		panel_1.add(separator_3);

		JLabel iconeTextCompteEnregistrerLbl = new JLabel("");
		iconeTextCompteEnregistrerLbl.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/lock_pass.png")));
		iconeTextCompteEnregistrerLbl.setBounds(12, 13, 32, 32);
		panel_1.add(iconeTextCompteEnregistrerLbl);

		JLabel compteEnregistrerLbl = new JLabel("Compte enregistré");
		compteEnregistrerLbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		compteEnregistrerLbl.setForeground(new Color(112, 128, 144));
		compteEnregistrerLbl.setHorizontalAlignment(SwingConstants.CENTER);
		compteEnregistrerLbl.setBounds(56, 18, 167, 22);
		panel_1.add(compteEnregistrerLbl);

		JLabel lblCompte = new JLabel("Compte");
		lblCompte.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCompte.setForeground(new Color(112, 128, 144));
		lblCompte.setBounds(12, 72, 56, 16);
		panel_1.add(lblCompte);

		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setForeground(new Color(112, 128, 144));
		lblMotDePasse.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMotDePasse.setBounds(246, 73, 92, 17);
		panel_1.add(lblMotDePasse);

		JLabel lblUrl = new JLabel("URL");
		lblUrl.setForeground(new Color(112, 128, 144));
		lblUrl.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUrl.setBounds(470, 73, 91, 17);
		panel_1.add(lblUrl);

		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(0, 101, 792, 12);
		panel_1.add(separator_7);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(new Color(255, 255, 255));
		scrollBar.setBounds(764, 125, 16, 53);
		panel_1.add(scrollBar);

		JLabel lblAction = new JLabel("Action");
		lblAction.setForeground(new Color(112, 128, 144));
		lblAction.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAction.setBounds(655, 72, 45, 17);
		panel_1.add(lblAction);

		JLabel iconViewOrHidePasswordItemLbl = new JLabel("");
		iconViewOrHidePasswordItemLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iconViewOrHidePasswordItemLbl.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/eye.png")));
		iconViewOrHidePasswordItemLbl.setForeground(new Color(112, 128, 144));
		iconViewOrHidePasswordItemLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		iconViewOrHidePasswordItemLbl.setBounds(408, 125, 23, 23);
		panel_1.add(iconViewOrHidePasswordItemLbl);

		passwordItemTxtFld = new JTextField();
		passwordItemTxtFld.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordItemTxtFld.setForeground(new Color(112, 128, 144));
		passwordItemTxtFld.setBorder(null);
		passwordItemTxtFld.setBackground(new Color(255, 255, 255));
		passwordItemTxtFld.setEditable(false);
		passwordItemTxtFld.setText("**********");
		passwordItemTxtFld.setBounds(246, 125, 150, 22);
		panel_1.add(passwordItemTxtFld);
		passwordItemTxtFld.setColumns(10);

		usernameItemTxtFld = new JTextField();
		usernameItemTxtFld.setText("soumgraphic@gmail.com");
		usernameItemTxtFld.setForeground(new Color(112, 128, 144));
		usernameItemTxtFld.setFont(new Font("Tahoma", Font.BOLD, 15));
		usernameItemTxtFld.setEditable(false);
		usernameItemTxtFld.setColumns(10);
		usernameItemTxtFld.setBorder(null);
		usernameItemTxtFld.setBackground(Color.WHITE);
		usernameItemTxtFld.setBounds(12, 125, 211, 22);
		panel_1.add(usernameItemTxtFld);

		urlItemTxtFld = new JTextField();
		urlItemTxtFld.setText("www.youtube.com");
		urlItemTxtFld.setForeground(new Color(112, 128, 144));
		urlItemTxtFld.setFont(new Font("Tahoma", Font.BOLD, 15));
		urlItemTxtFld.setEditable(false);
		urlItemTxtFld.setColumns(10);
		urlItemTxtFld.setBorder(null);
		urlItemTxtFld.setBackground(Color.WHITE);
		urlItemTxtFld.setBounds(470, 125, 160, 22);
		panel_1.add(urlItemTxtFld);

		nomCompletItemTxtFld = new JTextField();
		nomCompletItemTxtFld.setText("Soumaila Abdoulaye DIARRA");
		nomCompletItemTxtFld.setForeground(new Color(112, 128, 144));
		nomCompletItemTxtFld.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nomCompletItemTxtFld.setEditable(false);
		nomCompletItemTxtFld.setColumns(10);
		nomCompletItemTxtFld.setBorder(null);
		nomCompletItemTxtFld.setBackground(Color.WHITE);
		nomCompletItemTxtFld.setBounds(12, 151, 211, 22);
		panel_1.add(nomCompletItemTxtFld);

		etatPasswordItemTxtFld = new JTextField();
		etatPasswordItemTxtFld.setText("Faible");
		etatPasswordItemTxtFld.setForeground(new Color(112, 128, 144));
		etatPasswordItemTxtFld.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etatPasswordItemTxtFld.setEditable(false);
		etatPasswordItemTxtFld.setColumns(10);
		etatPasswordItemTxtFld.setBorder(null);
		etatPasswordItemTxtFld.setBackground(Color.WHITE);
		etatPasswordItemTxtFld.setBounds(246, 151, 150, 22);
		panel_1.add(etatPasswordItemTxtFld);

		etatUrlItemTxtFld = new JTextField();
		etatUrlItemTxtFld.setText("Site fiable");
		etatUrlItemTxtFld.setForeground(new Color(112, 128, 144));
		etatUrlItemTxtFld.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etatUrlItemTxtFld.setEditable(false);
		etatUrlItemTxtFld.setColumns(10);
		etatUrlItemTxtFld.setBorder(null);
		etatUrlItemTxtFld.setBackground(Color.WHITE);
		etatUrlItemTxtFld.setBounds(470, 151, 150, 22);
		panel_1.add(etatUrlItemTxtFld);

		JSeparator separatorItem = new JSeparator();
		separatorItem.setBounds(0, 177, 752, 12);
		panel_1.add(separatorItem);

		JLabel iconeEditItemLbl = new JLabel("");
		iconeEditItemLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iconeEditItemLbl.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/edit_icon.png")));
		iconeEditItemLbl.setBounds(655, 135, 30, 30);
		panel_1.add(iconeEditItemLbl);

		JLabel iconDeleteItemLbl = new JLabel("");
		iconDeleteItemLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iconDeleteItemLbl.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/delete_icon.png")));
		iconDeleteItemLbl.setBounds(704, 135, 30, 30);
		panel_1.add(iconDeleteItemLbl);

		JLabel identifiantItemHiddenTxtFld = new JLabel("");
		identifiantItemHiddenTxtFld.setVisible(false);
		identifiantItemHiddenTxtFld.setForeground(new Color(112, 128, 144));
		identifiantItemHiddenTxtFld.setFont(new Font("Tahoma", Font.BOLD, 16));
		identifiantItemHiddenTxtFld.setBounds(408, 154, 23, 19);
		panel_1.add(identifiantItemHiddenTxtFld);
		
		JScrollPane spViewItem = new JScrollPane();
		spViewItem.setBorder(null);
		spViewItem.setBounds(0, 341, 792, 91);
		spViewItem.getViewport().setBackground(Color.WHITE);
		panel_1.add(spViewItem);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 191, 792, 70);
		panel_1.add(panel_3);
		
		textField = new JTextField();
		textField.setText("soumgraphic@gmail.com");
		textField.setForeground(new Color(112, 128, 144));
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setBounds(12, 6, 211, 22);
		panel_3.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("**********");
		textField_1.setForeground(new Color(112, 128, 144));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(246, 6, 150, 22);
		panel_3.add(textField_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(new Color(112, 128, 144));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(408, 6, 23, 23);
		panel_3.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setText("www.youtube.com");
		textField_2.setForeground(new Color(112, 128, 144));
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(470, 6, 160, 22);
		panel_3.add(textField_2);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(655, 16, 30, 30);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(704, 16, 30, 30);
		panel_3.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setText("Site fiable");
		textField_3.setForeground(new Color(112, 128, 144));
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(470, 32, 150, 22);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("Faible");
		textField_4.setForeground(new Color(112, 128, 144));
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(246, 32, 150, 22);
		panel_3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("Soumaila Abdoulaye DIARRA");
		textField_5.setForeground(new Color(112, 128, 144));
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(12, 32, 211, 22);
		panel_3.add(textField_5);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBounds(0, 58, 752, 12);
		panel_3.add(separator_13);

		JLabel label_6 = new JLabel("");
		label_6.setOpaque(true);
		label_6.setBackground(new Color(60, 179, 113));
		label_6.setBounds(0, 171, 792, 8);
		frame.getContentPane().add(label_6);

		JLabel label_1 = new JLabel("");
		label_1.setOpaque(true);
		label_1.setBackground(new Color(60, 179, 113));
		label_1.setBounds(797, 170, 403, 9);
		frame.getContentPane().add(label_1);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(797, 179, 403, 432);
		frame.getContentPane().add(panel_2);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 58, 792, 12);
		panel_2.add(separator_2);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(AdminUI_OLD.class.getResource("/ui/images/editing.png")));
		label_3.setBounds(12, 13, 32, 32);
		panel_2.add(label_3);

		JLabel lblEditionDeCompte = new JLabel("Edition de compte");
		lblEditionDeCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditionDeCompte.setForeground(new Color(112, 128, 144));
		lblEditionDeCompte.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEditionDeCompte.setBounds(56, 18, 167, 22);
		panel_2.add(lblEditionDeCompte);

		JLabel label_7 = new JLabel("Nom");
		label_7.setForeground(new Color(60, 179, 113));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(12, 70, 282, 16);
		panel_2.add(label_7);

		nomCompletEditTxtFld = new JTextField();
		nomCompletEditTxtFld.setForeground(new Color(60, 179, 113));
		nomCompletEditTxtFld.setFont(new Font("Tahoma", Font.BOLD, 12));
		nomCompletEditTxtFld.setColumns(10);
		nomCompletEditTxtFld.setCaretColor(new Color(60, 179, 113));
		nomCompletEditTxtFld.setBorder(null);
		nomCompletEditTxtFld.setBackground(new Color(255, 255, 255));
		nomCompletEditTxtFld.setBounds(12, 98, 350, 16);
		panel_2.add(nomCompletEditTxtFld);

		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(new Color(60, 179, 113));
		separator_9.setBackground(Color.WHITE);
		separator_9.setBounds(12, 115, 350, 12);
		panel_2.add(separator_9);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(60, 179, 113));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(12, 139, 282, 16);
		panel_2.add(lblUsername);

		usernameEditTxtFld = new JTextField();
		usernameEditTxtFld.setForeground(new Color(60, 179, 113));
		usernameEditTxtFld.setFont(new Font("Tahoma", Font.BOLD, 12));
		usernameEditTxtFld.setColumns(10);
		usernameEditTxtFld.setCaretColor(new Color(60, 179, 113));
		usernameEditTxtFld.setBorder(null);
		usernameEditTxtFld.setBackground(new Color(255, 255, 255));
		usernameEditTxtFld.setBounds(12, 167, 350, 16);
		panel_2.add(usernameEditTxtFld);

		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(new Color(60, 179, 113));
		separator_10.setBackground(Color.WHITE);
		separator_10.setBounds(12, 184, 350, 12);
		panel_2.add(separator_10);

		JLabel label_9 = new JLabel("Mot de passe");
		label_9.setForeground(new Color(60, 179, 113));
		label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_9.setBounds(12, 208, 282, 16);
		panel_2.add(label_9);

		passwordEditTxtFld = new JPasswordField();
		passwordEditTxtFld.setForeground(new Color(60, 179, 113));
		passwordEditTxtFld.setFont(new Font("Tahoma", Font.BOLD, 12));
		passwordEditTxtFld.setCaretColor(new Color(60, 179, 113));
		passwordEditTxtFld.setBorder(null);
		passwordEditTxtFld.setBackground(new Color(255, 255, 255));
		passwordEditTxtFld.setBounds(12, 236, 350, 16);
		panel_2.add(passwordEditTxtFld);

		JSeparator separator_11 = new JSeparator();
		separator_11.setForeground(new Color(60, 179, 113));
		separator_11.setBackground(Color.WHITE);
		separator_11.setBounds(12, 253, 350, 12);
		panel_2.add(separator_11);

		JSeparator separator_12 = new JSeparator();
		separator_12.setForeground(new Color(60, 179, 113));
		separator_12.setBackground(Color.WHITE);
		separator_12.setBounds(12, 322, 350, 12);
		panel_2.add(separator_12);

		urlEditTxtFld = new JTextField();
		urlEditTxtFld.setForeground(new Color(60, 179, 113));
		urlEditTxtFld.setFont(new Font("Tahoma", Font.BOLD, 12));
		urlEditTxtFld.setColumns(10);
		urlEditTxtFld.setCaretColor(new Color(60, 179, 113));
		urlEditTxtFld.setBorder(null);
		urlEditTxtFld.setBackground(Color.WHITE);
		urlEditTxtFld.setBounds(12, 305, 350, 16);
		panel_2.add(urlEditTxtFld);

		JLabel lblUrl_1 = new JLabel("Url");
		lblUrl_1.setForeground(new Color(60, 179, 113));
		lblUrl_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUrl_1.setBounds(12, 277, 282, 16);
		panel_2.add(lblUrl_1);

		JButton ajouterEditBtn = new JButton("Ajouter");
		ajouterEditBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ajouterEditBtn.setForeground(new Color(60, 179, 113));
		ajouterEditBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		ajouterEditBtn.setFocusPainted(false);
		ajouterEditBtn.setContentAreaFilled(false);
		ajouterEditBtn.setBorder(new LineBorder(new Color(60, 179, 113)));
		ajouterEditBtn.setActionCommand("inscriptionBtn");
		ajouterEditBtn.setBounds(12, 356, 350, 40);
		panel_2.add(ajouterEditBtn);
		
		ajouterEditBtn.setRolloverEnabled(true);
		

	}
}
