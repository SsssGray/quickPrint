package cn.xydata.mapper;

import cn.xydata.entity.TUserPwd;
import java.util.List;

public interface TUserPwdMapper {
    int deleteByPrimaryKey(String id);

    int insert(TUserPwd record);

    TUserPwd selectByPrimaryKey(String id);

    List<TUserPwd> selectAll();

    int updateByPrimaryKey(TUserPwd record);
}