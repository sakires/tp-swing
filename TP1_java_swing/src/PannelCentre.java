import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class PannelCentre extends JPanel{
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextField user;
	private JPasswordField pwd;
	private JComboBox<String> appli;
	
	public PannelCentre(){
		this.setLayout(new GridLayout(3,2));
		
		label1 = new JLabel("utilisateur : ");
		label2 = new JLabel("mot de passe : ");
		label3 = new JLabel("application : ");
		
		user = new JTextField();
		pwd = new JPasswordField();
		appli = new JComboBox<String>();
		//ajout menu deroulant
		appli.addItem("comptabilite");
		appli.addItem("paye");
		appli.addItem("Gestion de production");
		
		this.add(label1);
		this.add(user);
		this.add(label2);
		this.add(pwd);
		this.add(label3);
		this.add(appli);
	}
	
}
