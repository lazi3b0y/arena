package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import application.AdvertisementsController;

public class DefineAdvSchemeDialog extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	public DefineAdvSchemeDialog(AdvertisementsController advController) {
		setTitle("Define Advertisement Scheme");
		setSize(400, 200);
		setResizable(false);
		setModal(true);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
