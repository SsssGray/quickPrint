package cn.xydata.mapper;

import cn.xydata.entity.HtClient;
import java.util.List;

public interface HtClientMapper {
    int deleteByPrimaryKey(String id);

    int insert(HtClient record);

    HtClient selectByPrimaryKey(String id);

    List<HtClient> selectAll();

    int updateByPrimaryKey(HtClient record);
}