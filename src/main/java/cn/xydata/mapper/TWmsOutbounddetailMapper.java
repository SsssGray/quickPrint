package cn.xydata.mapper;

import cn.xydata.entity.TWmsOutbounddetail;
import java.util.List;

public interface TWmsOutbounddetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(TWmsOutbounddetail record);

    TWmsOutbounddetail selectByPrimaryKey(String id);

    List<TWmsOutbounddetail> selectAll();

    int updateByPrimaryKey(TWmsOutbounddetail record);
}