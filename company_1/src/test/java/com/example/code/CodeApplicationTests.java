package com.example.code;

import com.example.code.core.ennum.IsDelEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodeApplicationTests {

    @Test
    public void contextLoads() {

        System.out.println(IsDelEnum.IS_DEL.getCode());

    }

}
