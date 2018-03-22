import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannelBoutton extends JPanel {
	private JButton valider;
	
	public PannelBoutton() {
		this.setLayout(new GridLayout(3,1));
		JLabel vide = new JLabel();
		valider = new JButton("valider");
		this.add(vide);
		this.add(valider);
		
	}
}
