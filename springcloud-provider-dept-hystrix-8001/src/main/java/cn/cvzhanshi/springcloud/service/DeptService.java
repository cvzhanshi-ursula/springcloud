package cn.cvzhanshi.springcloud.service;

import cn.cvzhanshi.springcloud.entity.Dept;

import java.util.List;

/**
 * @author cVzhanshi
 * @create 2021-06-26 16:48
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> getAll();
}
