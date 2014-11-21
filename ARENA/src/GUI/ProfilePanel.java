package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProfilePanel extends JPanel{
	JLabel profile, nickname, wins, losses, winLoseRatio, ranking;
	
	public ProfilePanel(){
		setLayout(null);
		profile = new JLabel("Profile:");
		profile.setBounds(20,20,200,15);
		add(profile);
		
		nickname = new JLabel("Nickname: BertiL^"/*nickname.GetNickname();*/);
		nickname.setBounds(20,35,150,15);
		add(nickname);
		
		ranking = new JLabel("Ranking: BästIVerden"/*ranking.GetRank();*/);
		ranking.setBounds(20, 50, 150, 15);
		add(ranking);
		
		wins = new JLabel("Wins: 13"/*wins.GetWins();*/);
		wins.setBounds(20, 65, 100, 15);
		add(wins);
		
		losses = new JLabel("Losses: 13"/*losses.GetLosses();*/);
		losses.setBounds(20, 80, 100, 15);
		add(losses);
		
		winLoseRatio = new JLabel("W/L-Ratio: 0"/*winLoseRatio.GetWLRatio();*/);
		winLoseRatio.setBounds(20, 95, 100, 15);
		add(winLoseRatio);
		
		
	}
	
	
}
