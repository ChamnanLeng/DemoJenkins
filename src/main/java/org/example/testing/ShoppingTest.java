package org.example.testing;
import org.junit.Test;
import org.junit.Before;

import org.example.aupp.Shopping;

import static org.junit.Assert.*;

public class ShoppingTest {

    private Shopping cart;

    @Before
    public void setUp() {
        cart = new Shopping();
    }

    @Test
    public void testAddAndRemoveItems() {

    }

    @Test
    public void testCalculateTotal() {

    }

    @Test
    public void testApplyDiscount() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDiscount() {

    }
}
