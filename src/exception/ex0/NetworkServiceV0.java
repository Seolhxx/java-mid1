package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address = "http://example.com"; //외부 서버에 접속
        NetworkClientV0 cilent = new NetworkClientV0(address);

        cilent.connect();
        cilent.send(data);
        cilent.disconnect();
    }
}
