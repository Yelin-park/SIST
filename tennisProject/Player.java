package tennisProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 선수 등록 및 출력
public class Player{ //implements disp
   String name;       // 이름
   boolean gender;   // 성별
   
   //static String path = "C:\\Users\\151ka\\OneDrive\\바탕 화면\\쌍용교육센터\\tennis.txt";
   static String path = "C:\\Users\\Yelin Park\\Desktop\\TenisProject.txt";


   public Player() {
      super();
   }

   public Player(String name, boolean gender) {   // 생성자
      this.name = name;
      this.gender = gender;
   } // 선수 입력

   
   public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getGender() {
		return gender;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public static void addSetScore() {
		
	}
	
	public static void addPlayer(String name, boolean gender) {                               // 선수 등록
	      try (FileWriter fw = new FileWriter(path, true);){
	         String pInfo = String.format("%s / %s", name, gender? "남":"여");
	         fw.write(pInfo+"\r\n");
	      } catch (IOException e) {
	      }
	}
	
	public static void addSetScore(int setScoreA, int setScoreB) {
		try (FileWriter fw = new FileWriter(path, true);) {
			String pInfo = String.format("[세트 스코어] %d\t%d", setScoreA, setScoreB);
			fw.write(pInfo + "\r\n");
		} catch (IOException e) {
		}
	}
	
	public static void addGaimScore(int gameScoreA, int gameScoreB) {
		try (FileWriter fw = new FileWriter(path, true);) {
			String pInfo = String.format("[게임 스코어] %d\t%d", gameScoreA, gameScoreB);
			fw.write(pInfo + "\r\n");
		} catch (IOException e) {
		}
	}
	
	public static void addPointScore(int pointScoreA, int pointScoreB) {
		try (FileWriter fw = new FileWriter(path, true);) {
			String pInfo = String.format("%d\t%d", pointScoreA, pointScoreB);
			fw.write(pInfo + "\r\n");
		} catch (IOException e) {
		}
	}

//   public void addPlayer() {                               // 선수 등록
//      try (FileWriter fw = new FileWriter(path, true);){
//         String pInfo = String.format("%s / %s", this.name, this.gender? "남":"여");
//         fw.write(pInfo+"\r\n");
//      } catch (IOException e) {
//      }
//
//   }
   
   /*
   public Player getPlayer(int cnt) {                         // 선수 호출
      try (FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);){
         String line;
         int n = 1;
         while( n++ < cnt ) br.readLine();
         line = br.readLine();
         String [] datas = line.split("/");
         name = datas[0];
         gender = datas[1].equals("남")? true : false;

         return new Player(name, gender);

      } catch (Exception e) {
         e.printStackTrace();
      }
      return null;
   }
*/

   public void dispScoreBoard() {                           // 전체 선수 출력
      try ( FileReader fr = new FileReader(path) ;
            BufferedReader br = new BufferedReader(fr);){
         String line;
         while( (line = br.readLine()) != null) {
            System.out.println( line );
         } // while

      } catch (IOException e1) {
      }

   }  // 메서드

} 
