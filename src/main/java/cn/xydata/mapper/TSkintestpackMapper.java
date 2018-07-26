package cn.xydata.mapper;

import cn.xydata.entity.TSkintestpack;
import java.util.List;

public interface TSkintestpackMapper {
    int deleteByPrimaryKey(String id);

    int insert(TSkintestpack record);

    TSkintestpack selectByPrimaryKey(String id);

    List<TSkintestpack> selectAll();

    int updateByPrimaryKey(TSkintestpack record);
}