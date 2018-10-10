package cn.xydata.mapper;

import cn.xydata.entity.TFoodClass;
import java.util.List;

public interface TFoodClassMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFoodClass record);

    TFoodClass selectByPrimaryKey(String id);

    List<TFoodClass> selectAll();

    int updateByPrimaryKey(TFoodClass record);
}