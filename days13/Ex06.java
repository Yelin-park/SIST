package days13;

import java.util.Arrays;

/**
 * @author Yelin
 * @date 2022. 3. 7. - 오후 2:07:02
 * @subject 
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// Arrays 클래스 안에 정수를 찾는 메서드가 있다.
		// int idx = Arrays.binarySearch(배열명, 찾을정수) ***
		
		/* 문제 2) 취업 문제 ego(자아)
	              String n = "keNik";
	              String m= "kKnie";
	       *        위의 두 문자열 n, m 이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 
	       *        결과는 같을 경우 true/ 다를 경우 false 로 출력.
	       *        조건) 대소문자는 구분하지 않는다.  
	       * */
		
        String n = "LiyAN"; // k2 e1 n1 i1 
        String m= "nalYI";  // k2 e1 n1 i1 
        boolean b = solution(n, m);
        
        System.out.println(b ? "같다" : "다르다");

        /*
        char[] check = new char[n.length()];
        
        for (int i = 0; i < check.length; i++) {
			check[i] = Character.toUpperCase(n.charAt(i));
		}
        
		char[] cn = n.toCharArray();
		char[] cm = m.toCharArray();
		int cn_count = 0;
		int cm_count = 0;
		
		for (int i = 0; i < cm.length-1; i++) {
			for (int j = 0; j < cm.length; j++) {
				if( Character.toUpperCase(check[i]) == Character.toUpperCase(cn[j]) ) cn_count++;
				if( Character.toUpperCase(check[i]) == Character.toUpperCase(cm[j]) ) cm_count++;
			}
		}
		
		System.out.println((cn_count == cm_count) ? true : false);
		System.out.println(cn_count);
		System.out.println(cm_count);
		*/
        
	} // main
	
        
	private static boolean solution(String n, String m) {
		n = toUpperCase(n);
		m = m.toUpperCase(); // String 클래스 안에 있는 메서드 사용
		
		// EIKKN  EIKKN
		// 정렬된 두 문자열이 같으냐??
		n = getStringSort(n); // KENIK -> ABC 오름차순 -> EIKKN
		m = getStringSort(m);
		// Arrays.sort(m.toCharArray());
		
		return n.equals(m);
	}
	
	// 정렬하는 메서드  Arrays.sort 사용해도 됨
	private static String getStringSort(String n) {
		char[] m = n.toCharArray();
		Arrays.sort(m);
		String temp = new String(m);
		return temp;
	}


	// 아래 메서드 안만들어도됨
	private static String toUpperCase(String n) {
		String temp ="";
		for (int i = 0; i < n.length(); i++) {
			char one = n.charAt(i);
			if('a' <= one && one <= 'z') one -= 32;
			temp += one;
		}
		return temp;
	}

} // class
