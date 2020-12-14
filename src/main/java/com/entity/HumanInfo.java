package com.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @ClassName HumanInfo
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-02 20:58
 * @Version 1.0
 **/
@Data
@TableName(value = "human_info", schema = "postgres.public")
public class HumanInfo {
    @TableId(value = "id")
    private String id;
    @TableField(value = "area_code")
    private String areaCode;
    @TableField(value = "building_code")
    private String buildingCode;
    @TableField(value = "registered_residence")
    private String registeredResidence;
    @TableField(value = "name")
    private String name;
    @TableField(value = "certificate")
    private String certificatec;
    @TableField(value = "census")
    private String census;
    @TableField(value = "registered")
    private String registered;
    @TableField(value = "census_address")
    private String censusAddress;
    @TableField(value = "registered_address")
    private String registeredAddress;
    @TableField(value = "leave_time")
    private String leaveTime;
    @TableField(value = "mobile")
    private String mobile;
    @TableField(value = "village_group_index")
    private String villageGroupIndex;
    @TableField(value = "create_time")
    private Timestamp createTime = new Timestamp(System.currentTimeMillis());
    @TableField(value = "update_time")
    private Timestamp updateTime = new Timestamp(System.currentTimeMillis());
    @TableField(value = "del_flg")
    private Integer delFlg;
    @TableField(value = "village_group")
    private String villageGroup;
    @TableField(value = "mobile_1")
    private String mobile1;
    @TableField(value = "status")
    private Integer status;
}
