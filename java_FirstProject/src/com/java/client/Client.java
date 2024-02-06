package com.java.client;

import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		// 서버 연결
		try(Socket socket = new Socket("localhost", 8001);){
			
			// gui 호출(StartScene)
			
			// 로그인 데이터는 로그인 Scene에서 처리
			// 처음에는 로그인 없이 구현해보기
			
			// 게시글 데이터는 게시글 Scene에서 처리
			socket.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
