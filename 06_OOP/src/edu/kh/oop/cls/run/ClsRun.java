package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.ClsService;

public class ClsRun {

	public static void main(String[] args) {

		ClsService CS = new ClsService();
		// ClsService 클래스에 기본 생성자를 작성한 적 없지만,
		// 기본생성자 호출, 객체도 잘 만들어서 사용 중이었다.
		// -> 컴파일러가 코드를 번역할 때
		// 클래스 내부에 생성자가 하나도 없다면
		// 자동으로 기본생성자를 추가해줌 ( 우리 눈엔 안보임 )
		
//		CS.ex2();
//		CS.ex3();
		CS.ex4();
	}

}
