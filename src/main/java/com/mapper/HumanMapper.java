package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.HumanInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Interface HumanMapper
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-02 21:18
 * @Version 1.0
 **/
@Repository
@Mapper
public interface HumanMapper extends BaseMapper<HumanInfo> {
}
