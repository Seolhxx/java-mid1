package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{ //여기선 예외해결못하고 던지는 것

        //문제 상황
        throw new MyCheckedException("ex");
    }
}
