package cn.xydata.mapper;

import cn.xydata.entity.TWmsPurchasedoc;
import java.util.List;

public interface TWmsPurchasedocMapper {
    int insert(TWmsPurchasedoc record);

    List<TWmsPurchasedoc> selectAll();
}