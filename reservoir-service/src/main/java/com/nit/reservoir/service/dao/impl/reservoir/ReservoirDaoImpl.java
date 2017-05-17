package com.nit.reservoir.service.dao.impl.reservoir;

import com.nit.reservoir.core.abs.AbstractDaoImpl;
import com.nit.reservoir.core.abs.AbstractMapper;
import com.nit.reservoir.service.dao.reservoir.ReservoirDao;
import com.nit.reservoir.service.mapper.reservoir.ReservoirMapper;
import com.nit.reservoir.service.model.reservoir.Reservoir;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by aozijian on 2017/4/21.
 */
@Repository
public class ReservoirDaoImpl extends AbstractDaoImpl<Reservoir> implements ReservoirDao{

    @Resource
    private ReservoirMapper reservoirMapper;

    @Override
    protected AbstractMapper<Reservoir> getAbstractMapper() {
        return reservoirMapper;
    }
}
