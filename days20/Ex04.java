package days20;

/**
 * @author Yelin
 * @date 2022. 3. 17. - 오전 11:52:34
 * @subject p459 얕은 복사(복제)와 깊은 복사(복제)
 * @content p458 배열복제
 */
public class Ex04 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// 배열복제 - clone() 메서드를 사용하자~
		int[] arr = {1,2,3,4,5}; 		// 원본
		int[] arrClone = arr.clone();  // 복제본
		arrClone[0] = 100;
		System.out.println(arr[0]);       // 1
		System.out.println(arrClone[0]);  // 100
		
		// [0]         ->    a인스턴스생성   [0x100]t1
		T t1 = new T();
		// T t2 = t1.clone();
		
		// [0]a  [0x200]m          		->   [0x300]t2
		// 0x300 [0]a [0x200]m          ->   [0x300]t2
		// 0x200 [][][][][][][][][][]
		t1.m = new int[10];
		
	} // main
} // class

class T implements Cloneable{
	int a;
	int[] m = null; // 배열이 아니더라도 참조타입이면 됨(클래스 등)

	@Override
	protected T clone() throws CloneNotSupportedException {
		return (T)super.clone(); //공변반환타입
	}
} // class
