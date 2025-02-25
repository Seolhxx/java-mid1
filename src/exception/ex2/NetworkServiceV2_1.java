package exception.ex2;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com"; //외부 서버에 접속
        NetworkClientV2 cilent = new NetworkClientV2(address);
        cilent.initError(data); //추가

        cilent.connect();
        cilent.send(data);
        cilent.disconnect();
    }
}
