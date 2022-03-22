package days23;

import java.text.MessageFormat;
import java.text.ParseException;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오후 12:05:30
 * @subject ***MessageFormat 클래스로 출력된 데이터로 부터 필요한 데이터만 [뽑아내겠다]. ***
 * @content parse 작업
 */
public class Ex05_03 {

	public static void main(String[] args) {
		// MessageFormat 클래스로 출력된 데이터로 부터 필요한 데이터만 [뽑아내겠다]. ***
		
		String source = "이름 : yaliny, 나이 : 18살, 성별 : 여자";
		
		// 파싱(parse)
		// ,(콤마) 구분자 split
		// : 구분자 split
		// 각각의 1번째 방에 있는 값이 name, age, gender 관련된 값
		
		// format이 아니기 때문에 객체 생성을 해야함
		String pattern = "이름 : {0}, 나이 : {1}살, 성별 : {2}"; // 출력된 데이터
		MessageFormat mf = new MessageFormat(pattern);
		try {
			Object[] objs = mf.parse(source); // source에 {0}, {1}, {2}에 해당하는 값(필요한 데이터)을 Object 배열에 넣는다.
			for (Object a : objs) {
				System.out.println(a);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	} // main

} // class
