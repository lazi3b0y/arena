package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private ImageIcon adImage, adBubble;
	private JLabel labelAd, labelBubble;
	
	public AdPanel(){
		adImage = new ImageIcon("src/GUI/ads2.0.png");
		labelAd = new JLabel(adImage);
		labelAd.setBounds(0, 0, 200, 450);
		add(labelAd);
		}
}
