package networkgame.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import networkgame.client.dialogs.MoveDialog;
import networkgame.client.dialogs.SetupGameDialog;
import networkgame.client.dialogs.WaitingDialog;
import networkgame.client.dialogs.WaitingForMoveDialog;
import networkgame.client.gui.GameBoard;
import networkgame.client.gui.GameFrame;
import networkgame.interf.Constant;
import networkgame.interf.RemoteClientCom;
import networkgame.interf.RemoteServerCom;

public class ClientCom extends UnicastRemoteObject implements RemoteClientCom {
	private static final long serialVersionUID = 7572721052589916852L;
	
    private RemoteServerCom serverCom;
	private MoveDialog moveDialog;
    private GameBoard gameBoard;
    private GameFrame gameFrame;
    private SetupGameDialog setupGameDialog;
    private WaitingDialog waitingDialog;
    private WaitingForMoveDialog waitingForMoveDialog;
    private int idTag;
    
    public ClientCom(Registry registry) throws RemoteException, NotBoundException {
		this.serverCom = (RemoteServerCom) registry.lookup(Constant.SERVERCOM_ID);
		setupGameDialog = null;
    	moveDialog = null;
    	gameBoard = null;
    	gameFrame = null;
    	waitingForMoveDialog = null;
    	waitingDialog = new WaitingDialog();
    }
    
    public void setSetupGameDialogToVisible() throws RemoteException {
    	if (setupGameDialog == null) {
    		setupGameDialog = new SetupGameDialog(serverCom);
    	}
    	setupGameDialog.setVisible(true);
    }
    
    public void setGameFrameToVisible() throws Exception {
    	if (gameFrame == null) {
    		if (idTag == 1) {
    			gameFrame = new GameFrame("Player 1", serverCom);
    		} else {
    			gameFrame = new GameFrame("Player 2", serverCom);
    		}
    	}
    	gameFrame.setVisible(true);
    }
    
    public void setGameBoardToVisible() {
    	if (gameBoard == null) {
    		gameBoard = gameFrame.getGameBoard();
    	}
    	gameBoard.setVisible(true);
    }
    
    public void updateGameBoard(int[][] gameGrid) {
    	if (gameBoard == null) {
    		System.out.println("gameboard = null");
    	}
    	gameBoard.updateBoard(gameGrid);
    }
    
    public int getGameBoardPlayerInput() throws InterruptedException {
    	System.out.println("Getting player input.");
    	return gameBoard.getPlayerInput();
    }
    
    public void showWinnerDialog(String playerName) {
    	if (moveDialog == null) {
    		moveDialog = new MoveDialog();
    	}
    	moveDialog.PaintWinningMoveDialog(playerName);
    }
    
    public void showDrawnDialog() {
    	if (moveDialog == null) {
    		moveDialog = new MoveDialog();
    	}
    	moveDialog.PaintDrawnMoveDialog();
    }
    
    public void showInvalidDialog(String invalid) {
    	if (moveDialog == null) {
    		moveDialog = new MoveDialog();
    	}
    	moveDialog.PaintInvalidMoveDialog(invalid);
    }
    
    public RemoteServerCom getServerCom(){
    	return serverCom;
    }
    
    public void setPlayer(int idTag) throws RemoteException {
    	if (setupGameDialog == null) {
    		setupGameDialog = new SetupGameDialog(serverCom);
    	}
    	this.idTag = idTag;
    	setupGameDialog.setIdTag(idTag);
    	setupGameDialog.constructSetupGameDialog(idTag);
    }
    
    public void displayWaitDialog() {
    	if (waitingDialog == null) {
    		waitingDialog = new WaitingDialog();
    	}
    	waitingDialog.setVisible(true);
    }
    
    public void disposeWaitDialog() {
    	waitingDialog.dispose();
    	waitingDialog = null;
    }
    
    public void displayWaitingForMoveDialog() {
    	if (waitingForMoveDialog == null) {
    		waitingForMoveDialog = new WaitingForMoveDialog();
    	}
    	waitingForMoveDialog.setVisible(true);
    }
    
    public void disposeWaitingForMoveDialog() {
    	waitingForMoveDialog.dispose();
    	waitingForMoveDialog = null;
    }
}