package cn.xydata.mapper;

import cn.xydata.entity.TWmsInbounddetail;
import java.util.List;

public interface TWmsInbounddetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(TWmsInbounddetail record);

    TWmsInbounddetail selectByPrimaryKey(String id);

    List<TWmsInbounddetail> selectAll();

    int updateByPrimaryKey(TWmsInbounddetail record);
}