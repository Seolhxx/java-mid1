package nested.test;

class AnonymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("AnonymousMain.hello");
            }
        };
        hello.hello();
    }
}
