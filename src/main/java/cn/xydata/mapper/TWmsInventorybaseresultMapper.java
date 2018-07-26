package cn.xydata.mapper;

import cn.xydata.entity.TWmsInventorybaseresult;
import java.util.List;

public interface TWmsInventorybaseresultMapper {
    int deleteByPrimaryKey(String id);

    int insert(TWmsInventorybaseresult record);

    TWmsInventorybaseresult selectByPrimaryKey(String id);

    List<TWmsInventorybaseresult> selectAll();

    int updateByPrimaryKey(TWmsInventorybaseresult record);
}