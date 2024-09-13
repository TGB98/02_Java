package edu.kh.collection.pack1.run;

import java.util.Arrays;

import edu.kh.collection.pack1.model.service.StudentService;
import edu.kh.collection.pack1.model.service.StudentService2;

public class StudentRun {

	public static void main(String[] args) {

//		new StudentService().displayMenu();
		
//		List<Integer> numberList = new ArrayList<Integer>();
//		
//		numberList.add(5);
//		numberList.add(3);
//		numberList.add(1);
//		numberList.add(4);
//		numberList.add(2);
		
		// 숫자 리스트 정렬 (Comparable 이 이미 구현되어 있음.)
//		Collections.sort(numberList);
//		
//		System.out.println(numberList);
		
//		new StudentService2().displayMenu();
		
		
//		while(true) {
//			for(int i = 1; i <= 20; i++) {
//				if(i%5 ==0) {
//					System.out.println(i + " : 5의 배수입니다.");
//				}
//				else {
//					System.out.println(i + " : 5의 배수가 아닙니다.");
//				}
//			}
//			break;
//		}
		
		int i = 1;
		while( i<=20 ) {
			if(i%5 == 0) {
				System.out.println(i + "는 5의 배수입니다.");
			}
			else {
				System.out.println(i + "는 5의 배수가 아닙니다.");
			}
			i++;
		}
		
		String[] strArr = new String[5];
		for(int i1 = 0; i1 < strArr.length; i1++) {
			strArr[i1] = "A";
		}
		System.out.println(Arrays.toString(strArr));
		
		
		
	}

}
