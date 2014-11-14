package com.ddylegowski.algopractice.datastructures;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ddylegowski.algopractice.datastructures.DataSource;
import com.ddylegowski.algopractice.datastructures.LeastRecentlyUsedCache;

class LeastRecentlyUsedCacheTest {

	LeastRecentlyUsedCache cache;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cache = new LeastRecentlyUsedCache(4, [ get: { hashCode -> return new Integer(hashCode*100)} ] as DataSource)
	}

	@After
	public void tearDown() throws Exception {
		cache.clear();
	}

	@Test
	public void test_contains() {
		assertFalse(cache.contains(1));
		Integer obj = (Integer)cache.retrieve(1);
		assertTrue(cache.contains(obj.hashCode()));
	}

	@Test
	public void test_isFull() {
		cache.retrieve(1);
		cache.retrieve(2);
		cache.retrieve(3);
		cache.retrieve(4);
		assertTrue(cache.isFull());
	}
	
	@Test
	public void test_retrieve_oneItem() {
		Object obj = cache.retrieve(1);
		assertNotNull(obj);
	}
	
	@Test
	public void test_retrieve_LRU_removed() {
		Object lru = cache.retrieve(1);
		Object obj2 = cache.retrieve(2);
		Object obj3 = cache.retrieve(3);
		Object obj4 = cache.retrieve(4);
		assertTrue(cache.contains(lru.hashCode()));
		Object obj5 = cache.retrieve(5);
		assertFalse(cache.contains(lru.hashCode()));
		assertTrue(cache.contains(obj2.hashCode()));
		assertTrue(cache.contains(obj3.hashCode()));
		assertTrue(cache.contains(obj4.hashCode()));
		assertTrue(cache.contains(obj5.hashCode()));
	}
	
	@Test
	public void test_clear() {
		Object obj = cache.retrieve(1);
		cache.clear();
		assertFalse(cache.contains(obj.hashCode()));
	}
}
