package space.whm.desensitize;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于标记字段需要进行脱敏处理的注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@JacksonAnnotationsInside
@JsonSerialize(using = DesensitizeSerializer.class)
public @interface Desensitize {

    /**
     * 脱敏类型
     */
    DesensitizeType type() default DesensitizeType.DEFAULT;

    /**
     * 脱敏起始位置
     */
    int startInclude() default 0;

    /**
     * 脱敏结束位置
     */
    int endExclude() default 0;

}

