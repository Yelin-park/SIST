package days10;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오후 4:42:03
 * @subject
 * @content
 */
public class Ex05_09 {

	public static void main(String[] args) {

		String rrn = Ex05_02.getRRN();
		
		int[] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		int total = 0;
		
		for (int i = 0; i <= 12; i++) {
			total += (rrn.charAt(i)-48) * m[i];
		}

		int ㅍ = (11 - (total % 11)) % 10;
		int ㅎ = Integer.parseInt(rrn.substring(13,14));
		if(ㅍ == ㅎ) System.out.println("올바른 주민등록번호 입니다.");
		else System.out.println("잘못된 주민등록번호 입니다.");


	} // main

} // class
