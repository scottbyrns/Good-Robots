package com.goodtech.robotics;

import java.util.HashMap;
import java.util.Map;

/**
 * Application Cache Utility
 */
public class Cache {

    private static Map<String, Object> memoryCache = new HashMap<String, Object>();

    /**
     * Store an entity for a key.
     *
     * @param key The cache key to store to.
     * @param entity The entity to store in the cache.
     * @param <EntityType> The type of the entity to cache.
     */
    public static <EntityType> void store(String key, EntityType entity)
    {
        memoryCache.put(key, entity);
    }

    /**
     * Get a stored entity for a key.
     *
     * @param key The key to get the stored entity for.
     * @param <EntityType> The type of the stored entity.
     * @return The stored entity for the provided key. Null if no value is stored for the provided key.
     */
    public static <EntityType> EntityType get (String key)
    {
        if (memoryCache.containsKey(key))
        {
            return (EntityType) memoryCache.get(key);
        }
        return null;
    }

}
