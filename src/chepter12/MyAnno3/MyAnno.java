package chepter12.MyAnno3;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();

    int val();

}
