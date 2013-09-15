package com.goodtech.robotics;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Test the cache.
 */
public class CacheTest {

    @Test
    public void testStore() throws Exception {
        Cache.store("Test Data", "asdf");
        assertTrue(((String)Cache.<String>get("Test Data")).equals("asdf"));
    }

    @Test
    public void testGet() throws Exception {
        Cache.store("Test Data", "asdf");
        assertNull(((String) Cache.<String>get("Bad Key")));
        assertTrue(((String)Cache.<String>get("Test Data")).equals("asdf"));
    }
}
