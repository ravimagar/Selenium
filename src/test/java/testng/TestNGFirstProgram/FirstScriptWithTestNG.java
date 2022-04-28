package testng.TestNGFirstProgram;

import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class FirstScriptWithTestNG {


    @Test()
    void secondTest() {
        System.out.println("hii");
    }


    @Test(groups = "smoke", dependsOnMethods = "secondTest")
    void firstTest() {
        System.out.println("First Test execution");
    }

    @Test(dependsOnMethods = "firstTest")
    void lastTest(){
        int a = 0;
        int b = 1;
        Assert.assertTrue(a==b, "both valus should same");
    }

    @Test(expectedExceptions = {IOException.class, NullPointerException.class})
    void fourthTest(){
        System.out.println("Fourth Test");
    }

}
