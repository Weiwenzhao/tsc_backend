package com.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName DictValueInfo
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-02 21:40
 * @Version 1.0
 **/
@Data
@TableName(value = "dict_value_tab", schema = "postgres.public")
public class DictValueInfo {
    @TableField(value = "code")
    private String code;
    @TableField(value = "value")
    private String value;
    @TableField(value = "type")
    private Integer type;
}
