package com.qiuzeming.wechat.dao;

import com.qiuzeming.wechat.entity.Area;

import java.util.List;

/**
 * Created by qiuzeming on 2018/3/11.
 */
public interface AreaDao {

    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteAreaById(int areaId);
}