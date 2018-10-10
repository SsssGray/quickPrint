package cn.xydata.mapper;

import cn.xydata.entity.TUserWorkinjury;
import java.util.List;

public interface TUserWorkinjuryMapper {
    int deleteByPrimaryKey(String id);

    int insert(TUserWorkinjury record);

    TUserWorkinjury selectByPrimaryKey(String id);

    List<TUserWorkinjury> selectAll();

    int updateByPrimaryKey(TUserWorkinjury record);
}