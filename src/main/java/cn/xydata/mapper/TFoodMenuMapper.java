package cn.xydata.mapper;

import cn.xydata.entity.TFoodMenu;
import java.util.List;

public interface TFoodMenuMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFoodMenu record);

    TFoodMenu selectByPrimaryKey(String id);

    List<TFoodMenu> selectAll();

    int updateByPrimaryKey(TFoodMenu record);
}