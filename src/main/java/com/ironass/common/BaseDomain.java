package com.ironass.common;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * 实体基类
 *
 * @author sean
 * @date 2019/03/20/23:45
 **/
public class BaseDomain implements Serializable {
    private static final long serialVersionUID = 3671828524261446730L;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}