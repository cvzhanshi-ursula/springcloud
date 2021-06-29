package cn.cvzhanshi.springcloud.dao;

import cn.cvzhanshi.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cVzhanshi
 * @create 2021-06-26 16:26
 */
@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> getAll();
}
