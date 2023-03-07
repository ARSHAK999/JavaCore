package chepter12.RepeatAnno;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatedAnnos {
    MyAnno[] value();
}
