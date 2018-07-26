package cn.xydata.mapper;

import cn.xydata.entity.TBaseUnit;
import java.util.List;

public interface TBaseUnitMapper {
    int deleteByPrimaryKey(String id);

    int insert(TBaseUnit record);

    TBaseUnit selectByPrimaryKey(String id);

    List<TBaseUnit> selectAll();

    int updateByPrimaryKey(TBaseUnit record);
}