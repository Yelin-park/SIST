package days26;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오전 10:38:59
 * @subject p644 Hashtable
 * @content		p647 예제11-31 참조해서 전체 총점, 전체 평균, 최고점, 최저점, 팀별 총점, 팀별 평균, 팀 최고점, 팀 최저점 등등 출력하기 -> 한 번 해보기
 */
public class Ex02 {

	public static void main(String[] args) {
		// Key = 팀명, value = 팀원들(ArrayList)
		Hashtable<String, ArrayList<Member>> ht = new Hashtable(); // 뒤에 있는 <String, ArrayList<Member>> 지워도 된다.
		
		ArrayList<String> tnList = new ArrayList(); // 팀명을 가지고 있는 리스트
		tnList.add("해조");
		tnList.add("돈조");
		tnList.add("놔조");
		
		ArrayList<Member> team1 = new ArrayList();
		team1.add(new Member("유재석", 90));
		team1.add(new Member("김기수", 78));
		team1.add(new Member("도경환", 66));
		
		ArrayList<Member> team2 = new ArrayList();
		team2.add(new Member("안정환", 89));
		team2.add(new Member("김숙", 99));
		// team2.add(new Member("마동석", 65));
		
		ArrayList<Member> team3 = new ArrayList();
		team3.add(new Member("손흥민", 65));
		team3.add(new Member("김태우", 28));
		team3.add(new Member("황의조", 65));
		
		//            key팀명   value 팀원들(ArrayList)
		ht.put(tnList.get(0), team1);
		ht.put(tnList.get(1), team2);
		ht.put(tnList.get(2), team3);
		/*
		 * 
		// [문제] 2팀의 팀원들 정보를 출력
		ArrayList<Member> list = ht.get("해조");
		Iterator<Member> ir = list.iterator();
		while (ir.hasNext()) {
			Member m = (Member) ir.next();
			System.out.println(m);
		}
		*/
		
		// [문제] 모든 조가 아래와 같이 출력
		// 1조 - 해조
		// 		Member [name=유재석]
		//		Member [name=김기수]
		// 		Member [name=도경환]
		
		// [문제점파악] 출력 팀의 순서가 맞지 않다. -> 나중에 다시 해결하기로!
		Set<Entry<String, ArrayList<Member>>> es = ht.entrySet();
		Iterator<Entry<String, ArrayList<Member>>> ir = es.iterator();
		int no = 1;
		while (ir.hasNext()) {
			Entry<String, ArrayList<Member>> entry = ir.next();
			String teamName = entry.getKey();
			ArrayList<Member> memberList = entry.getValue();
			System.out.printf("%d조 - %s(%d명)\n", no++, teamName, memberList.size());
			
			Iterator<Member> ir2 = memberList.iterator();
			while (ir2.hasNext()) {
				Member m = (Member) ir2.next();
				System.out.println("\t\t" + m);
			}
		} // while
		
	} // main

} // class

// 팀원의 정보 클래스
class Member {
	String name;
	int score;
	// String job; // 직급을 주는 변수 팀장, 팀원, 기술고문

	public Member(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", score=" + score + "]";
	}
	
} // Member class