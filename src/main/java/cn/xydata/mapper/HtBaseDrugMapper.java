package cn.xydata.mapper;

import cn.xydata.entity.HtBaseDrug;
import java.util.List;

public interface HtBaseDrugMapper {
    int deleteByPrimaryKey(String id);

    int insert(HtBaseDrug record);

    HtBaseDrug selectByPrimaryKey(String id);

    List<HtBaseDrug> selectAll();

    int updateByPrimaryKey(HtBaseDrug record);
}