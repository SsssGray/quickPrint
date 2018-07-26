package cn.xydata.mapper;

import cn.xydata.entity.TWmsMenu;
import java.util.List;

public interface TWmsMenuMapper {
    int deleteByPrimaryKey(String id);

    int insert(TWmsMenu record);

    TWmsMenu selectByPrimaryKey(String id);

    List<TWmsMenu> selectAll();

    int updateByPrimaryKey(TWmsMenu record);
}