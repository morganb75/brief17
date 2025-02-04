package com.example.brief17;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import com.example.brief17.entity.Student;
import com.example.brief17.service.StudentService;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
@Import(StudentService.class)
class StudentServiceIntegrationTest {

    @Autowired
    StudentService studentService;

    @Test
    void shouldSaveAndRetrieveStudent() {

        //GIVEN
        Student student = new Student();
        student.setName("Morgan");
        student.setAddress("Niort");

        // ACT
        Student savedStudent = studentService.saveStudent(student);

        //ASSERT
        assertThat(savedStudent).isNotNull();
        assertThat(savedStudent.getId()).isNotNull();  // L'ID doit être généré
        assertThat(savedStudent.getName()).isEqualTo("Morgan");
        assertThat(savedStudent.getAddress()).isEqualTo("Niort");
    }
}