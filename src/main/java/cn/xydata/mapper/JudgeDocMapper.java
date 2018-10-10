package cn.xydata.mapper;

import cn.xydata.entity.JudgeDoc;
import java.util.List;

public interface JudgeDocMapper {
    int deleteByPrimaryKey(String id);

    int insert(JudgeDoc record);

    JudgeDoc selectByPrimaryKey(String id);

    List<JudgeDoc> selectAll();

    int updateByPrimaryKey(JudgeDoc record);
}