package cn.xydata.mapper;

import cn.xydata.entity.TPay;
import java.util.List;

public interface TPayMapper {
    int deleteByPrimaryKey(String id);

    int insert(TPay record);

    TPay selectByPrimaryKey(String id);

    List<TPay> selectAll();

    int updateByPrimaryKey(TPay record);
}