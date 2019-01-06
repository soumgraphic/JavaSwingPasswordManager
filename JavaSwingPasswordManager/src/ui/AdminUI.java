package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import bean.AccountBean;
import bean.AccountItemView;
import bean.UserBean;
import dao.AccountDaoImpl;
import utils.Constants;
import utils.Utils;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class AdminUI extends JFrame implements ActionListener, MouseListener {

	public JFrame frame;
	JLabel userNameLbl;
	JLabel userEmailLbl;
	private final JPanel panel = new JPanel();
	private JTextField nomCompletEditTxtFld;
	private JTextField usernameEditTxtFld;
	private JPasswordField passwordEditTxtFld;
	private JTextField urlEditTxtFld;
	JLabel userIconLbl;
	JLabel lblPasswordManager;
	JLabel scoreSecuriteLbl;
	JLabel scoreSecuritePourcentageLbl;
	JLabel disconnectLbl;
	JLabel nbreCompteEnregistrerLbl;
	JLabel chiffreNbreCompteEnregistrerLbl;
	JLabel lblWeAreHappy;
	JLabel githubIconLbl;
	JLabel fbIconLbl;
	JLabel twitterIconLbl;
	JLabel iconeTextCompteEnregistrerLbl;
	JLabel compteEnregistrerLbl;
	JLabel lblCompte;
	JButton ajouterEditBtn;
	JLabel iconViewOrHidePasswordEditLbl;
	UserBean user = new UserBean();
	

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
		user = userBean;
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

		userIconLbl = new JLabel("");
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

		lblPasswordManager = new JLabel("<html>\r\nPassword Manager\r\n</html>");
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
		separator_4.setBounds(214, 61, 688, 12);
		panel.add(separator_4);

		scoreSecuriteLbl = new JLabel("Score de sécurité");
		scoreSecuriteLbl.setForeground(new Color(112, 128, 144));
		scoreSecuriteLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scoreSecuriteLbl.setBounds(228, 88, 105, 17);
		panel.add(scoreSecuriteLbl);

		scoreSecuritePourcentageLbl = new JLabel("74%");
		scoreSecuritePourcentageLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		scoreSecuritePourcentageLbl.setForeground(new Color(112, 128, 144));
		scoreSecuritePourcentageLbl.setBounds(259, 111, 44, 22);
		panel.add(scoreSecuritePourcentageLbl);

		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(355, 72, 10, 78);
		panel.add(separator_5);

		disconnectLbl = new JLabel("");
		disconnectLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		disconnectLbl.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/logout.png")));
		disconnectLbl.setHorizontalAlignment(SwingConstants.CENTER);
		disconnectLbl.setBounds(812, 77, 64, 64);
		disconnectLbl.addMouseListener(this);
		panel.add(disconnectLbl);

		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(790, 71, 10, 78);
		panel.add(separator_6);

		nbreCompteEnregistrerLbl = new JLabel("Nombre de compte enregistré");
		nbreCompteEnregistrerLbl.setForeground(new Color(112, 128, 144));
		nbreCompteEnregistrerLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nbreCompteEnregistrerLbl.setBounds(377, 86, 183, 17);
		panel.add(nbreCompteEnregistrerLbl);

		chiffreNbreCompteEnregistrerLbl = new JLabel("10");
		chiffreNbreCompteEnregistrerLbl.setVerticalAlignment(SwingConstants.TOP);
		chiffreNbreCompteEnregistrerLbl.setForeground(new Color(112, 128, 144));
		chiffreNbreCompteEnregistrerLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		chiffreNbreCompteEnregistrerLbl.setBounds(457, 111, 22, 22);
		panel.add(chiffreNbreCompteEnregistrerLbl);

		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(572, 72, 10, 78);
		panel.add(separator_8);

		lblWeAreHappy = new JLabel("We are happy you like it !");
		lblWeAreHappy.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeAreHappy.setForeground(new Color(112, 128, 144));
		lblWeAreHappy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWeAreHappy.setBounds(595, 89, 183, 17);
		panel.add(lblWeAreHappy);

		githubIconLbl = new JLabel("");
		githubIconLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		githubIconLbl.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/github_logo.png")));
		githubIconLbl.setForeground(new Color(112, 128, 144));
		githubIconLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		githubIconLbl.setBounds(640, 115, 23, 23);
		githubIconLbl.addMouseListener(this);

		panel.add(githubIconLbl);

		fbIconLbl = new JLabel("");
		fbIconLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fbIconLbl.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/facebook.png")));
		fbIconLbl.setForeground(new Color(112, 128, 144));
		fbIconLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		fbIconLbl.setBounds(675, 115, 24, 24);
		fbIconLbl.addMouseListener(this);
		panel.add(fbIconLbl);

		twitterIconLbl = new JLabel("");
		twitterIconLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		twitterIconLbl.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/twitter.png")));
		twitterIconLbl.setForeground(new Color(112, 128, 144));
		twitterIconLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		twitterIconLbl.setBounds(711, 116, 24, 24);
		twitterIconLbl.addMouseListener(this);
		panel.add(twitterIconLbl);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(60, 179, 113));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(0, 0, 1200, 8);
		frame.getContentPane().add(lblNewLabel_2);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 179, 792, 125);
		frame.getContentPane().add(panel_1);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 58, 792, 12);
		panel_1.add(separator_3);

		iconeTextCompteEnregistrerLbl = new JLabel("");
		iconeTextCompteEnregistrerLbl.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/lock_pass.png")));
		iconeTextCompteEnregistrerLbl.setBounds(12, 13, 32, 32);
		panel_1.add(iconeTextCompteEnregistrerLbl);

		compteEnregistrerLbl = new JLabel("Compte enregistré");
		compteEnregistrerLbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		compteEnregistrerLbl.setForeground(new Color(112, 128, 144));
		compteEnregistrerLbl.setHorizontalAlignment(SwingConstants.CENTER);
		compteEnregistrerLbl.setBounds(56, 18, 167, 22);
		panel_1.add(compteEnregistrerLbl);

		lblCompte = new JLabel("Compte");
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

		JLabel lblAction = new JLabel("Action");
		lblAction.setForeground(new Color(112, 128, 144));
		lblAction.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAction.setBounds(655, 72, 45, 17);
		panel_1.add(lblAction);

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
		panel_2.setBounds(797, 179, 403, 436);
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
		passwordEditTxtFld.setBounds(12, 236, 315, 16);
		passwordEditTxtFld.setEchoChar('*');
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

		ajouterEditBtn = new JButton("Ajouter");
		ajouterEditBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ajouterEditBtn.setForeground(new Color(60, 179, 113));
		ajouterEditBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		ajouterEditBtn.setFocusPainted(false);
		ajouterEditBtn.setContentAreaFilled(false);
		ajouterEditBtn.setBorder(new LineBorder(new Color(60, 179, 113)));
		ajouterEditBtn.setActionCommand("ajouterEditBtn");
		ajouterEditBtn.setBounds(12, 356, 350, 40);
		ajouterEditBtn.addActionListener(this);
		panel_2.add(ajouterEditBtn);
		
		iconViewOrHidePasswordEditLbl = new JLabel("");
		iconViewOrHidePasswordEditLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iconViewOrHidePasswordEditLbl.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/eye.png")));
		iconViewOrHidePasswordEditLbl.setForeground(new Color(112, 128, 144));
		iconViewOrHidePasswordEditLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		iconViewOrHidePasswordEditLbl.setBounds(339, 233, 23, 23);
		iconViewOrHidePasswordEditLbl.addMouseListener(this);
		panel_2.add(iconViewOrHidePasswordEditLbl);

		JPanel panelGeneralViewAllItems = new JPanel();
		panelGeneralViewAllItems.setBackground(Color.WHITE);
		panelGeneralViewAllItems.setBounds(0, 302, 792, 313);
		//Avant la création de panel
		//System.out.println("User avant panel " + user.toString());
		JPanel panelViewAllItems = createItemPanel();
		// JPanel panelViewAllItems = new JPanel();

		JScrollPane spViewallItems = new JScrollPane();
		spViewallItems.setBorder(null);
		spViewallItems.setBackground(Color.WHITE);
		spViewallItems.setViewportView(panelViewAllItems);

		panelGeneralViewAllItems.setLayout(new BorderLayout());
		panelGeneralViewAllItems.add(spViewallItems, BorderLayout.CENTER);

		frame.getContentPane().add(panelGeneralViewAllItems);

	}

	JPanel createItemPanelTest() {

		JPanel panelViewAllItems = new JPanel();
		panelViewAllItems.setBackground(Color.WHITE);
		panelViewAllItems.setLayout(null);

		int j = 35;
		int k = 32;
		int z = 32;
		int length = 2;
		for (int i = 0; i < length; i++) {

			JLabel firstNameLbl = new JLabel("First name " + i);
			firstNameLbl.setBounds(131, j, 101, 16);

			JTextField firstNameTf = new JTextField();
			firstNameTf.setBounds(291, k, 219, 22);

			panelViewAllItems.add(firstNameLbl);
			panelViewAllItems.add(firstNameTf);

			j = j + z;
			k = k + z;
		}

		panelViewAllItems.setPreferredSize(new Dimension(500, 1000));

		return panelViewAllItems;
	}

	JPanel createItemPanel() {

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 191, 792, 70);

		int debutCpUsername = 6;
		int debutCpPassword = 6;
		int debutCpIconViewPassword = 6;
		int debutCpUrl = 6;
		int debutCpIconEditUpdate = 16;
		int debutCpIconeDelete = 16;
		int debutCpEtatUrl = 32;
		int debutCpEtatPassword = 32;
		int debutCpNomComplet = 32;
		int debutCpSeparator = 58;
		int incrementNouvelleLigne = 67;
		int i;
		System.out.println("Name utilisateur est : " + userNameLbl.getText());
		System.out.println("email utilisateur est : " + userEmailLbl.getText());
		//System.out.println("User toString est " + user.toString());
		
		AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
		List<AccountBean> accounts = new ArrayList<AccountBean>();
		
		try {
			accounts = accountDaoImpl.retrieveAllAccountsByUserId(user.getIdentifiantUser());
			//Nombre d'enregistrement disponible pour l'utilisateur connecté 
			chiffreNbreCompteEnregistrerLbl.setText(String.valueOf(accounts.size()));
			for (AccountBean accountBean : accounts) {
				if ((accountBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY) && (accountBean.getCallDbFunctionBean().isErrorRetour() == false)) {
					JTextField usernameItemTf;
					JTextField passwordItemTf;
					JTextField urlItemTf;
					JTextField etatUrlItemTf;
					JTextField etatPasswordItemTf;
					JTextField nomCompletItemTf;

					usernameItemTf = new JTextField();
					usernameItemTf.setText(accountBean.getUsernameAccount());
					usernameItemTf.setForeground(new Color(112, 128, 144));
					usernameItemTf.setFont(new Font("Tahoma", Font.BOLD, 15));
					usernameItemTf.setEditable(false);
					usernameItemTf.setColumns(10);
					usernameItemTf.setBorder(null);
					usernameItemTf.setBackground(Color.WHITE);
					usernameItemTf.setBounds(12, debutCpUsername, 211, 22);
					panel_3.add(usernameItemTf);

					passwordItemTf = new JTextField();
					passwordItemTf.setText(accountBean.getPasswordAccount());
					passwordItemTf.setForeground(new Color(112, 128, 144));
					passwordItemTf.setFont(new Font("Tahoma", Font.BOLD, 15));
					passwordItemTf.setEditable(false);
					passwordItemTf.setColumns(10);
					passwordItemTf.setBorder(null);
					passwordItemTf.setBackground(Color.WHITE);
					passwordItemTf.setBounds(246, debutCpPassword, 150, 22);
					panel_3.add(passwordItemTf);

					JLabel iconViewPasswordItem = new JLabel("");
					iconViewPasswordItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					iconViewPasswordItem.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/eye.png")));
					iconViewPasswordItem.setForeground(new Color(112, 128, 144));
					iconViewPasswordItem.setFont(new Font("Tahoma", Font.BOLD, 16));
					iconViewPasswordItem.setBounds(408, debutCpIconViewPassword, 23, 23);
					panel_3.add(iconViewPasswordItem);

					urlItemTf = new JTextField();
					urlItemTf.setText(accountBean.getUrlAccount());
					urlItemTf.setForeground(new Color(112, 128, 144));
					urlItemTf.setFont(new Font("Tahoma", Font.BOLD, 15));
					urlItemTf.setEditable(false);
					urlItemTf.setColumns(10);
					urlItemTf.setBorder(null);
					urlItemTf.setBackground(Color.WHITE);
					urlItemTf.setBounds(470, debutCpUrl, 160, 22);
					panel_3.add(urlItemTf);

					//String message = "Item url " + i;

					JLabel iconEditupdateItem = new JLabel("");
					iconEditupdateItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					iconEditupdateItem.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/edit_icon.png")));
					iconEditupdateItem.setBounds(655, debutCpIconEditUpdate, 30, 30);
					panel_3.add(iconEditupdateItem);

					JLabel iconeDeleteItem = new JLabel("");
					iconeDeleteItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					iconeDeleteItem.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/delete_icon.png")));
					iconeDeleteItem.setBounds(704, debutCpIconeDelete, 30, 30);
					panel_3.add(iconeDeleteItem);

					etatUrlItemTf = new JTextField();
					etatUrlItemTf.setText("Site fiable");
					etatUrlItemTf.setForeground(new Color(112, 128, 144));
					etatUrlItemTf.setFont(new Font("Tahoma", Font.PLAIN, 14));
					etatUrlItemTf.setEditable(false);
					etatUrlItemTf.setColumns(10);
					etatUrlItemTf.setBorder(null);
					etatUrlItemTf.setBackground(Color.WHITE);
					etatUrlItemTf.setBounds(470, debutCpEtatUrl, 150, 22);
					panel_3.add(etatUrlItemTf);

					etatPasswordItemTf = new JTextField();
					etatPasswordItemTf.setText("Faible");
					etatPasswordItemTf.setForeground(new Color(112, 128, 144));
					etatPasswordItemTf.setFont(new Font("Tahoma", Font.PLAIN, 14));
					etatPasswordItemTf.setEditable(false);
					etatPasswordItemTf.setColumns(10);
					etatPasswordItemTf.setBorder(null);
					etatPasswordItemTf.setBackground(Color.WHITE);
					etatPasswordItemTf.setBounds(246, debutCpEtatPassword, 150, 22);
					panel_3.add(etatPasswordItemTf);

					nomCompletItemTf = new JTextField();
					nomCompletItemTf.setText(accountBean.getNameAccount());
					nomCompletItemTf.setForeground(new Color(112, 128, 144));
					nomCompletItemTf.setFont(new Font("Tahoma", Font.PLAIN, 14));
					nomCompletItemTf.setEditable(false);
					nomCompletItemTf.setColumns(10);
					nomCompletItemTf.setBorder(null);
					nomCompletItemTf.setBackground(Color.WHITE);
					nomCompletItemTf.setBounds(12, debutCpNomComplet, 211, 22);
					panel_3.add(nomCompletItemTf);

					JSeparator separatorItem = new JSeparator();
					separatorItem.setBounds(0, debutCpSeparator, 759, 7);
					panel_3.add(separatorItem);

					urlItemTf.addMouseListener(new MouseListener() {

						@Override
						public void mouseReleased(MouseEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void mousePressed(MouseEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void mouseEntered(MouseEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void mouseClicked(MouseEvent e) {
							//Utils.showErrorMessage(frame, message);

						}
					});
					
					iconEditupdateItem.addMouseListener(new MouseListener() {
						
						@Override
						public void mouseReleased(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseEntered(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							nomCompletEditTxtFld.setText(nomCompletItemTf.getText());
							usernameEditTxtFld.setText(usernameItemTf.getText());
							passwordEditTxtFld.setText(passwordItemTf.getText());
							urlEditTxtFld.setText(urlItemTf.getText());
							
							ajouterEditBtn.setText("Mettre à jour ");
							ajouterEditBtn.setActionCommand("majEditBtn");
							
							
						}
					});

					debutCpUsername = debutCpUsername + incrementNouvelleLigne;
					debutCpPassword = debutCpPassword + incrementNouvelleLigne;
					debutCpIconViewPassword = debutCpIconViewPassword + incrementNouvelleLigne;
					debutCpUrl = debutCpUrl + incrementNouvelleLigne;
					debutCpIconEditUpdate = debutCpIconEditUpdate + incrementNouvelleLigne;
					debutCpIconeDelete = debutCpIconeDelete + incrementNouvelleLigne;
					debutCpEtatUrl = debutCpEtatUrl + incrementNouvelleLigne;
					debutCpEtatPassword = debutCpEtatPassword + incrementNouvelleLigne;
					debutCpNomComplet = debutCpNomComplet + incrementNouvelleLigne;
					debutCpSeparator = debutCpSeparator + incrementNouvelleLigne;
				}else {
					System.out.println(accountBean.getCallDbFunctionBean().getMessageRetour());
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		panel_3.setPreferredSize(new Dimension(0, 1000));

		return panel_3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("ajouterEditBtn".equals(e.getActionCommand())) {
			ajoutDunNouveauCompte();
		}else if("majEditBtn".equals(e.getActionCommand())) {
			majDunCompteExistant();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel source = (JLabel) e.getSource();
		if (githubIconLbl == source) {
			Utils.openWebpage(Constants.URL_GITHUB);
		} else if (fbIconLbl == source) {
			Utils.openWebpage(Constants.URL_FACEBOOK);
		} else if (twitterIconLbl == source) {
			Utils.openWebpage(Constants.URL_TWITTER);
		} else if (disconnectLbl == source) {
			userDisconnect();
		}else if (iconViewOrHidePasswordEditLbl == source) {
			Utils.showOrHidePasswordTxtFields(passwordEditTxtFld, iconViewOrHidePasswordEditLbl, '*');
		
			//iconViewOrHidePasswordEditLbl.getIcon().toString();
		}
	}

	private void showOrHidePasswordTxtFields(JPasswordField passwordField) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	private void majDunCompteExistant() {
		// TODO Auto-generated method stub
		
		//Après la mise à jour d'un compte existant
		//Je rafraichis la fenetre d'affichage des items pour prendre en compte la modification
		//Je fais un set de ajouterEditBtn.setActionCommand("ajouterEditBtn");
		//Je fais un set de ajouterEditBtn.setText("Ajouter");
		//Je fais un set "" de tous les champs.
	}

	private void ajoutDunNouveauCompte() {
		// TODO Auto-generated method stub
		
		//Je fais un set "" de tous les champs après un ajout.
	}
	
	public void userDisconnect() {
		int retourUser = Utils.showConfirmDialog(frame,
				"Vous êtes sur le point de vous déconnecter, cliquez sur oui pour continuer !");
		if (retourUser == 0) {
			AuthenticationUI windowAuthUI = new AuthenticationUI();
			frame.dispose();
			windowAuthUI.frame.setVisible(true);
		}
	}
}
