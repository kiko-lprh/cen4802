package com.mycompany.app;

import org.junit.*;

/**
 * fiboTest.java
 * Unit tests for the App.java class.
 * 
 * @author Diego Cordero
 * @date January 29, 2024
 * @course CEN 4802C - SOFTWARE INTEGRATION, CONFIGURATION, AND TESTING
 */
public class fiboTest {
    
    @Test
    public void test1(){
      Assert.assertEquals(App.nthTerm(5),5); // 5th term should equal 5
    }

    @Test
    public void test2(){
      Assert.assertEquals(App.nthTerm(7),13);//7th term should equal 13
    }
  
    @Test
    public void test3(){
      Assert.assertEquals(App.nthTerm(3),2); //3rd term should equal 2
    }
  
    @Test
    public void test4(){
      Assert.assertEquals(App.nthTerm(10),55); //10th term should equal 55
    }
  
    @Test
    public void test5(){
      Assert.assertEquals(App.nthTerm(4),3); //4th term should equal 3
    }

}
