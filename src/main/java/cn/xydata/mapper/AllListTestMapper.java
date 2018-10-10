package cn.xydata.mapper;

import cn.xydata.entity.AllListTest;
import java.util.List;

public interface AllListTestMapper {
    int deleteByPrimaryKey(Integer myId);

    int insert(AllListTest record);

    AllListTest selectByPrimaryKey(Integer myId);

    List<AllListTest> selectAll();

    int updateByPrimaryKey(AllListTest record);
}