package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import bean.UserBean;

import javax.swing.JLabel;

public class AdminUI {

	public JFrame frame;
	
	private JLabel userNameLbl;
	private JLabel userEmailLbl;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		userNameLbl = new JLabel("New label");
		userNameLbl.setBounds(56, 30, 316, 16);
		frame.getContentPane().add(userNameLbl);
		
		userEmailLbl = new JLabel("New label");
		userEmailLbl.setBounds(56, 81, 316, 16);
		frame.getContentPane().add(userEmailLbl);
	}
}
