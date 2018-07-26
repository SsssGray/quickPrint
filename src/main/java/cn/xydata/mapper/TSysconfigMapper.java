package cn.xydata.mapper;

import cn.xydata.entity.TSysconfig;
import java.util.List;

public interface TSysconfigMapper {
    int deleteByPrimaryKey(String id);

    int insert(TSysconfig record);

    TSysconfig selectByPrimaryKey(String id);

    List<TSysconfig> selectAll();

    int updateByPrimaryKey(TSysconfig record);
}