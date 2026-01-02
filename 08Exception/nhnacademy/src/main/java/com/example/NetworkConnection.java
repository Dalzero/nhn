package com.example;

public class NetworkConnection {
    private boolean connected = false;

    public void connect() {
        connected = true;
        System.out.println("네트워크 연결됨");
    }

    public void disconnect() {
        connected = false;
        System.out.println("네트워크 연결 해제됨");
    }

    public String sendRequest(String request) {
        if (!connected) {
            throw new IllegalStateException("연결되지 않음");
        }
        if (request.contains("ERROR")) {
            throw new RuntimeException("요청 실패");
        }
        return "응답: " + request;
    }

    public void executeRequest(String request){
        NetworkConnection network = new NetworkConnection();
        try {
            network.connect();
            String result = network.sendRequest(request);
            System.out.println(result);
        } catch (RuntimeException e) {
            System.out.println("요청 오류 " + e.getMessage());
        } finally {
            network.disconnect();
        }
    }
}