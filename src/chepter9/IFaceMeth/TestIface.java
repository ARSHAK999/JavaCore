package chepter9.IFaceMeth;

public class TestIface {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(42);
    }
}