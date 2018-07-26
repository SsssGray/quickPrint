package cn.xydata.mapper;

import cn.xydata.entity.TOrderLog;
import java.util.List;

public interface TOrderLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(TOrderLog record);

    TOrderLog selectByPrimaryKey(String id);

    List<TOrderLog> selectAll();

    int updateByPrimaryKey(TOrderLog record);
}