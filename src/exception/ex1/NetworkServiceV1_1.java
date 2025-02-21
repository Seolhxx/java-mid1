package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.com"; //외부 서버에 접속
        NetworkClientV1 cilent = new NetworkClientV1(address);
        cilent.initError(data); //추가

        cilent.connect();
        cilent.send(data);
        cilent.disconnect();
    }
}
