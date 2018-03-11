package com.qiuzeming.demo.dao;

import com.qiuzeming.demo.entity.Area;

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