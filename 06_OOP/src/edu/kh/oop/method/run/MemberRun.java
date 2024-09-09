package edu.kh.oop.method.run;

import edu.kh.oop.method.service.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		
		
		MemberService ms = new MemberService();
		// MemberService의 기본 생성자가 작성되어있지 않지만,
		// 컴파일러가 코드를 번역할 때
		// 클래스 내부에 생성자가 하나도 없다면
		// 자동으로 기본생성자를 추가해준다.
		// 문제 없이 사용 가능.
		// 만약 생성자가 하나라도 있으면 자동생성 안해줌.
		ms.displayMenu();
	}

}
