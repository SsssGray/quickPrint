package cn.xydata.mapper;

import cn.xydata.entity.TOrderDetail;
import java.util.List;

public interface TOrderDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(TOrderDetail record);

    TOrderDetail selectByPrimaryKey(String id);

    List<TOrderDetail> selectAll();

    int updateByPrimaryKey(TOrderDetail record);
}