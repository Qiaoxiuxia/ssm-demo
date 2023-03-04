package com.itqiao.dao;

import com.itqiao.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * @author qiaoxiuxia  15680879850@163.com
 * @version 2023/2/26 20:38
 * @since Java17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml"})
public class StudentDaoTest {
    @Autowired
    private StudentDao studentDao;
    @Test
    public void testFindAll(){
        List<Student> all = studentDao.findAll();
        all.forEach(System.out::println);
    }

    @Test
    public void testAdd(){
        Student student = new Student(0,"STX","女","上海");
        studentDao.add(student);
    }
}
