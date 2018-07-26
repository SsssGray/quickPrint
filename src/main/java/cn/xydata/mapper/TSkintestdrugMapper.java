package cn.xydata.mapper;

import cn.xydata.entity.TSkintestdrug;
import java.util.List;

public interface TSkintestdrugMapper {
    int deleteByPrimaryKey(String id);

    int insert(TSkintestdrug record);

    TSkintestdrug selectByPrimaryKey(String id);

    List<TSkintestdrug> selectAll();

    int updateByPrimaryKey(TSkintestdrug record);
}