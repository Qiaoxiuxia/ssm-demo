package com.itqiao.service;

import com.itqiao.dao.StudentDao;
import com.itqiao.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qiaoxiuxia  15680879850@163.com
 * @version 2023/2/27 6:48
 * @since Java17
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public List<Student> findAllStudent(){
        return studentDao.findAll();
    }
    public void addStudent(Student student){
        studentDao.add(student);
    }
}
