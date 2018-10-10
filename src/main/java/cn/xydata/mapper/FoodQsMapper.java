package cn.xydata.mapper;

import cn.xydata.entity.FoodQs;
import java.util.List;

public interface FoodQsMapper {
    int deleteByPrimaryKey(String id);

    int insert(FoodQs record);

    FoodQs selectByPrimaryKey(String id);

    List<FoodQs> selectAll();

    int updateByPrimaryKey(FoodQs record);
}