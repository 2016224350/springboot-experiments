package com.example.springbootexperiments;

import com.example.springbootexperiments.com.entity.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void addUserTest(){
      userRepository.addUserAddress();
    }
}
