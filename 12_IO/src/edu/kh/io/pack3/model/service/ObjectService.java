package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {

	/*
	 * ObjectInputStream / ObjectOutputStream
	 * 
	 * - Java 객체를 입/출력 할 때
	 *   사용하는 바이트 기반 보조 스트림.
	 *   (보조 스트림은 단독 사용 불가)
	 * 
	 * *** 직렬화(Serializable) ***
	 * - 객체를 직렬 형태로 변환.
	 * 
	 * - 직렬화 : 객체의 상태(필드 값들) 바이트 스트림으로 변환하는 과정.
	 *   이를 통해 객체는 메모리에서만 존재하는 것이 아니라, 외부 파일로 저장되거나
	 *   네트워크를 통해 전송될 수 있다.
	 * 
	 * - 역직렬화 : 바이트 스트림을 다시 객체로 복원하는 과정.
	 *   저장됬거나 전송된 데이터를 원래의 객체 형태로 되돌리는 작업.
	 *   
	 * */
	
	/**
	 * 객체를 외부 파일로 출력.
	 * 내부 -> 외부 출력
	 *   직렬화 필요.
	 */
	public void objectOutput() {
		
		// 스트림 참조 변수 선언.
		FileOutputStream fos = null; // 기반 스트림.
		ObjectOutputStream oos = null; // 객체 출력용 보조 스트림.
		
		try {
			// .dat 확장자 : data를 담고 있는 파일을 나타내는 확장자.
			fos = new FileOutputStream("/io_test/20240926/Member.dat");
			
			oos = new ObjectOutputStream(fos); // 객체 보조 스트림 생성.
			
			// Member 객체 하나 생성.
			Member member = new Member("member01", "pass01", "김회원", 30);
			
			// ObjectOutputStream을 이용해 Member 객체를 출력.
			oos.writeObject(member); // member 객체를 출력.
			
			System.out.println("회원 출력 완료");
			
			// [ 직렬화가 되지 않음 ]
			// java.io.NotSerializableException:
			// edu.kh.io.pack3.model.dto.Member
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 예외가 발생 여부 상관없이 무조건 수행.
			// -> 사용 완료된 스트림 메모리 반환.
			try {
				if(oos != null) oos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

	
	/**
	 * 외부 파일로부터 객체 입력 받기.
	 * 
	 * 외부 -> 내부
	 * 역직렬화 필요.
	 * 
	 */
	public void objectInput() {
		
		// 스트림 참조 변수 선언.
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			// 파일 입력 기반 스트림 생성.
			fis = new FileInputStream("/io_test/20240926/Member.dat");
			
			// 객체 입력 보조 스트림 생성.
			ois = new ObjectInputStream(fis);
			
			// 스트림을 이용해 파일에 작성된
			// 직렬화 된 Member 객체를 읽어와
			// 역직렬화 수행하여 정상적인 Member 객체로 변경.
			
			// Object ois.readObject(); : 직렬화 된 객체를 읽어와 역직렬화
			// 					+ Member 객체로 변경(다운 캐스팅).
			Member member = (Member) ois.readObject();
			
			// 읽어온 내용 확인.
			System.out.println(member);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				
				if(ois != null) ois.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}
		
	}
	
}
