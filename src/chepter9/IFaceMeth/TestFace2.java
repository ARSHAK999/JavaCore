package chepter9.IFaceMeth;

public class TestFace2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        CallBack ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);
    }

}
