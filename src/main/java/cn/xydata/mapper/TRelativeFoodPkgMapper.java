package cn.xydata.mapper;

import cn.xydata.entity.TRelativeFoodPkg;
import java.util.List;

public interface TRelativeFoodPkgMapper {
    int deleteByPrimaryKey(String id);

    int insert(TRelativeFoodPkg record);

    TRelativeFoodPkg selectByPrimaryKey(String id);

    List<TRelativeFoodPkg> selectAll();

    int updateByPrimaryKey(TRelativeFoodPkg record);
}