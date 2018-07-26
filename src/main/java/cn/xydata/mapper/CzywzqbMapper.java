package cn.xydata.mapper;

import cn.xydata.entity.Czywzqb;
import java.util.List;

public interface CzywzqbMapper {
    int insert(Czywzqb record);

    List<Czywzqb> selectAll();
}