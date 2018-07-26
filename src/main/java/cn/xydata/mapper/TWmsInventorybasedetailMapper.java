package cn.xydata.mapper;

import cn.xydata.entity.TWmsInventorybasedetail;
import java.util.List;

public interface TWmsInventorybasedetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(TWmsInventorybasedetail record);

    TWmsInventorybasedetail selectByPrimaryKey(String id);

    List<TWmsInventorybasedetail> selectAll();

    int updateByPrimaryKey(TWmsInventorybasedetail record);
}