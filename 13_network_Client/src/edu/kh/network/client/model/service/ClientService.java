package edu.kh.network.client.model.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientService {

	// 192.168.50.200
	public void clientStart() {
		
		// 1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
		int port = 6112;
		
		// 1) 현재 컴퓨터의 로컬 IP 주소를 얻어오는 방법.
//		String serverIP = InetAddress.getLocalHost().getHostAddress();
		// -> 본인의 컴퓨터의 로컬 IP주소를 얻는 것.
		
//		String serverIP = "198.168.50.220";
		// -> 다른 컴퓨터가 서버일 때 그 컴퓨터의 IP 주소를 작성.
			
		// 2) loop back IP(현재 컴퓨터를 나타내는 IP)
		String serverIP = "127.0.0.1";
		
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			System.out.println("[Client]");
			
			clientSocket = new Socket(serverIP, port);
			// UnknownHostException : IP가 잘못 되었을 때 발생하는 예외.
			
			// 2. 서버와의 입출력 스트림 오픈
			if(clientSocket != null) { // 서버와 연결 성공한 경우.
				
				is = clientSocket.getInputStream(); // 입력용 스트림
				os = clientSocket.getOutputStream(); // 출력용 스트림
				
				
			// 3. 보조 스트림을 통해 성능 개선
				br = new BufferedReader(new InputStreamReader(is));
				// InputStreamReader : 바이트를 문자 단위로 입력하는 문자 변환 보조 스트림.
				
				pw = new PrintWriter(os);
				
			// 4. 스트림을 통해 읽고 쓰기
				// 서버 -> 클라이언트에게 보낸 메세지 한 줄 읽어와 콘솔창에 출력.
				String serverMessage = br.readLine();
				
				System.out.println(serverMessage);
				
				// --------------------------------------------------------------------
				
				// 클라이언트 -> 서버로 메세지 전송
				Scanner sc = new Scanner(System.in);
				
				System.out.print("서버로 전송할 메세지 : ");
				String str = sc.nextLine();
				
				pw.println(str); // 메세지를 클라이언트 -> 서버쪽으로 출력.
				pw.flush(); // 스트림 내용 밀어내기.
				
				// 서버 -> 클라이언트 메세지 읽어오기.
				System.out.println("서버가 보낸 메세지 : " + br.readLine());
				
				
			}

		} catch(UnknownHostException e) {
			System.out.println("잘못된 IP 주소입니다.");
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				
				// 5. 통신 종료
				// 스트림과 소켓 닫기.
				if(br != null) br.close();
				if(pw != null) pw.close();
				
				if(clientSocket != null) clientSocket.close();
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}
		


		
		
	}
	
}
