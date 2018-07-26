package cn.xydata.mapper;

import cn.xydata.entity.TOrderAddress;
import java.util.List;

public interface TOrderAddressMapper {
    int deleteByPrimaryKey(String id);

    int insert(TOrderAddress record);

    TOrderAddress selectByPrimaryKey(String id);

    List<TOrderAddress> selectAll();

    int updateByPrimaryKey(TOrderAddress record);
}