package com.java666.repository;

import com.java666.entity.Student;

import java.util.Collection;
import java.util.List;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveUpdate(Student student);
    public void deleteById(long id);
}
