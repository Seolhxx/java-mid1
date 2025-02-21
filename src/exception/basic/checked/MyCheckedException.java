package exception.basic.checked;

public class MyCheckedException extends Exception {
    public MyCheckedException(String message) { //셍성자
        super(message);
    }
}
