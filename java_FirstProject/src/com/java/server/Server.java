package com.java.server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static int clientCount = 0;
	public static void main(String[] args) {
			// 서버 소켓 생성
		try(ServerSocket serverSocket = new ServerSocket(8011)) {
			System.out.println("서버 실행 중");
			while(true) {
				// 클라이언트 소켓 : 서버에 접근하는 클라이언트의 소켓. 접근할 때까지 계속 돌아감.
				Socket socket = serverSocket.accept();
				if(socket.isConnected()) {
					System.out.println("클라이언트가 연결되어 있는 상태인가? ");
					System.out.println("동시 접속자 수 :" + clientCount);
				}			
				if(true) {// 
					clientCount++;
					System.out.println("로그인 중인 접속자 수 : " + clientCount);
					break;
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서버에 연결할 수 없습니다.");
		}		
	}
}
