package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com"; //외부 서버에 접속
        NetworkClientV2 cilent = new NetworkClientV2(address);
        cilent.initError(data); //추가

        try {
            cilent.connect();
            cilent.send(data); //throw new RuntimeException("ex");
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
        }

        cilent.disconnect();
    }
}
