package com.java.server;

import java.net.ServerSocket;
import java.net.Socket;

//- 게시글 작성, 수정, 삭제 지원 기능
//- 게시글 목록 조회 기능
//- 사용자 인증 및 회원가입 기능



public class Server {	
	public static void main(String[] args) {
		
		try(ServerSocket serverSocket = new ServerSocket(8011)) {
			System.out.println("서버 실행 중");
			while(true) {
				// 클라이언트 소켓 : 서버에 접근하는 클라이언트의 소켓. 접근할 때까지 계속 돌아감.
				Socket socket = serverSocket.accept();
				
				if(socket.isConnected()) {
					System.out.println("클라이언트가 연결되어 있는 상태구나");
				}			
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서버에 연결할 수 없습니다.");
		}
	}
}
