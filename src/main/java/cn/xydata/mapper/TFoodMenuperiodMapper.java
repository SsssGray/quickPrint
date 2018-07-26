package cn.xydata.mapper;

import cn.xydata.entity.TFoodMenuperiod;
import java.util.List;

public interface TFoodMenuperiodMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFoodMenuperiod record);

    TFoodMenuperiod selectByPrimaryKey(String id);

    List<TFoodMenuperiod> selectAll();

    int updateByPrimaryKey(TFoodMenuperiod record);
}