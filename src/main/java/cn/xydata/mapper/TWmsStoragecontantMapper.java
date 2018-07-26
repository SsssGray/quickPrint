package cn.xydata.mapper;

import cn.xydata.entity.TWmsStoragecontant;
import java.util.List;

public interface TWmsStoragecontantMapper {
    int deleteByPrimaryKey(String id);

    int insert(TWmsStoragecontant record);

    TWmsStoragecontant selectByPrimaryKey(String id);

    List<TWmsStoragecontant> selectAll();

    int updateByPrimaryKey(TWmsStoragecontant record);
}