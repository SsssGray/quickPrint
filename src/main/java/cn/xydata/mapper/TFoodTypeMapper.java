package cn.xydata.mapper;

import cn.xydata.entity.TFoodType;
import java.util.List;

public interface TFoodTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFoodType record);

    TFoodType selectByPrimaryKey(String id);

    List<TFoodType> selectAll();

    int updateByPrimaryKey(TFoodType record);
}