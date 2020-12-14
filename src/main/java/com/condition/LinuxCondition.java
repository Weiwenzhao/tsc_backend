package com.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

/**
 * @ClassName LinuxCondition
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-04 17:46
 * @Version 1.0
 **/
@Component
public class LinuxCondition implements Condition {
    @Override
    public boolean matches ( ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata ) {
        return System.getProperty("os.name").toLowerCase().contains("linux");
    }
}
