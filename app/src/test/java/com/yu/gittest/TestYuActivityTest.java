package com.yu.gittest;

import junit.framework.TestCase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yb on 2016/7/26.
 */
public class TestYuActivityTest extends TestCase {

    private Adder mAdder;

    @Override
    public void setUp() throws Exception {
        mAdder = new TestYuActivity();
        super.setUp();

    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(10,mAdder.add(5,5));
        assertEquals(Integer.MAX_VALUE + 1,mAdder.add(Integer.MAX_VALUE, 1));
        assertEquals(11,mAdder.add(6,5));
    }
}