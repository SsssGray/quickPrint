package cn.xydata.mapper;

import cn.xydata.entity.CosmeticsXk;
import java.util.List;

public interface CosmeticsXkMapper {
    int deleteByPrimaryKey(String id);

    int insert(CosmeticsXk record);

    CosmeticsXk selectByPrimaryKey(String id);

    List<CosmeticsXk> selectAll();

    int updateByPrimaryKey(CosmeticsXk record);
}