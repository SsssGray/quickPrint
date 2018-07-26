package cn.xydata.mapper;

import cn.xydata.entity.VYxZyyz;
import java.util.List;

public interface VYxZyyzMapper {
    int insert(VYxZyyz record);

    List<VYxZyyz> selectAll();
}