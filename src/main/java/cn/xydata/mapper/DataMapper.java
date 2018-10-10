package cn.xydata.mapper;

import cn.xydata.entity.Data;
import java.util.List;

public interface DataMapper {
    int deleteByPrimaryKey(String phone);

    int insert(Data record);

    Data selectByPrimaryKey(String phone);

    List<Data> selectAll();

    int updateByPrimaryKey(Data record);
}