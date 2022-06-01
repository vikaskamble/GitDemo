package com.qa.testcases.login;

import com.qa.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{


    public LoginTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws Exception{
        getInitBrowser();
        Thread.sleep( 2000 );
    }

    @Test (priority = 1)
    public void loginTest(){
        System.out.println( "Login Test case." );
    }

    @Test(priority = 2)
    public void homePageTest(){
        System.out.println( "Home Page Test" );
        Assert.assertTrue( true );
    }

    @Test (priority = 3)
    public void addWarehouse(){
        System.out.println( "Add Warehouse Test" );
        Assert.assertTrue( true );
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
