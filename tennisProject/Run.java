package tennisProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Run {
	
	   public static void main(String[] args) throws IOException {
		   Scanner sc = new Scanner(System.in);
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      kindRule kr = new kindRule();

		      // 게임 종류를 묻고 게임 종류에 따라 규칙에 맞는 player 입력받기
		      char con;
		      do {
		         int gameselect;    // 단식, 복식, 혼합 복식 결정하기위한 변수
		         int setCnt;        // 세트 수 결정하기위한 변수
		         String sGame = null;  // 단,복,혼의 유효성 검사를 위한 스트링객체 생성
		         String setNum = null;  // 세트 수 유효성 검사를 위한 스트링객체 생성
		         boolean check = false;
		         String regex = "[0-2]"; 

		         do {
		             System.out.println(">>> 테니스 게임을 시작합니다. 게임 종류를 선택하세요.\n  단식(0), 복식(1), 혼합복식(2) <<<");
		             sGame = sc.next();
		             if(!sGame.matches(regex))  System.out.println("[알림] 잘못 입력했습니다. 0~2 값을 입력하세요");
		         }while(!sGame.matches(regex));
		         
		          do {
		             System.out.print(">>> 세트 수( 3set(1) / 5set(2) ) 정해주세요. ");
		             setNum = sc.next();
		             if(!setNum.matches("[1-2]"))  System.out.println("[알림] 잘못 입력했습니다. 1~2 값을 입력하세요");
		          } while (!setNum.matches("[1-2]"));
		         setCnt = Integer.parseInt(setNum) + 1;

		         gameselect = Integer.parseInt(sGame);
		         String[] gameArr = {"단식", "복식", "혼합복식"};
		         System.out.println("> [" + gameArr[gameselect] + "] 게임을 진행합니다!!!");

		         // 플레이어 입력 받는 코딩
		         // 단식일 경우 동성 2명, 복식일 경우 동성 4명, 혼합복식일 경우 남2, 여2
		         String [] name = new String[4];
		         boolean [] gender = new boolean[4];
		         String [] team = new String[1];

		         if(gameselect == 0) team = kr.singleGame(); // 단식게임 - 동성 2명
		         else if(gameselect == 1) team = kr.doublesGame(); // 복식게임 - 동성 4명
		         else if(gameselect == 2) team = kr.mixedDoubles(); // 혼합복식게임 - 한 팀에 남,여로 구성

		         // System.out.println("--------------------------------------------------");
		         System.out.println("───────────────────────────────────────────────────");
		         System.out.println("\t\tA팀\t\tB팀");
		         System.out.printf("\t\t%s\t\t%s\n\t\t%s\t\t%s\n",team[0],team[1],team[2] == null? "": team[2],team[3]== null? "": team[3]);
		         System.out.println("───────────────────────────────────────────────────");
		         // 게임 진행 후 결과 출력하는 코딩
		         Set set = new Set();		         
		         
		         while (!(set.aSet == setCnt || set.bSet == setCnt)) {
		            set.pointWinner(set.winnerWho());
		            set.dispScoreBoard();
		         } // while
		         
		         System.out.println("> 테니스 게임을 다시하시겠습니까?(Y/N)"); // N 값은 유효성 검사 안함
		         con = sc.next().charAt(0);

		      } while (Character.toUpperCase(con) == 'Y');

		      System.out.println("> 게임을 종료합니다.");
		      System.exit(-1);

		   } // main

		} // class
//
