package cn.xydata.mapper;

import cn.xydata.entity.TInfusionpack;
import java.util.List;

public interface TInfusionpackMapper {
    int deleteByPrimaryKey(String id);

    int insert(TInfusionpack record);

    TInfusionpack selectByPrimaryKey(String id);

    List<TInfusionpack> selectAll();

    int updateByPrimaryKey(TInfusionpack record);
}