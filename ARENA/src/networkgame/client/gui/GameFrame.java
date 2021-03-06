package networkgame.client.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import networkgame.interf.RemoteServerCom;

public class GameFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1342900243149570497L;
	
	private JPanel contentPane = new JPanel(new BorderLayout());
    private JPanel buttons = new JPanel(new BorderLayout());
    private JButton newGameButton = new JButton("New Game");
    private JButton quitButton = new JButton("Quit");
    private Color color = new Color(255, 51, 51);
    private GameBoard gameBoard = new GameBoard();
    private RemoteServerCom serverCom;
    
    public GameFrame(String title, RemoteServerCom serverCom) throws Exception {
    	super(title);
		this.serverCom = serverCom;
        setSize(500, 500);
        setVisible(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        buttons.add(newGameButton, BorderLayout.WEST);
        buttons.add(quitButton, BorderLayout.EAST);
        newGameButton.addActionListener(this);
        quitButton.addActionListener(this);

        contentPane.setBackground(color);
        contentPane.add(gameBoard, BorderLayout.CENTER);
        contentPane.add(buttons, BorderLayout.PAGE_END);
        add(contentPane);
    }
    
    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public void actionPerformed(ActionEvent e) {
	    String buttonName;
	
	    JButton button = (JButton) e.getSource();
	    buttonName = button.getText();
	    if (buttonName.equals("New Game")) {
			try {
				serverCom.resetGameGrid();
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        gameBoard.resetGameBoard();
	    } else {
	        System.exit(0);
	    }
    }
    
    public void setVisiblity(boolean visible) {
    	setVisible(visible);
    }
}
