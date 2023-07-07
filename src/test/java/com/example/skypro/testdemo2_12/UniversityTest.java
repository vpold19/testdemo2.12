package com.example.skypro.testdemo2_12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UniversityTest {
    private Student student1;
    private Student student2;
    private Student student3;
    private University university;

    @BeforeEach
    public void setUp() {
        student1 = new Student("Igor", 23, true);
        student2 = new Student("Olga", 18, false);
        student3 = new Student("Kevin", 25, true);
        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
    }

    @Test
    public void getAllStudents() {


        List<Student> expected = university.getAllStudents();

        List<Student> actual = new ArrayList<Student>();
        actual.add(student1);
        actual.add(student1);
        actual.add(student1);

        assertEquals(expected, actual);
    }

    @Test
    public void getAllStudentsNotNull() {
        University university = new University();
        List<Student> expected = university.getAllStudents();
        assertNotNull(expected);
    }

    @Test
    public void getAllStudentsIsMale() {
        Student student1 = new Student("Igor", 23, true);
        Student student2 = new Student("Olga", 18, false);
        Student student3 = new Student("Kevin", 25, true);

        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        List<Student> expected = university.getAllStudents(true);

        List<Student> actual = new ArrayList<Student>();
        actual.add(student1);
        actual.add(student1);
        actual.add(student1);

        assertEquals(expected, actual);
    }
}
