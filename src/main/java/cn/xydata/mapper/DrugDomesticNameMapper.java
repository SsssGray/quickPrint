package cn.xydata.mapper;

import cn.xydata.entity.DrugDomesticName;
import java.util.List;

public interface DrugDomesticNameMapper {
    int deleteByPrimaryKey(String id);

    int insert(DrugDomesticName record);

    DrugDomesticName selectByPrimaryKey(String id);

    List<DrugDomesticName> selectAll();

    int updateByPrimaryKey(DrugDomesticName record);
}