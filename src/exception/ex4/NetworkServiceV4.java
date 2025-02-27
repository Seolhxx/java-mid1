package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com"; //외부 서버에 접속
        NetworkClientV4 cilent = new NetworkClientV4(address);
        cilent.initError(data); //추가

        try {
            cilent.connect();
            cilent.send(data); //throw new RuntimeException("ex");
        } finally {
            cilent.disconnect();
        }
    }
}
