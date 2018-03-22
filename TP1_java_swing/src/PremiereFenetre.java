import javax.swing.JFrame;

public class PremiereFenetre extends JFrame {

	public PremiereFenetre(){
		this.setTitle("Premiere fenetre");
		this.setSize(600,250);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.getContentPane().add(new Pannel());
		this.setVisible(true);	
	}
}


