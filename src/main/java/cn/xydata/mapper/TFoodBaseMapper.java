package cn.xydata.mapper;

import cn.xydata.entity.TFoodBase;
import java.util.List;

public interface TFoodBaseMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFoodBase record);

    TFoodBase selectByPrimaryKey(String id);

    List<TFoodBase> selectAll();

    int updateByPrimaryKey(TFoodBase record);
}