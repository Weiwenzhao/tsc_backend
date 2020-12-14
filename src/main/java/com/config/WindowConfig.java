package com.config;

import com.condition.WindowCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName WindowConfig
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-04 17:49
 * @Version 1.0
 **/
@Component
@Conditional(WindowCondition.class)
@PropertySource("file:D:\\config\\application.properties")
public class WindowConfig {
}
