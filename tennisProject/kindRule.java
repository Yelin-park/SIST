package tennisProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kindRule {
   // 필드
   String [] name = new String[4];
   String [] team = new String[2];
   boolean [] gender = new boolean[4];
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   // 생성자
   
   // 메서드
   // 단식
   public String[] singleGame() throws IOException {
      do {
         for (int i = 0; i < 2; i++) {
            System.out.printf("> Player %d 이름, 성별을 입력하세요. (입력형식 : 이름,성별(0남/1여))\n", i+1);
            String data = br.readLine();
            String[] dataArray = data.split(",");
            name[i] = dataArray[0].trim();
            gender[i] = dataArray[1].trim().equals("0") ? true : false; 

         } // for i

         if(gender[0] != gender[1]) 
            System.out.println("[알림] 혼성으로 단식 게임을 진행할 수 없습니다. 같은 성별의 선수로 구성해주세요.");

      } while (gender[0] != gender[1]);

      // 선수 구성 규칙을 어기지 않았을 때 파일로 쓰고 저장!
      for (int i = 0; i < 2; i++) Player.addPlayer(name[i], gender[i]);
      return name;
   }
   // 복식
   public String [] doublesGame() throws IOException {
      do {
         for (int i = 0; i < 4; i++) {
            System.out.printf("> Player %d 이름, 성별을 입력하세요. (입력형식 : 이름,성별(0남/1여))\n", i+1);
            String data = br.readLine();
            String[] dataArray = data.split(",");
            name[i] = dataArray[0].trim();
            gender[i] = dataArray[1].trim().equals("0")  ? true : false;
         } // for i

         if( gender[0] != gender[1] || gender[1] != gender[2] || gender[2] != gender[3] ) {
            System.out.println("[알림] 혼성으로 복식게임을 진행할 수 없습니다.\n   각 팀 모두 같은 성별의 선수로 구성해 주세요.");
         } // if
      } while ( gender[0] != gender[1] || gender[1] != gender[2] || gender[2] != gender[3] );   

      // 선수 구성 규칙을 어기지 않았을 때 파일로 쓰고 저장!
      for (int i = 0; i < 4; i++) Player.addPlayer(name[i], gender[i]);
      return name;
   }
   // 혼합복식
   public String[] mixedDoubles() throws IOException {
      do {
         for (int i = 0; i < 4; i++) {
            System.out.printf("> Player %d 이름, 성별을 입력하세요. (입력형식 : 이름,성별(0남/1여))\n", i+1);
            String data = br.readLine();
            String[] dataArray = data.split(",");
            name[i] = dataArray[0].trim();
            gender[i] = dataArray[1].trim().equals("0") ? true : false;

         } // for i

         // 각 팀 중 하나의 팀이라도 성별이 같으면 게임 진행X
         if( gender[0] == gender[1] || gender[2] == gender[3] ) System.out.println("[알림] 동성으로 혼성복식게임을 진행할 수 없습니다. 각 팀의 성별을 다르게 구성해주세요.");

      } while (gender[0] == gender[1] || gender[2] == gender[3]);

      // 선수 구성 규칙을 어기지 않았을 때 파일로 쓰고 저장!
      for (int i = 0; i < 4; i++) Player.addPlayer(name[i], gender[i]);
      return name;
   }
   
}