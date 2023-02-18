package chepter8.Box2;

 class Boxweight2 extends Box {
    double weight;

    Boxweight2(Boxweight2 ob) {
        super(ob);
        weight = ob.weight;
    }

    Boxweight2(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }
    Boxweight2(){
        super();
        weight = -1;
    }
    Boxweight2(double len, double m) {
        super(len);
        weight = m;
    }
}
