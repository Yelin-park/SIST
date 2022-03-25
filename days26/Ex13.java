package days26;

import java.util.ArrayList;
import java.util.Vector;

import days17.Employee;
import days17.Regular;
import days17.Temp;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오후 4:39:06
 * @subject p678 와일드 카드 == ?
 * @content
 */
public class Ex13 {

	public static void main(String[] args) {
		// 상속계층도 : 	Employee <- Regular <- SalesMan
		//				Employee <- Temp
		
		// 업캐스팅(자동 업캐스팅, 오토 업캐스팅)
		Employee emp = new Regular(); // 자식 객체 생성해서 부모 객체 참조
		
		Vector<Regular> v1 = new Vector<Regular>();
		v1.add(new Regular());
		v1.add(new Regular());
		v1.add(new Regular());
		v1.add(new Regular());
		
		// 에러 메시지 : Type mismatch: cannot convert from Vector<Regular> to Vector<Employee>
		// 해석 : 타입 불일치 -> Employee 타입 넣어야 되는데 Regular을 넣으려고 해서 안된다.
		// Vector<Employee> v2 = v1;
		
		// 와일드 카드 -> Employee와 Employee의 자식들만 가능
		Vector<? extends Employee> v2 = v1;
		// Vector<? super SalesMan> : SalesMan과 부모들만 가능
		// Vector<?> : 제한없다
		
		// = new Vector<E>(Collection <? extends E> c)
		// Vector<Employee> v = new Vector (Collection <? extends Employee> c);
		ArrayList<Temp> list = new ArrayList<Temp>();
		Vector<Employee> v = new Vector<Employee>(list); // 이 코딩이 가능한 이유를 설명할 줄 알아야 함

	} // main

} // class
