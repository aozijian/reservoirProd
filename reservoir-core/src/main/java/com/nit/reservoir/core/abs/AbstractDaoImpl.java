package com.nit.reservoir.core.abs;

import java.util.List;
import java.util.Map;

/**
 * 抽象Dao 实现类
 * User: charlie.deng
 * Date: 16-8-22
 * Time: 下午3:13
 */
public abstract class AbstractDaoImpl<T> implements AbstractDao<T> {

    protected abstract AbstractMapper<T> getAbstractMapper();

    @Override
    public int deleteByPrimaryKey(String id) {
        return getAbstractMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int deleteById(int id) {
        return getAbstractMapper().deleteById(id);
    }


    @Override
    public int insert(T record) {
        return getAbstractMapper().insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return getAbstractMapper().insertSelective(record);
    }

    @Override
    public T selectByPrimaryKey(String id) {
        return getAbstractMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return getAbstractMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return getAbstractMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<T> list() {
        return getAbstractMapper().selectAll();
    }

    @Override
    public int insertBatch(List<T> records){
        return getAbstractMapper().insertBatch(records);
    }

    @Override
    public int updateBatch(List<T> records) {
        return getAbstractMapper().updateBatch(records);
    }

    @Override
    public int deletes(List<String> ids) {
        return getAbstractMapper().deletes(ids);
    }

    @Override
    public int count(Map<String, Object> params) {
        return getAbstractMapper().count(params);
    }

    /**
     * 分页查询等
     * @param pagerParams
     * @return
     */
    public List<T> selectByParams(Map<String, Object> pagerParams){
        return getAbstractMapper().selectByParams(pagerParams);
    }

}
