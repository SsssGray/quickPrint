package cn.xydata.mapper;

import cn.xydata.entity.TOrder;
import java.util.List;

public interface TOrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(TOrder record);

    TOrder selectByPrimaryKey(String id);

    List<TOrder> selectAll();

    int updateByPrimaryKey(TOrder record);
}