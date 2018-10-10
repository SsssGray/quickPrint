package cn.xydata.mapper;

import cn.xydata.entity.CompanyInfo;
import java.util.List;

public interface CompanyInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CompanyInfo record);

    CompanyInfo selectByPrimaryKey(String id);

    List<CompanyInfo> selectAll();

    int updateByPrimaryKey(CompanyInfo record);
}