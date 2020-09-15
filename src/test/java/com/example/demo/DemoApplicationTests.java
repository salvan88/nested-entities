package com.example.demo;

import com.example.demo.model.Drink;
import com.example.demo.model.Passport;
import com.example.demo.repository.DrinkRepository;
import com.example.demo.repository.MovieRepository;
import com.example.demo.repository.PassportRepository;
import com.example.demo.repository.PersonRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@SpringBootTest
@Sql(scripts = "classpath:data.sql")
class DemoApplicationTests {

    @Autowired
    DrinkRepository drinkRepository;


    @Test
    void contextLoads() {
        List<Drink> all = drinkRepository.findAll();
        Assertions.assertThat(all).size().isEqualTo(1);
    }

}
