package com.example.demo;
import com.example.demo.service.StudentService;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    private StudentRepository repository;

    @InjectMocks
    private StudentService service;

    @Test
    void testSaveStudent() {
        Student student = new Student();
        student.setName("John");

        when(repository.save(student)).thenReturn(student);

        Student saved = service.save(student);

        assertEquals("John", saved.getName());
        verify(repository, times(1)).save(student);
    }
}
