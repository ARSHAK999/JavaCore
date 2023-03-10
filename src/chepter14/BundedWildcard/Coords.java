package chepter14.BundedWildcard;

public class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }

}
