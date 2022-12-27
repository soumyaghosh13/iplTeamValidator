package com.howtodoinjava.demo.jsonsimple;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {

    @BeforeClass
    public void setUp() {
    }

    @Test(groups = { "wicketKeeper" })
    public void wicketKeeper() {
        System.out.println("Check 1 WicketKeeper Should be in team");
    }

    @Test(groups = { "originCountry" })
    public void originCountry() {
        System.out.println("Validate only 4 foreign player should allowed in a team ");
    }

}
