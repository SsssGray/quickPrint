package cn.xydata.mapper;

import cn.xydata.entity.TFoodMaterial;
import java.util.List;

public interface TFoodMaterialMapper {
    int deleteByPrimaryKey(String id);

    int insert(TFoodMaterial record);

    TFoodMaterial selectByPrimaryKey(String id);

    List<TFoodMaterial> selectAll();

    int updateByPrimaryKey(TFoodMaterial record);
}