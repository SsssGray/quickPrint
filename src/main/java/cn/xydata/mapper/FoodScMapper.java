package cn.xydata.mapper;

import cn.xydata.entity.FoodSc;
import java.util.List;

public interface FoodScMapper {
    int deleteByPrimaryKey(String id);

    int insert(FoodSc record);

    FoodSc selectByPrimaryKey(String id);

    List<FoodSc> selectAll();

    int updateByPrimaryKey(FoodSc record);
}