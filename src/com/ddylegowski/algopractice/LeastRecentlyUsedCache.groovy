package com.ddylegowski.algopractice

/**
 * Interface for a DataSource that the Cache will use to retrieve data
 */
interface DataSource {
	public Object get(int hashCode);
}

/**
 * LeastRecentlyUsedCache is a data structure used to simulate an LRU cache, where the least recently used
 * items are discarded when the cache is full and new items are added to the cache.
 * This implementation has a time complexity of O(N) for retrieval, even with removing the lru item and adding a new item to the cache..
 */
class LeastRecentlyUsedCache {

	private HashMap<Integer, ListIterator> map;	//<hashCode, iterator to position in linkedlist>
	private LinkedList cache;
	private int maxSize;
	private DataSource dataSource;
	
	/**
	 * Constructor
	 * @param size The size of the cache
	 * @param dataSource The data source the cache reads from when it does not contain an item
	 */
	public LeastRecentlyUsedCache(int size, DataSource dataSource) {	
		this.map = [:];
		this.cache = new LinkedList();
		this.maxSize = size;
		this.dataSource = dataSource;
	}
	
	/**
	 * Retrieve the item from the cache given its hashCode
	 * @param hashCode
	 * @return
	 */
	public Object retrieve(Integer hashCode) {
		
		if (map.containsKey(hashCode)) {
			ListIterator it = map.get(hashCode);
			setItemMostRecentlyUsed(it);
		} else {
			addItemToCache(dataSource.get(hashCode));
		}
		
		return cache.first;
	}
	
	/**
	 * Return whether the cache contains an object based on its hashCode
	 * @param hashCode
	 * @return
	 */
	public boolean contains(Integer hashCode) {
		return map.containsKey(hashCode);
	}
	
	/**
	 * Returns if the cache is full
	 * @return
	 */
	public boolean isFull() {
		return cache.size == this.maxSize;
	}
	
	/**
	 * Clear the cache
	 */
	public void clear() {
		map.clear();
		cache.clear();
	}
	
	/**
	 * Add this item to the cache. Removes the lru item if the cache is full
	 * @param obj
	 */
	private void addItemToCache(Object obj) {
		
		//remove the last from cache and the map
		if (this.isFull()) {
			removeLeastRecentlyUsed();
		}
		
		cache.addFirst(obj);
		map.put(obj.hashCode(), cache.listIterator(0));
	}
	
	/**
	 * Sets the item as the most recently used
	 * @param it
	 */
	private void setItemMostRecentlyUsed(ListIterator it) {
		Object obj = it.next();
		it.remove();
		addItemToCache(obj);
	}
	
	/**
	 * Removes the least recently used item from the cache
	 */
	private void removeLeastRecentlyUsed() {
		map.remove(cache.last.hashCode());
		cache.removeLast();
	}
	
}
