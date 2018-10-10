package cn.xydata.mapper;

import cn.xydata.entity.AllList;
import java.util.List;

public interface AllListMapper {
    int deleteByPrimaryKey(String myId);

    int insert(AllList record);

    AllList selectByPrimaryKey(String myId);

    List<AllList> selectAll();

    int updateByPrimaryKey(AllList record);
}