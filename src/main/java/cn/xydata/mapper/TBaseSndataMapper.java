package cn.xydata.mapper;

import cn.xydata.entity.TBaseSndata;
import java.util.List;

public interface TBaseSndataMapper {
    int deleteByPrimaryKey(String snname);

    int insert(TBaseSndata record);

    TBaseSndata selectByPrimaryKey(String snname);

    List<TBaseSndata> selectAll();

    int updateByPrimaryKey(TBaseSndata record);
}