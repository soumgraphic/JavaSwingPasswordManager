package ui.test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import utils.Utils;

public class UIEnd extends JFrame {
	
	public UIEnd() {
		addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent we) {
	            System.exit(0);
	         }
	      });
		
	  
	      JPanel panel = createPanel();
	  
	      JScrollPane sp = new JScrollPane();
	      sp.setViewportView(panel);
	  
	      getContentPane().setLayout(new BorderLayout());
	      getContentPane().add(sp, BorderLayout.CENTER);
	}
	
	public JPanel createPanel() {
		
		JPanel panelTxt = new JPanel();
		panelTxt.setLayout(null);
		
		int j = 17;
	    int z = 28;

	    for (int i = 0; i < 50; i++) {
	    	
	    		JLabel lblNewLabel = new JLabel("New label " + i);
		    lblNewLabel.setBounds(6, j, 100, 16);
		    
		    JTextField textField = new JTextField();
		    textField.setBounds(160, j, 270, 16);
		    textField.setColumns(10);

		    panelTxt.add(lblNewLabel);
		    panelTxt.add(textField);
	        
	        j = j + z;
	    }
	    
	    /*
	    JPanel panel = new JPanel();
	    panel.setLayout(null);
	    panel.add(panelTxt);
	    
	    JTextField txtLol = new JTextField();
	    txtLol.setText("Lol");
	    txtLol.setBounds(118, 17, 270, 16);
	    txtLol.setColumns(10);
	    panel.add(txtLol);
	    
	    panel.setPreferredSize(new Dimension(500, 800));
	    
	    JLabel lblNewLabel = new JLabel("New label ");
	    lblNewLabel.setBounds(6, 17, 100, 16);
	    panel.add(lblNewLabel);
	    
	    */
	    panelTxt.setPreferredSize(new Dimension(380, 700));
	    
		return panelTxt;
	}
	
	public static void main(String []args) {
		UIEnd main = new UIEnd();
	    main.setSize(500, 800);
	    main.setVisible(true);
	}
	
}
