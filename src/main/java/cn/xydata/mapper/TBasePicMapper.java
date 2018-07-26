package cn.xydata.mapper;

import cn.xydata.entity.TBasePic;
import java.util.List;

public interface TBasePicMapper {
    int deleteByPrimaryKey(String id);

    int insert(TBasePic record);

    TBasePic selectByPrimaryKey(String id);

    List<TBasePic> selectAll();

    int updateByPrimaryKey(TBasePic record);
}