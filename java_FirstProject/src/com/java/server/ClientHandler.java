package com.java.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// 멀티 쓰레드 환경을 구축하기 위해 생성하는, Runnable을 구현하는 클래스
class ClientHandler implements Runnable {
	// 클라이언트 소켓 
    private final Socket clientSocket;
    
    // 접속한 클라이언트의 소켓 대입
    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }
    // 처음 서버 접속 시 서버에 보낼 클라이언트의 데이터
    @Override
    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {    	
        	System.out.println(clientSocket.getLocalPort()+"에서 해당 서버에 접속했습니다");
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // 서버에 로그인 데이터를 보낼 메서드
}