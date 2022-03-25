package days26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오전 9:12:43
 * @subject p644 HashMap과 Hashtable 컬렉션 클래스
 * @content		HashMap과 Hashtable 설명
 *				1. Map 인터페이스를 구현한 컬렉션 클래스
 *				2. Entry = (key + value) 한쌍 -> 하나의 데이터로 저장
 *				3. Hashtable 보다 HashMap 사용을 권장, HashMap이 새로나온 버전
 *				4. Hash : 해싱을 사용하기 때문에 [많은 양의 데이터를 검색할 때] 성능이 뛰어나다.
 *				5. Vector(동O)와 ArrayList(동X) 관계와 비슷하다(동기화 처리 유무)
 *				6. Key 중복허용X, Value 중복허용O
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		// <T> : Type
		// <E> : Element 요소의 어떤 타입
		// <K, V> : Key의 타입, Value의 타입 설정하는 곳
		// Key : ID / Velue : 이름 
		// HashMap<String, String> hm = new HashMap<String, String>();
		HashMap<String, String> hm = new HashMap(); // 원칙은 위의 코딩, 앞에서 K,V 타입 설정하면 뒤에서는 설정해주지 않아도 됨
		
		hm.put("mae1217", "야리니");
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		
		// 키가 hong인 것을 찾아서 value(이름)을 "이동욱"으로 수정
		if (hm.containsKey("hong")) {
			// hm.put("hong", "이동욱");
			hm.replace("hong", "이동욱");
			System.out.println(hm.get("hong"));
		}
		System.out.println("=============================================");
		// key와 value 모두 일치해야 new value로 수정
		// hm.replace("hong", "홍길동", "이동욱");
		// System.out.println(hm.get("hong"));
		
		System.out.println(hm);
		System.out.println("=============================================");
		// 어떤 key 값을 삭제하는 메서드, 리턴값은 String이고 삭제한 entry의 value를 돌려줌
		if (hm.containsKey("hong")) {
			String a = hm.remove("hong");
			System.out.println(a);
		}
		System.out.println("=============================================");
		// entry = (key + value)[암기]
		Set<Entry<String, String>> es = hm.entrySet();
		Iterator<Entry<String, String>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String, String> entry = (Entry<String,String>) ir.next(); // Map.Entry -> Entry로 바꾸고, Stiring도 java.lang 지우기
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("Key : %s, Value : %s\n", key, value);
		}
		
		// [문제] 모든 value만 출력[암기]
		Collection<String> vc = hm.values();
		Iterator<String> ir2 = vc.iterator();
		while (ir.hasNext()) {
			String value = (String) ir2.next();
			System.out.printf("Value = %s\n", value);
		}
		
		// 모든 Key만 출력[암기]
		Set<String> ks = hm.keySet(); // keySet() 모든 키 값을 가져와 Set으로 반환해주는 메서드
		Iterator<String> ir3 = ks.iterator();
		while (ir.hasNext()) {
			String key = (String) ir3.next();
			String value = hm.get(key); // key 값에 해당하는 value 값을 가져오기
			System.out.printf("Key = %s,\tValue = %s\n", key, value);
		}
		System.out.println("=============================================");
		// hm.clear(); // 모든 엔트리(entry)를 삭제하는 메서드
		
		System.out.println(hm); // {admin=관리자, minini=익순이, mae1217=박예린} / admin=관리자 -> 하나의 엔트리(entry)
		System.out.println("=============================================");
		// hm.clone() // 복제하는 메서드
		
		String id = "admin";
		// id가 있는지 확인 후 그 id에 해당하는 name 출력
		// hm.containsKey(id); // key가 있는지 확인하는 메서드
		// hm.containsValue(id); // value가 있는지 확인하는 메서드

		if(hm.containsKey(id)) {
			String name = hm.get(id);
			System.out.printf("key(id) = %s, value(name) = %s\n", id, name);
		} else {
			System.out.println("찾고자 하는 key(id)는 존재하지 않습니다.");
		}
		System.out.println("=============================================");
		// key 중복허용X -> value가 바뀌어서 새로 저장
		hm.put("admin", "김태우"); 
		
		// value 중복허용O
		hm.put("angel1004", "야리니");
		
		// key, value - null
		hm.put(null, null); // null도 들어가짐
		hm.put(null, "널"); // null이라는 Key로 한 개의 value 값만 가짐
		System.out.println(hm);
		System.out.println("=============================================");
		
	} // main

} // class
