package com.server.impl;

import com.alibaba.fastjson.JSON;
import com.entity.DictTypeInfo;
import com.entity.DictValueInfo;
import com.entity.Response;
import com.mapper.DictTypeMapper;
import com.mapper.DictValueMapper;
import com.server.DictServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName DictServerImpl
 * @Description TODO
 * @Author tyh
 * @Date 2020-12-03 11:12
 * @Version 1.0
 **/
@Service
public class DictServerImpl implements DictServer {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    DictTypeMapper dictTypeMapper;
    @Autowired
    DictValueMapper dictValueMapper;

    @Override
    public Response getAllDict () {
        try {
            List<DictTypeInfo> dictTypeInfoList = dictTypeMapper.selectList(null);
            List<DictValueInfo> dictValueInfoList = dictValueMapper.selectList(null);
            dictTypeInfoList.forEach(dictTypeInfo -> dictTypeInfo.getDictValueInfoList().addAll(
                    dictValueInfoList.stream().filter(dictValueInfo -> dictTypeInfo.getCode().equals(dictValueInfo.getType()))
                            .distinct()
                            .collect(Collectors.toList()))
            );
            logger.info("查询出来的字典表信息是：" + JSON.toJSONString(dictTypeInfoList));
            return new Response().setCode(200).setObject(dictTypeInfoList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Response().setCode(500);
    }
}
