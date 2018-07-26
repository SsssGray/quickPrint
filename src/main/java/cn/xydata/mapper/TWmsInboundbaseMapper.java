package cn.xydata.mapper;

import cn.xydata.entity.TWmsInboundbase;
import java.util.List;

public interface TWmsInboundbaseMapper {
    int deleteByPrimaryKey(String id);

    int insert(TWmsInboundbase record);

    TWmsInboundbase selectByPrimaryKey(String id);

    List<TWmsInboundbase> selectAll();

    int updateByPrimaryKey(TWmsInboundbase record);
}