package cn.xydata.mapper;

import cn.xydata.entity.TFoodMenutype;
import java.util.List;

public interface TFoodMenutypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFoodMenutype record);

    TFoodMenutype selectByPrimaryKey(String id);

    List<TFoodMenutype> selectAll();

    int updateByPrimaryKey(TFoodMenutype record);
}