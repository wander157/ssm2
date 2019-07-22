package com.lyq.curd.test;

import com.lyq.curd.bean.Department;
import com.lyq.curd.dao.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    DepartmentMapper departmentMapper;
    @Test
    public void  test(){
        System.out.println(departmentMapper);
        Department department = departmentMapper.selectByPrimaryKey(1);
        System.out.println(department);

    }

}
