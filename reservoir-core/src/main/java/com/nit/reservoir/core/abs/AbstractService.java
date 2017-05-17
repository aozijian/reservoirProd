package com.nit.reservoir.core.abs;

import java.util.List;
import java.util.Map;

/**
 * 抽象公共Service
 * User: charlie.deng
 * Date: 16-8-22
 * Time: 下午3:14
 */
public interface AbstractService<T> {
    int deleteByPrimaryKey(String id);

    int deleteById(int id);

    int insert(T record);

    int insertBatch(List<T> records);

    int updateBatch(List<T> records);

    int insertSelective(T record);

    T selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    List<T> list();

    int deletes(List<String> ids);

    int count(Map<String, Object> pagerParams);

    /**
     * 分页查询等
     * @param pagerParams
     * @return
     */
    List<T> selectByParams(Map<String, Object> pagerParams);
}
