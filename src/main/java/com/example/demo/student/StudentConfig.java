package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student kaoutar = new Student(
                    "Kaoutar",
                    "kaoutar@gmail.com",
                    LocalDate.of(2002, Month.JUNE,23)
            );
            Student sara = new Student(
                    "sara",
                    "sara@gmail.com",
                    LocalDate.of(2005, Month.NOVEMBER,22)
            );

            repository.saveAll(
                    List.of(kaoutar,sara)
            );
        };
    }
}
