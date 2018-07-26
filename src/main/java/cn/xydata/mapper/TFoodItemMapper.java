package cn.xydata.mapper;

import cn.xydata.entity.TFoodItem;
import java.util.List;

public interface TFoodItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFoodItem record);

    TFoodItem selectByPrimaryKey(String id);

    List<TFoodItem> selectAll();

    int updateByPrimaryKey(TFoodItem record);
}