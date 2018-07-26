package cn.xydata.mapper;

import cn.xydata.entity.TWmsOutboundbase;
import java.util.List;

public interface TWmsOutboundbaseMapper {
    int deleteByPrimaryKey(String id);

    int insert(TWmsOutboundbase record);

    TWmsOutboundbase selectByPrimaryKey(String id);

    List<TWmsOutboundbase> selectAll();

    int updateByPrimaryKey(TWmsOutboundbase record);
}