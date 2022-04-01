package tennisProject;

import java.io.IOException;

public class Game implements Display, Winner {
	
	int aGame;
	int bGame;
	
	public Game() {
		aGame = 0;
		bGame = 0;
        System.out.printf("GAME\t│\t%d\t\t%d\n", aGame, bGame);
        System.out.println("--------------------------------------------------");
	}

	@Override
	public int winnerWho(){
		Point point = new Point();
		int p=0;
		while (!(point.aScore == 5 || point.bScore == 5)) {
			
			point.pointWinner(point.winnerWho());
			point.dispScoreBoard();
			
			try {
				System.in.read();
				System.in.skip(System.in.available());
			} catch (IOException e) {
				e.printStackTrace();
			}//try
			
		}//while
		if(point.aScore == 5) p = 1;
		else if (point.bScore == 5) p =2;
		return p;
	}//winnerWho()
	
	// 타이브레이크 Game 진입하는 메소드
	public int tieBreak() {
		Point point = new Point();
		int p=0;
		while (!((point.aScore >= 7 || point.bScore >= 7) && (Math.abs(point.aScore - point.bScore) >= 2))) {
			
			point.pointWinnerTieBreak(point.winnerWho());
			point.dispTieBreak();
			
			try {
				System.in.read();
				System.in.skip(System.in.available());
			} catch (IOException e) {
				e.printStackTrace();
			}//try
			
		}//while
		
		if(point.aScore > point.bScore) p = 1;
		else if (point.bScore > point.aScore) p =2;
		return p;
	}

	@Override
	public void pointWinner(int p) {
		if (p == 1) aGame++;
		else if (p == 2) bGame++;
	}

	@Override
	public void dispScoreBoard() {
		System.out.println("───────────────────────────────────────────────────");
        System.out.printf("GAME\t│\t%d\t\t%d\n", aGame, bGame);
        System.out.println("───────────────────────────────────────────────────");
		Player.addGaimScore(aGame, bGame);
	}

}
