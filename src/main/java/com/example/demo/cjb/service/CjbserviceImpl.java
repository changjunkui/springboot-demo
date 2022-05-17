package com.example.demo.cjb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.cjb.dao.CjbDao;
import com.example.demo.cjb.entity.CjbEntity;
import org.springframework.stereotype.Service;

@Service("cjbService")
public class CjbserviceImpl extends ServiceImpl<CjbDao, CjbEntity> implements CjbService {

    @Override
    public void cjb() {
        CjbEntity cjbEntity=baseMapper.selectById("1");
        CjbEntity cjbEntity1=baseMapper.getById("2");
        baseMapper.selectList(new QueryWrapper<CjbEntity>().eq("id","1"));

        String dfgj="sgfoooo";

    }

    //代码后退测试
    public void c1jb() {
        CjbEntity cjbEntity=baseMapper.selectById("1");
        CjbEntity cjbEntity1=baseMapper.getById("2");
        baseMapper.selectList(new QueryWrapper<CjbEntity>().eq("id","1"));

        String dfgj="sgfoooo";

    }

    //代码后退测试22222222
    public void c11jb() {
        CjbEntity cjbEntity=baseMapper.selectById("1");
        CjbEntity cjbEntity1=baseMapper.getById("2");
        baseMapper.selectList(new QueryWrapper<CjbEntity>().eq("id","1"));

        String dfgj="sgfoooo";

    }

    //tjia下载


}
