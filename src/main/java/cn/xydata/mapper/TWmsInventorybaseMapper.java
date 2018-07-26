package cn.xydata.mapper;

import cn.xydata.entity.TWmsInventorybase;
import java.util.List;

public interface TWmsInventorybaseMapper {
    int deleteByPrimaryKey(String id);

    int insert(TWmsInventorybase record);

    TWmsInventorybase selectByPrimaryKey(String id);

    List<TWmsInventorybase> selectAll();

    int updateByPrimaryKey(TWmsInventorybase record);
}