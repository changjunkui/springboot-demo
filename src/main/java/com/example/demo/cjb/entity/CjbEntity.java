package com.example.demo.cjb.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("cjb")
@Data
public class CjbEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    //sfijrfu
    //zxin
    private String name;

    private String nl;

    private int sl;


}
