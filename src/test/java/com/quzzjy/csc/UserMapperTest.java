package com.quzzjy.csc;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.quzzjy.csc.domain.UserEntity;
import com.quzzjy.csc.mapper.UserEntityMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
   @Autowired
   private UserEntityMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UserEntity	> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}