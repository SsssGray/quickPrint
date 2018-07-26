package cn.xydata.mapper;

import cn.xydata.entity.TRolepermission;
import java.util.List;

public interface TRolepermissionMapper {
    int deleteByPrimaryKey(String id);

    int insert(TRolepermission record);

    TRolepermission selectByPrimaryKey(String id);

    List<TRolepermission> selectAll();

    int updateByPrimaryKey(TRolepermission record);
}