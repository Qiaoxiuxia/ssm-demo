package com.itqiao.dao;

import com.itqiao.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qiaoxiuxia  15680879850@163.com
 * @version 2023/2/26 20:15
 * @since Java17
 */
@Repository
public interface StudentDao {
    //查询所有学生
    @Select("select * from student")
    List<Student> findAll();
    //添加学生
    @Insert("insert into student values (null,#{name},#{sex},#{address})")
    void add(Student student);
}
