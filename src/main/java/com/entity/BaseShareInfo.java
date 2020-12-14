package com.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @ClassName BaseShareInfo
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-03 16:36
 * @Version 1.0
 **/
@Data
@TableName(value = "base_share", schema = "postgres.public")
public class BaseShareInfo {
    @TableField(value = "id")
    private String id;
    @TableField(value = "hh_id")
    private String hhId;
    @TableField(value = "name")
    private String name;
    @TableField(value = "sex")
    private String sex;
    @TableField(value = "relation")
    private String relation;
    @TableField(value = "birth_day")
    private Timestamp birthday;
    @TableField(value = "certificate")
    private String certificate;
    @TableField(value = "age")
    private Integer age;
    @TableField(value = "marry_date")
    private Timestamp marryDate;
    @TableField(value = "in_date")
    private Timestamp inDate;
    @TableField(value = "hk_address")
    private String hkAddress;
    @TableField(value = "now_address")
    private String nowAddress;
    @TableField(value = "base_share")
    private String baseShare;
    @TableField(value = "nl_share")
    private String nlShare;
    @TableField(value = "nl")
    private String nl;
    @TableField(value = "total_share")
    private String totalShare;
    @TableField(value = "comment")
    private String comment;
    @TableField(value = "create_time")
    private Timestamp createTime;
    @TableField(value = "update_time")
    private Timestamp update_time;
    @TableField(value = "del_flg")
    private Integer delFlg;
    @TableField(value = "\"group\"")
    private String group;
    @TableField(value = "village")
    private String village;
}
