package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 自己的 Mapper
 * 特别注意，该接口不能被扫描到，否则会出错
 * <p>Title: MyMapper</p>
 * <p>Description: </p>
 *
 * @author William
 * @version 1.0.0
 * @date 2021/7/25 21:57
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
