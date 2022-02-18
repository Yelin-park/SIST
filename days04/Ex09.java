package days04;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 4:09:05
 * @subject 효율적인 연산(short circuit evaluation) 설명 p118
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 효율적인 연산(short circuit evaluation)
		int a = 1, b = 2, c = 3, d = 4;
		System.out.println(a > b && c > d);
		//                   F       T/F 상관없음 
		// AND 연산자 일 경우에 앞이 false이면, 뒤에 결과와 상관없이 바로 false
		
		System.out.println(a < b || c > d);
		//                   T        T/F 상관없음 
		// OR 연산자 일 경우에 앞이 true이면, 뒤에 결과와 상관없이 바로 true
	
	}

}
