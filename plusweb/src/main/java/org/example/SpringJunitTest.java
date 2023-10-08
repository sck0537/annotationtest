package org.example;


import org.example.config.SpringConfiguration;
import org.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class SpringJunitTest {


    @Autowired
    private UserService userService;
    @Autowired
    private DataSource dataSource;


    @Test
    public void test1() throws SQLException {

        userService.save();
        System.out.println(dataSource.getConnection());;
    }

}
