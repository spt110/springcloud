package com.hhly.businesscomm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootApplication
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BusinessBaseTest.class)
public class BusinessBaseTest {

    @Test
    public void test() {
        Assert.assertTrue(true);
    }
}
