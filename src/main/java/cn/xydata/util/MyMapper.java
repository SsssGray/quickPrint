package cn.xydata.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by kaiqian on 2017/8/29.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
