package ru.dubovitskiy.MyRestSpringBootAppH2DB.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "STUDENTS")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

    private String faculty;

    private int age;

    public Student() {

    }

    public Student(String name, String surname, String faculty, int age){
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.age = age;
    }
}