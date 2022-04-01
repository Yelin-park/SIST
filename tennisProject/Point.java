package tennisProject;


public class Point implements Display, Winner {
	
	//field
	int aScore;
	int bScore;
	String[] scores = {"0","15","30","40","40AD","WIN"};
	
	//default constructor
	public Point() {
		this.aScore = 0;
		this.bScore = 0;
		System.out.printf("Point\t│\t%d\t\t%d\n\n",aScore, bScore);
	}
	
	//method
	@Override
	public int winnerWho(){ // 게임을 진행하고자 할 때 어떤 키를 누르면 p가 1이나 2로 초기화 되어 누군가 이기는 상황
		return (int)(Math.random()*2) + 1;
	}
	
	@Override
	public void pointWinner(int p) {
		if (p == 1) {
			if(aScore >= 3) {
				if (aScore > bScore) {
					aScore = 5;
				} else { 
					aScore = 4;
					bScore = 3;
				}
			} else {
				aScore++;
			}
		} else if (p == 2) {
			if(bScore >= 3) {
				if (bScore > aScore) {
					bScore = 5;
				} else { 
					bScore = 4;
					aScore = 3;
				}
			} else {
				bScore++;
			}
		}
	}
	
	@Override
	public void dispScoreBoard() {
		System.out.printf("\t│\t%s\t\t%s\n", scores[aScore], scores[bScore]);
		Player.addPointScore(aScore, bScore);
	}
	
	// 타이브레이크 상황에서 점수를 얻는 메소드
	public void pointWinnerTieBreak(int p) {
		if (p == 1) aScore++;
		else if (p == 2) bScore++;
	}
	
	// 타이브레이크 상황에서 점수를 0~7까지 표시하는 메소드
	public void dispTieBreak() {
		System.out.printf("\t│\t%d\t\t%d\n",aScore, bScore);
		Player.addPointScore(aScore, bScore);
		
	}
	
}


