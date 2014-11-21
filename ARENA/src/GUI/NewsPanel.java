package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewsPanel extends JPanel{
	JLabel headline, news1, news2, news3;
	
	public NewsPanel() {
		setLayout(null);
		headline = new JLabel("Incomming updates:");
		headline.setBounds(20,20,200,25);
		add(headline);
		
		news1 = new JLabel("-Ingame shop coming soon to ARENA");
		news1.setBounds(20, 45, 350, 25);
		add(news1);
		
		news2 = new JLabel("-FourInRow coming soon to ARENA");
		news2.setBounds(20, 70, 350, 25);
		add(news2);
		
		news3 = new JLabel("-Sign up now for the upcoming FourInRow tournament. Starts November 27. Ends November 30.");
		news3.setBounds(20, 95, 550, 25);
		add(news3);
		
		
		
	}
}