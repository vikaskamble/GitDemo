package com.qa.testcases.home;

import com.qa.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws Exception{
        getInitBrowser();
        Thread.sleep( 2000 );
    }

    @Test
    public void validateHomePageLOGO(){
        Assert.assertTrue( true );
    }

    @Test
    public void homePageLink(){
        Assert.assertTrue( true );
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
