package cn.xydata.mapper;

import cn.xydata.entity.TPayLog;
import java.util.List;

public interface TPayLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(TPayLog record);

    TPayLog selectByPrimaryKey(String id);

    List<TPayLog> selectAll();

    int updateByPrimaryKey(TPayLog record);
}