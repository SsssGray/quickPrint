package cn.xydata.mapper;

import cn.xydata.entity.HtInjectionway;
import java.util.List;

public interface HtInjectionwayMapper {
    int deleteByPrimaryKey(String id);

    int insert(HtInjectionway record);

    HtInjectionway selectByPrimaryKey(String id);

    List<HtInjectionway> selectAll();

    int updateByPrimaryKey(HtInjectionway record);
}