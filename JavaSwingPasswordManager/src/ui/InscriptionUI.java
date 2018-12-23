package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.text.Utilities;

import bean.UserBean;
import dao.UserDaoImpl;
import utils.Constants;
import utils.Utils;

import javax.naming.Context;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Cursor;

public class InscriptionUI extends JFrame implements ActionListener{

	public JFrame frame;
	private JTextField nameTxtfield;
	private JTextField emailTxtfield;
	private JPasswordField passwordTxtfield;
	private JRadioButton notRobotRdBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InscriptionUI window = new InscriptionUI();
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
	public InscriptionUI() {
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
		label.setIcon(new ImageIcon(InscriptionUI.class.getResource("/ui/images/pm_logo.png")));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(141, 125, 133, 145);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setBounds(0, 0, 395, 478);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stocker et garder vos mots de passe en sécurité");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(51, 36, 320, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblEnterYourDetails = new JLabel("Renseignez vos coordonnées");
		lblEnterYourDetails.setForeground(Color.WHITE);
		lblEnterYourDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnterYourDetails.setBounds(51, 64, 282, 31);
		panel_1.add(lblEnterYourDetails);
		
		nameTxtfield = new JTextField();
		nameTxtfield.setCaretColor(new Color(255, 255, 255));
		nameTxtfield.setBorder(null);
		nameTxtfield.setBackground(new Color(60, 179, 113));
		nameTxtfield.setForeground(new Color(255, 255, 255));
		nameTxtfield.setFont(new Font("Tahoma", Font.BOLD, 12));
		nameTxtfield.setBounds(51, 146, 320, 16);
		panel_1.add(nameTxtfield);
		nameTxtfield.setColumns(10);
		
		JLabel lblName = new JLabel("Nom");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(51, 118, 282, 16);
		panel_1.add(lblName);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(51, 163, 320, 12);
		panel_1.add(separator);
		
		notRobotRdBtn = new JRadioButton("Je ne suis pas un robot");
		notRobotRdBtn.setBorder(null);
		notRobotRdBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		notRobotRdBtn.setBackground(new Color(60, 179, 113));
		notRobotRdBtn.setForeground(new Color(255, 255, 255));
		notRobotRdBtn.setBounds(51, 325, 208, 23);
		panel_1.add(notRobotRdBtn);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(51, 232, 320, 12);
		panel_1.add(separator_1);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(51, 187, 282, 16);
		panel_1.add(lblEmail);
		
		emailTxtfield = new JTextField();
		emailTxtfield.setCaretColor(new Color(255, 255, 255));
		emailTxtfield.setForeground(Color.WHITE);
		emailTxtfield.setFont(new Font("Tahoma", Font.BOLD, 12));
		emailTxtfield.setColumns(10);
		emailTxtfield.setBorder(null);
		emailTxtfield.setBackground(new Color(60, 179, 113));
		emailTxtfield.setBounds(51, 215, 320, 16);
		panel_1.add(emailTxtfield);
		
		JLabel lblPassword = new JLabel("Mot de passe");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(51, 256, 282, 16);
		panel_1.add(lblPassword);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBackground(Color.WHITE);
		separator_2.setBounds(51, 301, 320, 12);
		panel_1.add(separator_2);
		
		passwordTxtfield = new JPasswordField();
		passwordTxtfield.setBorder(null);
		passwordTxtfield.setCaretColor(new Color(255, 255, 255));
		passwordTxtfield.setBackground(new Color(60, 179, 113));
		passwordTxtfield.setForeground(new Color(255, 255, 255));
		passwordTxtfield.setFont(new Font("Tahoma", Font.BOLD, 12));
		passwordTxtfield.setBounds(51, 284, 320, 16);
		panel_1.add(passwordTxtfield);
		
		JButton inscriptionBtn = new JButton("C'est parti !");
		inscriptionBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		inscriptionBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		inscriptionBtn.setForeground(new Color(255, 255, 255));
		inscriptionBtn.setContentAreaFilled(false);
		inscriptionBtn.setFocusPainted(false);
		inscriptionBtn.setBorder(new LineBorder(new Color(255, 255, 255)));
		inscriptionBtn.setBounds(51, 369, 320, 40);
		inscriptionBtn.setActionCommand("inscriptionBtn");
		inscriptionBtn.addActionListener(this);
		panel_1.add(inscriptionBtn);
		
		JButton goToConnexionBtn = new JButton("<html>\nVous avez déjà un compte ? <u>Connexion</u>\n</html>");
		goToConnexionBtn.setOpaque(false);
		goToConnexionBtn.setContentAreaFilled(false);
		goToConnexionBtn.setBorderPainted(false);
		goToConnexionBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		goToConnexionBtn.setForeground(Color.WHITE);
		goToConnexionBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		goToConnexionBtn.setBorder(null);
		goToConnexionBtn.setBounds(51, 421, 320, 21);
		goToConnexionBtn.setActionCommand("goToConnexionBtn");
		goToConnexionBtn.addActionListener(this);
		panel_1.add(goToConnexionBtn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("inscriptionBtn".equals(e.getActionCommand())) {
			inscription();
		}else if("goToConnexionBtn".equals(e.getActionCommand())) {
			backToConnexionWdw();
		}
	}
	
	private void inscription() {
		String nameUser = nameTxtfield.getText().toString();
		String emailUser = emailTxtfield.getText().toString();
		String pwdUser = passwordTxtfield.getText().toString();
		
		if (verificationNulliteEtTailleDesChamps(nameUser, emailUser, pwdUser)) {
			try {
				
				UserDaoImpl daoImpl = new UserDaoImpl();
				UserBean userBean = new UserBean(nameUser, emailUser, pwdUser);
				userBean = daoImpl.insertUser(userBean);
				if ((userBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY) && (userBean.getCallDbFunctionBean().isErrorRetour() == false)) {
					nameTxtfield.setText("");
					emailTxtfield.setText("");
					passwordTxtfield.setText("");
					
					AdminUI adminUI = new AdminUI(userBean);
					frame.dispose();
					adminUI.frame.setVisible(true);
				}else if((userBean.getCallDbFunctionBean().getCodeRetour() == Constants.EMAIL_EXIST) && (userBean.getCallDbFunctionBean().isErrorRetour() == true)) {
					Utils.showErrorMessage(frame, userBean.getCallDbFunctionBean().getMessageRetour());
				}else if((userBean.getCallDbFunctionBean().getCodeRetour() == Constants.UNKNOW_ERROR) && (userBean.getCallDbFunctionBean().isErrorRetour() == true)) {
					Utils.showErrorMessage(frame, userBean.getCallDbFunctionBean().getMessageRetour());
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	private boolean verificationNulliteEtTailleDesChamps(String nameUser, String emailUser, String pwdUser) {
		if ((!Utils.isNullOrEmpty(nameUser) && (!Utils.isNullOrEmpty(emailUser) && (!Utils.isNullOrEmpty(pwdUser) )))) {
			if (Utils.checkStringMinLength(nameUser, 2)) {
				if (Utils.validateEmail(emailUser)) {
					if (Utils.checkStringMinLength(pwdUser, 6)) {
						if (notRobotRdBtn.isSelected()) {
							return true;
						}else {
							Utils.showErrorMessage(frame, "Etes vous un robot ? selectionnez ci dessous si vous ne l'êtes pas !");
							return false;
						}
					}else {
						Utils.showErrorMessage(frame, "Le mot de passe doit être au minimum six caractères");
						return false;
					}
				}else {
					Utils.showErrorMessage(frame, "Veuillez saisir un adresse email valide !");
					return false;
				}
				
			}else {
				Utils.showErrorMessage(frame, "Le nom doit être au minimum deux caractères");
				return false;
			}
			
		}else {
			Utils.showErrorMessage(frame, "Veuillez remplir tous les champs !");
			return false;
		}
	}
	
	private void backToConnexionWdw() {
		AuthenticationUI windowAuthUI = new AuthenticationUI();
		frame.dispose();
		windowAuthUI.frame.setVisible(true);
	}
	
	
}
