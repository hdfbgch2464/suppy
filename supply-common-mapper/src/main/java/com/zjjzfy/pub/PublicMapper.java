package com.zjjzfy.pub;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PublicMapper<T> extends Mapper<T>,MySqlMapper<T> {
}