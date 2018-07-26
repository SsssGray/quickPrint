package cn.xydata.mapper;

import cn.xydata.entity.TFoodPackage;
import java.util.List;

public interface TFoodPackageMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFoodPackage record);

    TFoodPackage selectByPrimaryKey(String id);

    List<TFoodPackage> selectAll();

    int updateByPrimaryKey(TFoodPackage record);
}