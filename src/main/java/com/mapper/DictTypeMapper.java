package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.DictTypeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ClassName DictTypeMapper
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-03 10:25
 * @Version 1.0
 **/
@Repository
@Mapper
public interface DictTypeMapper extends BaseMapper<DictTypeInfo> {
}
