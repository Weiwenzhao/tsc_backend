package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.BaseShareInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Interface BaseShareMapper
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-03 16:50
 * @Version 1.0
 **/
@Repository
@Mapper
public interface BaseShareMapper extends BaseMapper<BaseShareInfo> {
}
