package cn.xydata.mapper;

import cn.xydata.entity.TSkintestliquid;
import java.util.List;

public interface TSkintestliquidMapper {
    int deleteByPrimaryKey(String id);

    int insert(TSkintestliquid record);

    TSkintestliquid selectByPrimaryKey(String id);

    List<TSkintestliquid> selectAll();

    int updateByPrimaryKey(TSkintestliquid record);
}