package com.nit.reservoir.core.abs;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 抽象 Mapper接口
 * User: charlie.deng
 * Date: 16-8-22
 * Time: 下午2:43
 */
@Transactional
public interface AbstractMapper<T> {

    int deleteByPrimaryKey(String id);

    int deleteById(int id);

    int insert(T record);

    int insertBatch(@Param("records") List<T> records);

    int updateBatch(@Param("records") List<T> records);

    int insertSelective(T record);

    T selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    List<T> selectAll();

    List<T> selectByParams(Map<String, Object> pagerParams);

    int deletes(List<String> ids);

    int count(Map<String, Object> params);

}
