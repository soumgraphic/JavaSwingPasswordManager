package ui.test;

import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
  
public class UITest2 extends JFrame
{
   public UITest2() {
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
      JLabel titleLbl      = new JLabel("Title");
      JLabel firstNameLbl  = new JLabel("First name");
      JLabel lastNameLbl   = new JLabel("Last name");
      JLabel addressLbl    = new JLabel("Address");
      JLabel cityLbl       = new JLabel("City");
      JLabel zipLbl        = new JLabel("Postal code");
      JLabel countryLbl    = new JLabel("Country");
      JLabel phoneLbl      = new JLabel("Phone number");
      JLabel faxLbl        = new JLabel("Fax number");
      JLabel emailLbl      = new JLabel("E-mail");
      JLabel birthdayLbl   = new JLabel("Birthdate");
      JLabel pickchoiceLbl = new JLabel("Pick a choice");
      JLabel creditCardTypeLbl     = new JLabel("Credit card type");
      JLabel creditCardNumberLbl   = new JLabel("Credit card number");
      JLabel expirationLbl         = new JLabel("Expiration date");
  
      JComboBox titleCombo = new JComboBox(
             new String[] { "-", "Mr", "Mrs", "Miss" });
      JTextField firstNameTf    = new JTextField();
      JTextField lastNameTf     = new JTextField();
      JTextField address1Tf     = new JTextField();
      JTextField address2Tf     = new JTextField();
      JTextField cityTf         = new JTextField();
      JTextField zipTf          = new JTextField();
      JTextField countryTf      = new JTextField();
      JTextField phoneTf        = new JTextField();
      JTextField faxTf          = new JTextField();
      JTextField emailTf        = new JTextField();
      JComboBox bd1Combo = new JComboBox();
      for (int i=1; i<=12; i++) bd1Combo.addItem(""+i);
      JComboBox bd2Combo = new JComboBox();
      for (int i=1; i<=31; i++) bd2Combo.addItem(""+i);
      JComboBox bd3Combo = new JComboBox();
      for (int i=1900; i<2000; i++) bd3Combo.addItem(""+i);
      JComboBox referCombo = new JComboBox();
      referCombo.addItem("Friend");
      referCombo.addItem("Search engine");
      referCombo.addItem("Print Media");
      referCombo.addItem("Banner Add");
      referCombo.addItem("Other");
      JComboBox creditCardTypeCombo = new JComboBox();
      creditCardTypeCombo.addItem("VISA");
      creditCardTypeCombo.addItem("MasterCard");
      creditCardTypeCombo.addItem("American Express");
      JTextField creditCardNumberTf = new JTextField();
      JComboBox expiration1Combo = new JComboBox();
      for (int i=1; i<=12; i++) expiration1Combo.addItem(""+i);
      JComboBox expiration2Combo = new JComboBox();
      for (int i=1; i<=31; i++) expiration2Combo.addItem(""+i);
      JComboBox expiration3Combo = new JComboBox();
      for (int i=1900; i<=2000; i++) expiration3Combo.addItem(""+i);
  
      JPanel panelGeneral = new JPanel();
      panelGeneral.setLayout(null);
      panelGeneral.add(titleLbl);
      panelGeneral.setBorder(new TitledBorder("General Information"));
      titleLbl.setBounds(20, 20, 150, 20);
      panelGeneral.add(firstNameLbl);
      firstNameLbl.setBounds(20, 50, 150, 20);
      panelGeneral.add(lastNameLbl);
      lastNameLbl.setBounds(20, 80, 150, 20);
      panelGeneral.add(addressLbl);
      addressLbl.setBounds(20, 110, 150, 20);
      panelGeneral.add(cityLbl);
      cityLbl.setBounds(20, 170, 150, 20);
      panelGeneral.add(zipLbl);
      zipLbl.setBounds(20, 200, 150, 20);
      panelGeneral.add(countryLbl);
      countryLbl.setBounds(20, 230, 150, 20);
      panelGeneral.add(phoneLbl);
      phoneLbl.setBounds(20, 260, 150, 20);
      panelGeneral.add(faxLbl);
      faxLbl.setBounds(20, 290, 150, 20);
      panelGeneral.add(emailLbl);
      emailLbl.setBounds(20, 320, 150, 20);
      panelGeneral.add(birthdayLbl);
      birthdayLbl.setBounds(20, 350, 150, 20);
      panelGeneral.add(titleCombo);
      titleCombo.setBounds(150, 20, 60, 20);
      panelGeneral.add(firstNameTf);
      firstNameTf.setBounds(150, 50, 200, 20);
      panelGeneral.add(lastNameTf);
      lastNameTf.setBounds(150, 80, 200, 20);
      panelGeneral.add(address1Tf);
      address1Tf.setBounds(150, 110, 200, 20); 
      panelGeneral.add(address2Tf);
      address2Tf.setBounds(150, 140, 200, 20); 
      panelGeneral.add(cityTf);
      cityTf.setBounds(150, 170, 200, 20);
      panelGeneral.add(zipTf);
      zipTf.setBounds(150, 200, 200, 20);
      panelGeneral.add(countryTf);
      countryTf.setBounds(150, 230, 200, 20);
      panelGeneral.add(phoneTf);
      phoneTf.setBounds(150, 260, 200, 20);
      panelGeneral.add(faxTf);
      faxTf.setBounds(150, 290, 200, 20);
      panelGeneral.add(emailTf);
      emailTf.setBounds(150, 320, 200, 20);
      panelGeneral.add(bd1Combo);
      bd1Combo.setBounds(150, 350, 60, 20);
      panelGeneral.add(bd2Combo);
      bd2Combo.setBounds(220, 350, 60, 20);
      panelGeneral.add(bd3Combo);
      bd3Combo.setBounds(290, 350, 60, 20);
  
      JPanel panelReferral = new JPanel();
      panelReferral.setLayout(null);
      panelReferral.setBorder(new TitledBorder("Where did you hear about us?"));
      panelReferral.add(pickchoiceLbl);
      pickchoiceLbl.setBounds(20, 20, 150, 20);
      panelReferral.add(referCombo);
      referCombo.setBounds(150, 20, 100, 20);
  
      JPanel panelCreditCard = new JPanel();
      panelCreditCard.setLayout(null);
      panelCreditCard.setBorder(new TitledBorder("Payment method"));
      panelCreditCard.add(creditCardTypeLbl);
      creditCardTypeLbl.setBounds(20, 20, 150, 20);
      panelCreditCard.add(creditCardNumberLbl);
      creditCardNumberLbl.setBounds(20, 50, 150, 20);
      panelCreditCard.add(expirationLbl);
      expirationLbl.setBounds(20, 80, 150, 20);
  
      panelCreditCard.add(creditCardTypeCombo);
      creditCardTypeCombo.setBounds(150, 20, 100, 20);
      panelCreditCard.add(creditCardNumberTf);
      creditCardNumberTf.setBounds(150, 50, 150, 20);
      panelCreditCard.add(expiration2Combo);
      expiration2Combo.setBounds(220, 80, 60, 20);
      panelCreditCard.add(expiration3Combo);
      expiration3Combo.setBounds(290, 80, 60, 20);
  
      JPanel panel = new JPanel();
      panel.setLayout(null);
      panel.add(panelGeneral);
      panelGeneral.setBounds(10, 20, 370, 400);
      panel.add(panelReferral);
      panelReferral.setBounds(10, 430, 370, 50);
      panel.add(panelCreditCard);
      panelCreditCard.setBounds(10, 490, 370, 120);
       
      panel.setPreferredSize(new Dimension(380, 620));
  
      return panel;
   }
  
   public static void main(String []args) {
      UITest2 main = new UITest2();
      main.setSize(400, 400);
      main.setVisible(true);
   }
}
