package cn.xydata.mapper;

import cn.xydata.entity.HtSyslog;
import java.util.List;

public interface HtSyslogMapper {
    int insert(HtSyslog record);

    List<HtSyslog> selectAll();
}