package days21;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오전 10:55:07
 * @subject
 * @content
 */
public class Ex01_05 {

	public static void main(String[] args) {
		/*
		 * 문제 설명
			길이가 n이고,
			"수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
			solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

			제한 조건
			n은 길이 10,000이하인 자연수입니다.
			입출력 예
			n	return
			3	"수박수"
			4	"수박수박"
		 */
		
		Solution s = new Solution();
		// class에서 static을 붙이면 위에 객체 생성하는 코딩 안해도됨
		String answer = s.solution(5);
		long start = System.nanoTime();
		System.out.println(answer);
		long end = System.nanoTime();
		System.out.println("> 처리 시간 : " + (end-start) + "ns" );
		
	} // main

} // class

class Solution {
	
    public String solution(int n) {
        String answer = "";
        StringBuffer s = new StringBuffer(); // StrungBuffer 객체 생성
        
        if(n <= 10000) {
        	
            for (int i = 0; i < n/2 ; i++) { // 2, 4, 6, 8 일 때 수박을 붙여버리자
    			s.append("수박");
    		}
            // "수박".repeat(n/2);
            if( n % 2 == 1) s.append("수");
        }
        answer = s.toString();
        
        return answer;
        
        
        /*
        for (int i = 1; i <= n; i++) {
			if(i%2 == 1) {
				s.append("수");
			} else {
				s.append("박");
			}
		}
        
        answer = s.toString();
        return answer;
        */
    }
}
