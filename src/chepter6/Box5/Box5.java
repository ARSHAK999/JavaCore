package chepter6.Box5;

public class Box5 {
    double width;
    double height;
    double depth;



    double volume2() {
        return width * height * depth;
    }
    void  setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
