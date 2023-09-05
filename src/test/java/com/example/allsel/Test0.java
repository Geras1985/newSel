package com.example.allsel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test0 {
    @Test
    public static void test0() {
        Assert.assertTrue(true);
        System.out.println("TRUE");
    }

    @Test
    public static void test1() {
        Assert.assertTrue(false);
        System.out.println("FALSE");
    }

    @Test
    public void test2(){
        Assert.assertEquals(2,2);
        System.out.println("yes");
    }

}
