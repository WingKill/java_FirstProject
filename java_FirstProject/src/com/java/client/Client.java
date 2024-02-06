package com.java.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.java.practice.LoginFrame;

// 클라이언트 접근. 
/*- 게시글 목록 표시
- 게시글 작성, 수정, 삭제 기능 제공하는 UI
- 사용자 인증 및 회원가입 UI*/
public class Client {
	public static void main(String[] args) {
		// 서버 연결
		try(Socket socket = new Socket("localhost", 8011);){
			// gui 호출(StartScene)
			LoginFrame loFrame = new LoginFrame();
			if(loFrame != null && socket != null)
				System.out.println("정상 작동 중");
			// 로그인 데이터는 로그인 Scene에서 처리
			// 처음에는 로그인 없이 구현해보기
			
			// 게시글 데이터는 게시글 Scene에서 처리
			// 소켓 닫는 부분은 해당 창을 끄면 닫히는 걸로 하자.
			
			socket.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
