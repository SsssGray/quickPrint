package cn.xydata.mapper;

import cn.xydata.entity.TPermission;
import java.util.List;

public interface TPermissionMapper {
    int deleteByPrimaryKey(String id);

    int insert(TPermission record);

    TPermission selectByPrimaryKey(String id);

    List<TPermission> selectAll();

    int updateByPrimaryKey(TPermission record);
}