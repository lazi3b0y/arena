package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class InstallGameDialog extends JDialog implements ActionListener {
	
	private JLabel nameLbl = new JLabel("Name", JLabel.TRAILING);
	private JLabel descriptionLbl = new JLabel("Description");
	private JLabel filePathLbl = new JLabel("File path");
	
	private JTextField nameTxt = new JTextField();
	private JTextArea descriptionTxt = getDescriptionTextArea();
	
	private JButton selectFileBtn = new JButton("select file");
	private JButton installBtn = new JButton("Install");
	
	private GridBagConstraints c = new GridBagConstraints();
	
	public InstallGameDialog() {
		setTitle("Install new game");
		setLayout(new GridBagLayout());
		setSize(200, 200);
		setResizable(false);
		setModal(true);
		setLocationRelativeTo(null);
		
		selectFileBtn.addActionListener(this);
		installBtn.addActionListener(this);
		
		addComponents();
		setVisible(true);
	}

	
	private JTextArea getDescriptionTextArea() {
		JTextArea descriptionText = new JTextArea();
		descriptionText.setLineWrap(true);
		descriptionText.setWrapStyleWord(true);
		return descriptionText;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == selectFileBtn) {
			final JFileChooser fc = new JFileChooser();
			int ret = fc.showOpenDialog(this);
			
			if (ret == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fc.getSelectedFile();
				
			}
		} else if (e.getSource() == installBtn) {
			System.out.println("install ye");
		}
		
	}
	
	private void addComponents() {
		c.fill = GridBagConstraints.WEST;
		c.weighty = 2;
		c.ipady = 5;
		c.weightx = 0;
	
		c.gridy = 0;
		
		add(nameLbl, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 1;
		
		add(nameTxt, c);
		
		c.fill = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 0.0;
		
		add(descriptionLbl, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.weightx = 0.0;
		
		add(descriptionTxt, c);
		
		c.fill = GridBagConstraints.WEST;
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 0.0;
		
		add(filePathLbl, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.weightx = 0.0;
		
		add(selectFileBtn, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridwidth = 3;
		c.gridy = 3;
		c.weightx = 0.0;
		
		add(installBtn, c);
	}

}
