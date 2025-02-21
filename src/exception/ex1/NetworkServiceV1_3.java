package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com"; //외부 서버에 접속
        NetworkClientV1 cilent = new NetworkClientV1(address);
        cilent.initError(data); //추가

        String connectResult = cilent.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류코드: " + connectResult); //로그 남김
        } else {String sendResult = cilent.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류코드: " + sendResult); //로그 남김
            }
        }

        cilent.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
