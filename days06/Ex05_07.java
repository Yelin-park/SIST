package days06;

public class Ex05_07 {

	public static void main(String[] args) {
		// [7번 문제]
		//              공백        별
		// *	i=1
		// _*
		// __*
		// ___*
		// ____*
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i==j) {
					System.out.print("*");
				} else {
					System.out.print("_");
				}
			} 
			System.out.println();
		}
		/*
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i-1; i++) {
				System.out.print("_");
			}
			System.out.print("*");
			System.out.println();
		}
	*/

		

	} // main

} // class
