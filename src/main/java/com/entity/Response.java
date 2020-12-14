package com.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ClassName Response
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-02 21:51
 * @Version 1.0
 **/
@Data
@Accessors(chain = true)
public class Response {
    private Integer code;
    private Object object;
}
