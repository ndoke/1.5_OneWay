package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OneWayTest {
    OneWay oneWay = new OneWay();

    @Test
    public void test() {
        Assert.assertTrue(oneWay.isOneEditAwaySeparate("pale", "ple"));
        Assert.assertTrue(oneWay.isOneEditAwaySeparate("pales", "pale"));
        Assert.assertTrue(oneWay.isOneEditAwaySeparate("bale", "pale"));
        Assert.assertFalse(oneWay.isOneEditAwaySeparate("pale", "bae"));
        Assert.assertFalse(oneWay.isOneEditAwaySeparate("geeks", "geeks"));
        Assert.assertFalse(oneWay.isOneEditAwaySeparate("peaks", "geeks"));
    }
}
