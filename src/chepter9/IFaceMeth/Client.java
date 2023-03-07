package chepter9.IFaceMeth;

public class Client extends CallBack {
    public void callback(int p){
    System.out.println("Method callback(), " + "calling value " + p);
}

    void nonIfaceMeth(){
        System.out.println("Not use interface");
    }
}
