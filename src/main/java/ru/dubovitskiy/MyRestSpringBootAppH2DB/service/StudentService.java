package ru.dubovitskiy.MyRestSpringBootAppH2DB.service;

import org.springframework.stereotype.Service;
import ru.dubovitskiy.MyRestSpringBootAppH2DB.entity.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();
    Student getStudent(int id);
    Student saveStudent(Student student);
    void deleteStudent(int id);
}
