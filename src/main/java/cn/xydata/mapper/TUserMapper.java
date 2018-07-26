package cn.xydata.mapper;

import cn.xydata.entity.TUser;
import java.util.List;

public interface TUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(TUser record);

    TUser selectByPrimaryKey(String id);

    List<TUser> selectAll();

    int updateByPrimaryKey(TUser record);
}