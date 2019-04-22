package GogoSpring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MytimeStart {
    long startTime = System.nanoTime();
    long endTime = System.nanoTime();
    long duration = endTime - startTime;
}
