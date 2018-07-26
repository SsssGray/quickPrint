package cn.xydata.mapper;

import cn.xydata.entity.TUserProfile;
import java.util.List;

public interface TUserProfileMapper {
    int deleteByPrimaryKey(String id);

    int insert(TUserProfile record);

    TUserProfile selectByPrimaryKey(String id);

    List<TUserProfile> selectAll();

    int updateByPrimaryKey(TUserProfile record);
}