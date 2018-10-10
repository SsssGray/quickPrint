package cn.xydata.mapper;

import cn.xydata.entity.DrugRegistPublic;
import java.util.List;

public interface DrugRegistPublicMapper {
    int deleteByPrimaryKey(String id);

    int insert(DrugRegistPublic record);

    DrugRegistPublic selectByPrimaryKey(String id);

    List<DrugRegistPublic> selectAll();

    int updateByPrimaryKey(DrugRegistPublic record);
}