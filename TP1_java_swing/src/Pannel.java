import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pannel extends JPanel {
	private JLabel veuillez;
	private JButton valider;
	private JLabel login;
	private PannelCentre centre;
	private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date date = new Date();
	public Pannel (){
		this.setLayout(new BorderLayout());
		this.veuillez = new JLabel("<html><u>Veuillez saisir vos informations de login</u></html>");
		veuillez.setHorizontalAlignment(JLabel.CENTER);
		this.valider = new JButton("Valider");
		valider.setSize(30,30);
		
		this.login = new JLabel("login de <xxxx> pour application "+ date);
		login.setHorizontalAlignment(JLabel.CENTER);
		this.centre = new PannelCentre();
		
		this.add(veuillez, BorderLayout.NORTH);
		this.add(valider, BorderLayout.EAST);
		this.add(login, BorderLayout.SOUTH);
		this.add(centre, BorderLayout.CENTER);
		
	}
}
