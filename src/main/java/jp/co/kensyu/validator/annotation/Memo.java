package jp.co.kensyu.validator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import jp.co.kensyu.validator.MemoValidator;

@Documented
@Constraint(validatedBy = MemoValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Memo {
    String message() default "Please input a memo.";

    int value();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}