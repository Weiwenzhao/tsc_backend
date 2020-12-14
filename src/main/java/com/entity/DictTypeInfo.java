package com.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DictTypeInfo
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-02 21:45
 * @Version 1.0
 **/
@Data
@TableName(value = "dict_type_tab", schema = "postgres.public")
@Accessors(chain = true)
public class DictTypeInfo {
    @TableField(value = "type")
    private Integer code;
    @TableField(value = "value")
    private String value;
    @TableField(exist = false, select = false)
    private List<DictValueInfo> dictValueInfoList = new ArrayList<>();
}
