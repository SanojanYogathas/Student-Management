package com.example.demo.student;
import java.time.LocalDate;
import java.util.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
        {
        // return args -> {
            Student sanojan = new Student(
                        "sanojan",
                        "sanojanyogathas@gmail.com",
                        LocalDate.of(1998, 8, 12)
                        );

            Student kunekanth = new Student(
                        "kunekanth",
                        "kunekanth@gmail.com",
                        LocalDate.of(1997, 8, 5)
                        );
        // };

        List<Student> result = new ArrayList<Student>();
        result.add(sanojan);
        result.add(kunekanth);

        repository.saveAll(result);

        return null;
    }

}
