package cn.xydata.mapper;

import cn.xydata.entity.TWmsProvider;
import java.util.List;

public interface TWmsProviderMapper {
    int deleteByPrimaryKey(String id);

    int insert(TWmsProvider record);

    TWmsProvider selectByPrimaryKey(String id);

    List<TWmsProvider> selectAll();

    int updateByPrimaryKey(TWmsProvider record);
}