package com.java666.repository.impl;

import com.java666.entity.Student;
import com.java666.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1l, "田爽", 19));
        studentMap.put(2L, new Student(2L, "袁宇杰", 21));
        studentMap.put(3L, new Student(3L, "李相赫", 24));

    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);

    }
}
