package cn.xydata.mapper;

import cn.xydata.entity.TFoodMenuweek;
import java.util.List;

public interface TFoodMenuweekMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFoodMenuweek record);

    TFoodMenuweek selectByPrimaryKey(String id);

    List<TFoodMenuweek> selectAll();

    int updateByPrimaryKey(TFoodMenuweek record);
}