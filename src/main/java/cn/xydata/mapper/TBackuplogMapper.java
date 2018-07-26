package cn.xydata.mapper;

import cn.xydata.entity.TBackuplog;
import java.util.List;

public interface TBackuplogMapper {
    int deleteByPrimaryKey(String id);

    int insert(TBackuplog record);

    TBackuplog selectByPrimaryKey(String id);

    List<TBackuplog> selectAll();

    int updateByPrimaryKey(TBackuplog record);
}