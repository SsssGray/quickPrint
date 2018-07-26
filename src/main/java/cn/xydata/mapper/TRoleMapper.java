package cn.xydata.mapper;

import cn.xydata.entity.TRole;
import java.util.List;

public interface TRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(TRole record);

    TRole selectByPrimaryKey(String id);

    List<TRole> selectAll();

    int updateByPrimaryKey(TRole record);
}