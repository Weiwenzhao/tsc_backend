package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.DictValueInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Interface DictValueMapper
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-03 11:11
 * @Version 1.0
 **/
@Repository
@Mapper
public interface DictValueMapper extends BaseMapper<DictValueInfo> {
}
