package cn.xydata.mapper;

import cn.xydata.entity.DrugDomestic;
import java.util.List;

public interface DrugDomesticMapper {
    int deleteByPrimaryKey(String id);

    int insert(DrugDomestic record);

    DrugDomestic selectByPrimaryKey(String id);

    List<DrugDomestic> selectAll();

    int updateByPrimaryKey(DrugDomestic record);
}