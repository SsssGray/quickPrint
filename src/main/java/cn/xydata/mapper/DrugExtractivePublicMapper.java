package cn.xydata.mapper;

import cn.xydata.entity.DrugExtractivePublic;
import java.util.List;

public interface DrugExtractivePublicMapper {
    int deleteByPrimaryKey(String id);

    int insert(DrugExtractivePublic record);

    DrugExtractivePublic selectByPrimaryKey(String id);

    List<DrugExtractivePublic> selectAll();

    int updateByPrimaryKey(DrugExtractivePublic record);
}