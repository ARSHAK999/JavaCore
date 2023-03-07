package chepter12.SingleAnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value();
}
