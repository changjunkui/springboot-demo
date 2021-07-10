package com.example.demo.cjb.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.cjb.entity.CjbEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CjbDao extends BaseMapper<CjbEntity> {
    CjbEntity getById(@Param("id") String id);
}
