package chepter9.p2.Protection2extendsp1;

import chepter9.p1.Protection;

class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();
        System.out.println("кoнcтpyктop из другого пакета");
        System.out.println("n_pub = " + p.n_pub);
    }

}
