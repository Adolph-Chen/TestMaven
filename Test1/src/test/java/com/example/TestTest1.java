package com.example;

import com.example.TestTest1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
//import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(JUnit4.class)
public class TestTest1 {
    @Test
    public void testPrint() {
        new Test1().print("hhhh");
    }
}
