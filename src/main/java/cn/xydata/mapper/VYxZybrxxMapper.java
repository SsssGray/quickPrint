package cn.xydata.mapper;

import cn.xydata.entity.VYxZybrxx;
import java.util.List;

public interface VYxZybrxxMapper {
    int insert(VYxZybrxx record);

    List<VYxZybrxx> selectAll();
}