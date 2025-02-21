package exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.com"; //외부 서버에 접속
        NetworkClientV1 cilent = new NetworkClientV1(address);
        cilent.initError(data); //추가

        String connectResult = cilent.connect();
        if (isError(connectResult)) { //성공이 아니면(실패했으면)
            System.out.println("[네트워크 오류 발생] 오류코드: " + connectResult); //로그 남김
            return; //문제가 생기면 바로 반환 : 연결에 실패하면 여기서 나가버림
        }

        String sendResult = cilent.send(data);
        if (isError(sendResult)) { //성공이 아니면(실패했으면)
            System.out.println("[네트워크 오류 발생] 오류코드: " + sendResult); //로그 남김
            return;
        }

        cilent.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
