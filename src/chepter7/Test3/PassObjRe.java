package chepter7.Test3;

public class PassObjRe {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        System.out.println("ob.a and ob.b before : " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a and ob.b after : " + ob.a + " " + ob.b);
    }
    }

