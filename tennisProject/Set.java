package tennisProject;

public class Set implements Display, Winner {
	 
	int aSet;
	int bSet;
	
	public Set() {
		this.aSet = 0;
		this.bSet = 0;
		System.out.printf("SET\t│\t%d\t\t%d\n",aSet, bSet);
		System.out.println("───────────────────────────────────────────────────");
	} 

	@Override
	public int winnerWho(){
		Game game = new Game();
		int p=0;
		while (!((game.aGame >= 6 || game.bGame >= 6) && (Math.abs(game.aGame - game.bGame) >= 2))) {
			
			if(game.aGame == 6 && game.bGame == 6) { // Game6:6 상황
				
				p = game.tieBreak(); // 타이브레이크 진입
				game.pointWinner(p); // 타이브레이크에서 이긴 팀이 game에서 1점 득점 >7:6 or 6:7
				game.dispScoreBoard(); // [게임 스코어] 7:6 화면 출력
				
				return p; // 타이브레이크를 이기는 쪽이 바로 세트 승리
				
			}
			
			game.pointWinner(game.winnerWho());
			game.dispScoreBoard();
			
		}//while
		
		if(game.aGame > game.bGame) p = 1;
		else if (game.bGame > game.aGame) p =2;
		return p;
		
	}//winnerWho()


	@Override
	public void pointWinner(int p) {
		if (p == 1) aSet++;
		else if (p == 2) bSet++;
	}

	@Override
	public void dispScoreBoard() {
		System.out.printf("SET\t│\t%d\t\t%d\n",aSet, bSet);
		System.out.println("───────────────────────────────────────────────────");
		Player.addSetScore(aSet, bSet);
	}
	
	

}// Class
