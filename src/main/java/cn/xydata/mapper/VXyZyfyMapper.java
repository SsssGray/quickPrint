package cn.xydata.mapper;

import cn.xydata.entity.VXyZyfy;
import java.util.List;

public interface VXyZyfyMapper {
    int insert(VXyZyfy record);

    List<VXyZyfy> selectAll();
}