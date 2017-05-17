package com.nit.reservoir.service.business.impl.reservoir;

import com.nit.reservoir.core.abs.AbstractDao;
import com.nit.reservoir.core.abs.AbstractServiceImpl;
import com.nit.reservoir.service.business.reservoir.ReservoirService;
import com.nit.reservoir.service.dao.reservoir.ReservoirDao;
import com.nit.reservoir.service.model.reservoir.Reservoir;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by aozijian on 2017/4/21.
 */
@Service("reservoirService")
public class ReservoirServiceImpl extends AbstractServiceImpl<Reservoir> implements ReservoirService{

    @Resource
    private ReservoirDao reservoirDao;

    @Override
    protected AbstractDao<Reservoir> getAbstractDao() {
        return reservoirDao;
    }
}
