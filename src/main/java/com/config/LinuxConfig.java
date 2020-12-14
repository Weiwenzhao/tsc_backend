package com.config;

import com.condition.LinuxCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName LinuxConfig
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-04 17:48
 * @Version 1.0
 **/
@Component
@Conditional(LinuxCondition.class)
@PropertySource("file:/usr/local/app/config/application.properties")
public class LinuxConfig {
}
