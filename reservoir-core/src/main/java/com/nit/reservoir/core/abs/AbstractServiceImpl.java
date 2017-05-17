package com.nit.reservoir.core.abs;

import java.util.List;
import java.util.Map;

/**
 * 抽象公共service实现
 * User: charlie.deng
 * Date: 2016-11-14
 * Time: 下午1:48
 */
public abstract class AbstractServiceImpl<T> implements AbstractService<T> {
    //@Resource
    //protected AbstractDao<T> abstractDao;
    protected abstract AbstractDao<T> getAbstractDao();

    @Override
    public int deleteByPrimaryKey(String id) {
        return getAbstractDao().deleteByPrimaryKey(id);
    }

    @Override
    public int deleteById(int id) {
        return getAbstractDao().deleteById(id);
    }

    @Override
    public int insert(T record) {
        return getAbstractDao().insert(record);
    }

    @Override
    public int insertBatch(List<T> records){
        return getAbstractDao().insertBatch(records);
    }

    @Override
    public int updateBatch(List<T> records) {
        return getAbstractDao().updateBatch(records);
    }

    @Override
    public int insertSelective(T record) {
        return getAbstractDao().insertSelective(record);
    }

    @Override
    public T selectByPrimaryKey(String id) {
        return getAbstractDao().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return getAbstractDao().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return getAbstractDao().updateByPrimaryKey(record);
    }

    @Override
    public List<T> list() {
        return getAbstractDao().list();
    }

    @Override
    public int deletes(List<String> ids) {
        return getAbstractDao().deletes(ids);
    }

    @Override
    public int count(Map<String, Object> pagerParams) {
        return getAbstractDao().count(pagerParams);
    }

    /**
     * 分页查询等
     * @param pagerParams
     * @return
     */
    public List<T> selectByParams(Map<String, Object> pagerParams){
        return getAbstractDao().selectByParams(pagerParams);
    }
}
