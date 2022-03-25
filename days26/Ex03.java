package days26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오전 11:45:57
 * @subject p648 예제11-32
 * @content 예제는 이름 같아도 연락처 다르면 추가 가능함, 강사님은 이름 같으면 추가 X
 */
public class Ex03 {
	//		key 그룹이름     value -> hashMap(그룹) 	key 이름	 value 연락처(이름이 같으면 연락처 추가가 안되게 하기)
	static HashMap<String, HashMap<String, String>> phoneBook = new HashMap<>();
	
	public static void main(String[] args) {
		String groupName, name, tel;
		
		addPhoneNo( "친구","이자바","010-1111-1111" );
	    addPhoneNo( "친구","김자바","010-2222-2222" );
	    addPhoneNo( "친구","김자바","010-3333-3333" );
	    addPhoneNo( "회사","이대리","010-4444-4444" );
	    addPhoneNo( "회사","김대리","010-5555-5555" );
	    addPhoneNo( "회사","박대리","010-6666-6666" );
	    addPhoneNo( "동아리","김동아","010-7777-7777" );
	    addPhoneNo( null, "세탁소","010-8888-8888" );
	    addPhoneNo( null, "PC방","010-9999-8888" );

	    printList();
	    
	} // main

	private static void printList() {
		Set<Entry<String, HashMap<String, String>>> es = phoneBook.entrySet(); // key, value 값을 가져오겠다.
		Iterator<Entry<String, HashMap<String, String>>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String, HashMap<String, String>> entry = ir.next();
			
			String groupName = entry.getKey();
			HashMap<String, String> groupMap = entry.getValue();
			System.out.printf("* %s [%d명]\n",groupName, groupMap.size());
			
			Iterator<Entry<String, String>> ir2 = groupMap.entrySet().iterator();
			while (ir2.hasNext()) {
				Entry<String, String> entry2 = ir2.next();
				String name = entry2.getKey();
				String tel = entry2.getValue();
				System.out.printf("\t%s : %s\n", name, tel);
			}
			
		}
	} // printList

	private static void addPhoneNo(String groupName, String name, String tel) {
		groupName = groupName == null ? "기타" : groupName;
		addGroup(groupName); // 그룹명이 없는 경우 기타라고 하고 그룹을 만들자
		
		HashMap<String, String> group = phoneBook.get(groupName); //
		group.put(name, tel);
		
	} // addPhoneNo

	private static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) { // 그룹이 존재하지 않는다면
			phoneBook.put(groupName, new HashMap<>()); // 그룹네임의 그룹(HashMap)을 하나 생성하겠다.
		} // if
		
	} // addGroup

} // class
