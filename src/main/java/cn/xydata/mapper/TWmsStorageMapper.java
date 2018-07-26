package cn.xydata.mapper;

import cn.xydata.entity.TWmsStorage;
import java.util.List;

public interface TWmsStorageMapper {
    int deleteByPrimaryKey(String id);

    int insert(TWmsStorage record);

    TWmsStorage selectByPrimaryKey(String id);

    List<TWmsStorage> selectAll();

    int updateByPrimaryKey(TWmsStorage record);
}