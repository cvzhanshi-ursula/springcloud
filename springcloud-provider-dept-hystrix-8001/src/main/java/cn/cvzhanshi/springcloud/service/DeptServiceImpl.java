package cn.cvzhanshi.springcloud.service;

import cn.cvzhanshi.springcloud.dao.DeptDao;
import cn.cvzhanshi.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cVzhanshi
 * @create 2021-06-26 16:49
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> getAll() {
        return deptDao.getAll();
    }
}
