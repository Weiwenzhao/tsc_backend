package com.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

/**
 * @ClassName WindowCondition
 * @Description TODO
 * @Author tyh
 * @Date 2019-12-20 9:41
 * @Version 1.0
 **/
@Component
public class WindowCondition implements Condition {
    @Override
    public boolean matches ( ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata ) {
        return System.getProperty("os.name").toLowerCase().contains("windows");
    }
}
