package cn.xydata.mapper;

import cn.xydata.entity.TUserInjurydaymoney;
import java.util.List;

public interface TUserInjurydaymoneyMapper {
    int deleteByPrimaryKey(String id);

    int insert(TUserInjurydaymoney record);

    TUserInjurydaymoney selectByPrimaryKey(String id);

    List<TUserInjurydaymoney> selectAll();

    int updateByPrimaryKey(TUserInjurydaymoney record);
}