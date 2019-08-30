package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OneWayTest {
    OneWay oneWay = new OneWay();

    @Test
    public void test() {
        Assert.assertTrue(oneWay.isOneEditAwaySeparate("pale", "ple"));
        Assert.assertTrue(oneWay.isOneEditAwaySeparate("pales", "pale"));
        Assert.assertFalse(oneWay.isOneEditAwaySeparate("palesx", "pale"));
        Assert.assertTrue(oneWay.isOneEditAwaySeparate("bale", "pale"));
        Assert.assertFalse(oneWay.isOneEditAwaySeparate("pale", "bae"));
        Assert.assertFalse(oneWay.isOneEditAwaySeparate("geeks", "geeks"));
        Assert.assertFalse(oneWay.isOneEditAwaySeparate("peaks", "geeks"));

        Assert.assertTrue(oneWay.isOneEditAwayCombined("pale", "ple"));
        Assert.assertTrue(oneWay.isOneEditAwayCombined("pales", "pale"));
        Assert.assertFalse(oneWay.isOneEditAwayCombined("palesx", "pale"));
        Assert.assertTrue(oneWay.isOneEditAwayCombined("bale", "pale"));
        Assert.assertFalse(oneWay.isOneEditAwayCombined("pale", "bae"));
        Assert.assertFalse(oneWay.isOneEditAwayCombined("geeks", "geeks"));
        Assert.assertFalse(oneWay.isOneEditAwayCombined("peaks", "geeks"));
    }
}
