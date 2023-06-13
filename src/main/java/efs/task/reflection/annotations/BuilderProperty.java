package efs.task.reflection.annotations;

import java.lang.annotation.*;


@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)

public @interface BuilderProperty {
    String name();
}