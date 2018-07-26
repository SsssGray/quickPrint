package cn.xydata.mapper;

import cn.xydata.entity.TFoodMenufor;
import java.util.List;

public interface TFoodMenuforMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFoodMenufor record);

    TFoodMenufor selectByPrimaryKey(String id);

    List<TFoodMenufor> selectAll();

    int updateByPrimaryKey(TFoodMenufor record);
}