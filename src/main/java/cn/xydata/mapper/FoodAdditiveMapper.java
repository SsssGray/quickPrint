package cn.xydata.mapper;

import cn.xydata.entity.FoodAdditive;
import java.util.List;

public interface FoodAdditiveMapper {
    int deleteByPrimaryKey(String id);

    int insert(FoodAdditive record);

    FoodAdditive selectByPrimaryKey(String id);

    List<FoodAdditive> selectAll();

    int updateByPrimaryKey(FoodAdditive record);
}