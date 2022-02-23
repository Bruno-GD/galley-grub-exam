package edu.poniperro.galleygrub.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemFactoryTest {

    @Test
    void getItem() {
        assertNotNull(ItemFactory.getItem("ITEM NAME", 1.0d));
        assertNotNull(ItemFactory.getItem("ITEM NAME", 1.0d));
    }

    @Test
    void testGetItem() {
    }
}